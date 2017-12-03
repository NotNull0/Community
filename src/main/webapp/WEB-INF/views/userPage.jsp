
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Community</title>
    <link rel="stylesheet" href="../css/userPageStyle.css">
    <link href="boot/bootstrap.min.css" rel="stylesheet" media="screen">
    <link rel="stylesheet" href="../../../../fonts/font-awesome.min.css">
    <link rel="stylesheet" href="../boot/css/bootstrap.css">
    <script src="../../js/FormValidation.js"></script>
</head>


<div class="container">

    <div class="row profile">
        <div class="col-md-3">
            <div class="profile-sidebar">
                <!-- SIDEBAR USERPIC -->
                <div class="profile-userpic">
                    <img src="../image/cat.jpg" alt="../image/cat.jpg" onclick="generatePhotoSelect()">
                </div>
                <!-- END SIDEBAR USERPIC -->
                <!-- SIDEBAR USER TITLE -->
                <div class="profile-usertitle">
                    <div class="profile-usertitle-name">
                        ${user.name}
                        ${user.lastName}
                    </div>
                    <div class="profile-usertitle-job">
                        Java Developer
                    </div>
                </div>
                <!-- END SIDEBAR USER TITLE -->
                <!-- SIDEBAR BUTTONS -->
                <div class="profile-userbuttons">
                    <button type="button" class="btn btn-success btn-sm">Add to friend</button>
                    <button type="button" class="btn btn-danger btn-sm " onclick="generateSome()">Message</button>
                </div>
                <!-- END SIDEBAR BUTTONS -->
                <!-- SIDEBAR MENU -->
                <div class="profile-usermenu">
                    <ul class="nav">
                        <li class="active">
                            <a href="#">
                                <i class="glyphicon glyphicon-home"></i>
                                My page </a>
                        </li>
                        <li>
                            <a href="#" onclick="generateSome()">
                                <i class="glyphicon glyphicon-envelope"></i>
                                Message
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="glyphicon glyphicon-user"></i>
                                Friend </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="glyphicon glyphicon-facetime-video"></i>
                                Video
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="glyphicon glyphicon-music"></i>
                                Audio </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="glyphicon glyphicon-th-large"></i>
                                Gallery </a>
                        </li>

                        <li>
                            <a href="#" target="_blank">
                                <i class="glyphicon glyphicon-cog"></i>
                                Settings
                            </a>
                        </li>

                        <li>
                            <a href="#">
                                <i class="glyphicon glyphicon-flag"></i>
                                Help </a>
                        </li>
                        <li>
                            <a href="/logout">
                                <i class="glyphicon glyphicon-off"></i>
                                Log Out </a>
                        </li>
                    </ul>
                </div>
                <!-- END MENU -->
            </div>
        </div>
        <div class="col-md-9">
            <div class="profile-content" id="userContent">
                Тут контент юзера має <бути></бути>
                <button onclick="generateSome()"></button>
            </div>

        </div>
    </div>
</div>

<br>
<br>


</body>
</html>