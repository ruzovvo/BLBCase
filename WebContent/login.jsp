<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Buy Local Bonds</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet" media="screen" type="text/css">
  </head>
  <body>
   	 <div class="container">
     	 <h1>Buy Local Bonds</h1>
    	 <h4 class="text-center">Login</h4>
     	 <form class="form-horizontal" name="clickSignIn" action="LoginServlet" method="post">
         	 <div class="control-group">
        	    <label class="control-label" for="inputEmail">Login:</label>
        	    <div class="controls">
           		   <input type="text" name="username" placeholder="e-mail">
           		</div>
          	</div>
          	<div class="control-group">
            	<label class="control-label" for="inputPassword">Password:</label>
            	<div class="controls">
              		<input type="password" name="pwd" placeholder="password">
            	</div>
         	</div>
          	<div class="control-group">
             	<div class="controls">
              		<input type="submit" class="btn" value="Sign in"/>
             	</div>
          	</div>
        </form>
    </div>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>