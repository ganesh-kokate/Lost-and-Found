<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="./resources/CSS/Style.css">
<style>
        body {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh; /* 100% of the viewport height */
            margin: 0; /* Remove default body margin */
        }

    </style>
</head>
<body>
<div class="container1">
 <center><h4>Sign Up</h4></center> 
   <form action="process2" method="post">
    <div class="flex">
        <label for="name">Username</label>
        <input name="username" class="ip" type="text" placeholder="Enter your username">
    </div>
    
    <br>


    <div class="flex">
        <label for="email">Password</label>
        <input name="password" class="ip"  type="password" placeholder="Enter your password">
    </div>
    
        <div class="flex">
       <center> <input class="submit" value="Sign Up" type="submit"></center>
    </div>
    
   </form>
   <div style="margin-top: 10px" ><small><a href="login">alredy have a account !! sign in</a></small></div>
</div>
		
</body>
</html>