package ua.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ua.entity.Music;
import ua.service.MusicService;

@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    MusicService musicService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/save")
    public ResponseEntity<Music> save(@RequestBody Music music){
        return new ResponseEntity<>(musicService.save(music),HttpStatus.CREATED);
    }

    @PostMapping("/save-file/{id}")
    public ResponseEntity<Music> savefile(@PathVariable Integer id,@RequestParam MultipartFile file){
        return new ResponseEntity<>(musicService.save(file, id),HttpStatus.CREATED);
    }


}
