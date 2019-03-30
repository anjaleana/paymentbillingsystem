<%-- 
    Document   : index
    Created on : Jul 10, 2018, 12:19:10 AM
    Author     : Anjali
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">

body {
  background: #456;
  font-family: 'Open Sans', sans-serif;
}

.login {
  width: 400px;
  margin: 16px auto;
  font-size: 16px;
}

/* Reset top and bottom margins from certain elements */
.login-header,
.login p {
  margin-top: 0;
  margin-bottom: 0;
}

/* The triangle form is achieved by a CSS hack */
.login-triangle {
  width: 0;
  margin-right: auto;
  margin-left: auto;
  border: 12px solid transparent;
  border-bottom-color: #28d;
}

.login-header {
  background: #28d;
  padding: 20px;
  font-size: 1.4em;
  font-weight: normal;
  text-align: center;
  text-transform: uppercase;
  color: #fff;
}

.login-container {
  background: #ebebeb;
  padding: 12px;
}

/* Every row inside .login-container is defined with p tags */
.login p {
  padding: 12px;
}

.login input {
  box-sizing: border-box;
  display: block;
  width: 100%;
  border-width: 1px;
  border-style: solid;
  padding: 16px;
  outline: 0;
  font-family: inherit;
  font-size: 0.95em;
}

.login input[type="username"],
.login input[type="password"] {
  background: #fff;
  border-color: #bbb;
  color: #555;
}

/* Text fields' focus effect */
.login input[type="username"]:focus,
.login input[type="password"]:focus {
  border-color: #888;
}

.login input[type="submit"] {
  background: #28d;
  border-color: transparent;
  color: #fff;
  cursor: pointer;
}

.login input[type="submit"]:hover {
  background: #17c;
}

/* Buttons' focus effect */
.login input[type="submit"]:focus {
  border-color: #05a;
}
/* The message box is shown when the user click on password button*/
#message
{
    display:none;
    background: #f1f1f1;
    color:#000;
    position: relative;
    padding: 20px;
    margin-top: 10px;
    
}
#message p
{
    padding: 10px 35px;
    font-size: 18px;
}
/*add a green text color and check mark when requirement is right*/
.valid
{
    color: green;
}
.valid:before
{
    position: relative;
    left: -35px;
    content: "Right"
        
}
.invalid
{
    color:red;
}
.invalid:before
{
    position: relative;
    left: -35px;
    content: "Wrong";
}
        </style>
    </head>
    <body>
    <form action = "Controller" method = "post">
        <div class="login">
            <div class="login-triangle"></div>
            <h2 class="login-header">Log In</h2>
            <form class="login-container">
                
                <p><input type ="text" name = "username" placeholder="Username" required></p>
                <p><input type="password" name = "password" placeholder= "password" required>
                </p>
                <p><input type ="submit" name = "login" value ="Log In"></p>
            </form> 
            </div>
            </form>
            

</body>
</html>