<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" href="./resources/CSS/Style.css">
<title>Find Item</title>

</head>
<body>


	<br>
	<br>
	<nav>
		<a href="home">Home</a> <a href="about">About</a> <a href="contact">Contact</a>
		<div class="animation "></div>
	</nav>
	<br>
	<br>
	<center class="devname">
		<h1 style="color: white;">Thank You For Returning !!!</h1>
	</center>
	<br>

		<div class="form-center " >
	<form  action="process" method="post" enctype="multipart/form-data">
	
	
			<div class="form-group row lbl ">
				<label for="inputEmail3" class=" col-sm-2 col-form-label">Name</label>
				<div class="col-sm-10 ">
					<input name="name" type="Text" class="form-control form-design "
						placeholder="type your full name">
				</div>
			
			</div>
			<div class="form-group row lbl">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Class</label>
				<div class="col-sm-10">
					<input name="std" type="Text" class="form-control form-design"
						id="inputEmail3" placeholder="type your class name">
				</div>
			</div>

			<div class="form-group row lbl">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Mob
					Num</label>
				<div class="col-sm-10">
					<input name="mob" type="tel" class="form-control form-design"
						placeholder="enter your mob no">
				</div>
			</div>

			<div class="form-group row lbl">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Item
					Name</label>
				<div class="col-sm-10">
					<input name="item_name" type="Text"
						class="form-control form-design" placeholder="type item name">
				</div>
			</div>

			<div class="form-group row lbl">
				<label for="inputPassword3" class="col-sm-2 col-form-label">Item
					Image</label>
				<div class="col-sm-10">
					<input name="item_image" type="file"
						class="form-control form-design" placeholder="upload image">
				</div>
			</div>

			<br>

			<div class="form-group row ">
				<div class="col-sm-10">
					<center>
						<button type="submit" class="btn btn-primary">Submit</button>
					</center>
				</div>
			
		</div>
	</form>
</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>