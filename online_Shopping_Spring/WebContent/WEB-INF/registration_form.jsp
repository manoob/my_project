<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>



</head>
<body style="background-color:#2599E7;">
<div class="content-fluid " >
	<div   style="background: linear-gradient( #fefeff,#800000); height: 700px;">
		<div class="row">
			<div class=" col-lg-12 col-md-12   col-sm-12  col-xs-12 text-center "  style=" background: linear-gradient(#800000,#fefeff);" >
				<div style="margin-top: 17px">
						<label style=" color: white; font-size: 30px; font-family: " ><b>CUSTOMERS REGISTRATION FORM</b></label>
				</div>
			</div>
		</div>
		<div class="row" style="margin-top: 20px;">
			<div class=" col-lg-3 col-md-3   col-sm-3  col-xs-3  " >
			
			</div>
			<div class=" col-lg-2 col-md-   col-sm-2  col-xs-2  " >
				<br><label>First name :</label><br><br>
				<label>Last name :</label><br><br>
				<label>Gender :</label><br><br>
				<label>Address :</label><br><br><br><br><br><br>
				<label>Email ID :</label><br><br>
				<label>Password :</label><br><br>
				<label>Upload files here :</label>
			</div>
				<div class=" col-lg-3 col-md-3   col-sm-3  col-xs-3  " >
				<form  name="Registration"  method="POST" action="registration" enctype="multipart/form-data" >
			
						<div id="fname_div" class="  form-group  "  >
							<input type="text"  placeholder="First name" id="fname" required=""   name="fname" class="form-control "  />
						</div>
						<div id="lname_div" class="form-group "   >	
							<input type="text"  placeholder="Surname" id="lname" required="" name="lname" class="form-control "/>
						</div>
						<div id="gender_div" class="form-group "   >	
							<input type="radio" id="male" name="gender" value="Male" checked="true"/>Male<input type="radio"  id="female" name="gender" value="Female" />Female
						</div>
						<div id="address_div" class=" form-group " >
							<textarea rows="5" cols="1" placeholder="Full address" id="address" required="" name="address" class="form-control" ></textarea>
						</div>
						<div id="email_div" class=" form-group " >
							<input type="text"   placeholder="Email address" required="" name="email" id="email" class="form-control " />
						</div>
						<div id="password_div" class="form-group " >
							<input type="password"  placeholder="New password" required="" name="password" id="password" class="form-control "/>
						</div>
						<div id="file_div" class=" form-group " >
							<input style="height: 100px" type="file" name="file" id="file" class="form-control "/>
						</div>
						<div class="form-group  " >
							<input type="submit" class="btn btn-success col-lg-offset-3 col-md-offset-3 col-lg-6 col-md-6   col-sm-6  col-xs-6 " name="name" value="Submit"  />
						</div>
				</form>
					

			</div>
			
		</div>
	</div>
</div>

</body>
</html>