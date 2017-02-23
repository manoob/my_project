<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login form</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
.dd{

		background-image: url("https://www.citibank.com.sg/gcb/credit_cards/images/overviewBanner/shopping_banner.jpg");
		background-repeat: no-repeat;
 		background-color: gray; 
}
/* 	body{ */
/* 		background-image: url("https://www.citibank.com.sg/gcb/credit_cards/images/overviewBanner/shopping_banner.jpg"); */
/* 		background-repeat: round; */
/* 		height: 100%; */
/* 		width: 100%; */
/* 	} */
</style>
</head>
<body>
<div>
<img alt="" src="http://www.weldones.com/img/banner-1.jpg" style="height: 700px;width: 1350px;">
	<div class="content-fluid ">
		<div class="row" style="margin-top: -700px;color: white;">
			<div class=" col-lg-3 col-lg-offset-9 col-md-3 col-md-offset-9  col-sm-3  col-xs-3  " >
			<font size="30px">Login Here</font>
						<div class="row">
						<form name="Login" method="post" action="login">
							<div class=" col-lg-4 col-md-4 col-sm-3  col-xs-3  " >
								
								<label>Username</label><br><br>
								<label>Password</label>
								<div class="form-group" style="margin-top: 25px">                        
                    		    	<input type="reset" value="Reset" class="btn btn-primary btn-sm"/><br>
                  				</div>
								
							</div>
							<div class=" col-lg-8 col-md-8 col-sm-3  col-xs-3  " >
								<div id="uname_div" class="form-group ">
                    		    	<input type="text"  placeholder="username" id="uname" required="" name="uname" class="form-control"/>
                 				</div>
                 	   			<div id="password_div" class="form-group ">
                    	    		<input type="password"  placeholder="password" id="password" required="" name="password" class="form-control"/>
                        		</div>
                        		<div class="form-group">
                  	    	  		<input type="submit"  value="Login" class="btn btn-success btn-sm" />
            					</div>
								<label>Yet Not Registered!!</label><br> <a href="registration_form">Register Here</a>
							</div>
						</form>   
						</div> 
			</div>
		</div>
	</div>
</div>
</body>
</html>