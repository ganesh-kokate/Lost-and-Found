<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="lostnfound.model.Itemdetails" %>
    <%@page import ="java.util.List" %>
    <%@ page import="java.util.Base64" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
<center class="devname"><h1>My Uploads!!!</h1></center>
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
    <h3 class="card-text"><%=note.getId() %></h3>
     <h3 class="card-text"><%=note.getMob() %></h3>
     <h3 class="card-text"><%=note.getStd() %></h3>
    <h3 class="card-text"><%=note.getAdded_date() %></h3>
    <div class="user">
    <button onclick="toggleForm()" type="submit">DELETE</button>
    </div>
    </div>

  </div>


	<%
}


%>
</div>

<div id="myForm" class="container2">
 <center><h4>Enter ItemID to Delete Item</h4></center> 
   <form  action="delete" method="post">
      <center>   <input name="itemid" class="ip" type="text" placeholder="Enter item id"></center>
    
    <br>
       <center> <input style="width: 100px" class="submit" value="Delete" type="submit"></center>
    
   </form>
</div>

<script>
        function toggleForm() {
            var form = document.getElementById("myForm");
            if (form.style.display === "none") {
      
                form.style.display = "block";
            } else {
                form.style.display = "none";
            }
        }
    </script>

</body>
</body>
</html>