<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@page import ="lostnfound.model.Itemdetails" %>
    <%@page import ="java.util.List" %>
    <%@ page import="java.util.Base64" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Item List</title>
   <link rel="stylesheet" href="./resources/CSS/Style.css">
</head>
<body>

<nav>
        <a href="home">Home</a>
        <a href="about">About</a>
        <a href="contact">Contact</a>
        <div class="animation"></div>
    </nav>
    <br><br>
<center class="devname"><h1>Find Your Item Here !!!</h1></center>
<div class="grid-container">
<%

List<Itemdetails> list = (List)request.getAttribute("list");

for(Itemdetails note:list)
{
	
	byte[] imageBytes = note.getImage();
    String base64Image = Base64.getEncoder().encodeToString(imageBytes);

 %>

<div class="list ">

<div  >
     <img class="listimg" src="data:image/png;base64, <%= base64Image %>">
    </div>
  <div class="listfoundby">
    <h3 class="card-title"><%=note.getName() %></h3>
    <h3 class="card-text"><%=note.getItem_name() %></h3>
     <h3 class="card-text"><%=note.getMob() %></h3>
     <h3 class="card-text"><%=note.getStd() %></h3>
    <h3 class="card-text"><%=note.getAdded_date() %></h3>
    </div>

  </div>


	<%
}


%>
</div>

</body>
</html>