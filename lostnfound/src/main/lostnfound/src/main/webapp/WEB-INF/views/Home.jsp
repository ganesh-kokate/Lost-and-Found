<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Find My Item</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="./resources/CSS/Style.css">
</head>

<body>
<div class="first">
<div class="logo"> <h1>Lost&Found</h1>
</div>
<div class="user"><h1>${user2.username}</h1></div>
</div>
    <nav>
        <a href="#">Home</a>
        <a href="about">About</a>
        <a href="contact">Contact</a>
        <div class="animation start-home"></div>
    </nav>
    <br><br>
    
 
    <div class="cards">
        <a href="find">
            <div class="card">
                <img src="./resources/IMAGES/return.png" alt="">
                <h4>Return Item</h4>

            </div>
        </a>
        <div>
            <a href="itemlist">
                <div class="card">
                    <img src="./resources/IMAGES/find.png" alt="">
                    <h4>Search Item</h4>

                </div>
            </a>
        </div>
    </div>
    <br><br>
    
    <div class="bottomcard">
        <div>
            <a href="home">
                <h2>Item Finder</h2>
            </a>
            <a href="home">
                <h3>Home</h3>
            </a>
            <a href="about">
                <h3>About</h3>
            </a>
            <a href="contact">
                <h3>Contact</h3>
            </a>
            <a href="find">
                <h3>Return Item</h3>
            </a>
            <a href="itemlist">
                <h3>Search Item</h3>
            </a>
        </div>
        <div class="dev">
            <h1>Developed By</h1>
            <div class="devname">
                <h2>Ganesh Kokate & Siddhesh Kamble</h2>
            </div>
        </div>
    </div>
    
    
    

    <!-- <script src="" async defer></script> -->
</body>

</html>