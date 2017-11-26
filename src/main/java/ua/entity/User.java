package ua.entity;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ua.entity.enums.UserRole;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@AllArgsConstructor
@ToString
@Entity
@Table(name = "_USER_")
public class User implements UserDetails{
    //implements UserDetails - секюрете
    //paternMVC
    //JAVA8//stream

    public User(){}


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter@Setter private int id;

    @Getter@Setter private boolean isEnabled;

    @Getter@Setter private String name;

    @Getter@Setter private String lastName;

    @Getter@Setter private int age;

    @Getter@Setter private String phoneNumber;

    @Getter@Setter private String email;

    @Getter@Setter private LocalDateTime dateOfBirth;

    @Getter@Setter private String address;

    @Getter@Setter private String password;

    @Getter@Setter private String mainPhoto;

    @Enumerated
    @Getter@Setter private UserRole role;


    @ManyToOne
    @Getter@Setter private Country userCountry;

    @ManyToMany
    @JoinTable(name = "GROUP_FROM_USER",joinColumns = @JoinColumn(name = "ID_USER"),inverseJoinColumns = @JoinColumn(name = "ID_GROUP"))
    @Getter@Setter private List<Group> groupList;

    @ManyToMany
    @JoinTable(name = "MUSIC_FROM_USER",joinColumns = @JoinColumn(name = "ID_USER"),inverseJoinColumns = @JoinColumn(name = "ID_MUSIC"))
    @Getter@Setter private List<Music> musicList;

    @ManyToMany
    @JoinTable(name = "PHOTO_FROM_USER",joinColumns = @JoinColumn(name = "ID_USER"),inverseJoinColumns = @JoinColumn(name = "ID_PHOTO"))
    @Getter@Setter private List<Photo> photoList;

    @ManyToMany
    @JoinTable(name = "USER_MESSAGE",joinColumns = @JoinColumn(name = "ID_USER"),inverseJoinColumns = @JoinColumn(name = "ID_MESSAGE"))
    @Getter@Setter private List<Message> messageList;

    @OneToMany(mappedBy = "user")
    @Getter@Setter private List<Post> postList;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(role.name()));
        return authorities;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}
