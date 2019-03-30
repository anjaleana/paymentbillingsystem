<%@include file="header.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  body
  {
	  font-family:Times And NewRoman;
	
  }
  .container
  {
      padding:16px;
      background-color:white;
  }
   input[type=text],input[type=password],input[type=email],input[type=textarea]
   {
      
      background-color:#f1f1f1;
   
   }
  input[type=text]:focus,input[type=password]:focus,input[type=email]:focus,input[type=textarea]:focus
  {
     background-color:#ddd;
     outline:none;
  
  }
  
 .btnbtndefault
  {
         background-color: #4CAF50;
          color: white;
          width: 100%;
          cursor:pointer;
         opacity:0.9;
         font-size:30px;
   }
   .btnbtndefault:hover
   {
       opacity:1
   }
  </style>
</head>
<body>
<form action ="Accountant_Controller" method = "post">
<div class="container">
    <div class="form-group">
      <label for="fname">Full Name:*</label>
      <input type="text" class="form-control" id="fname" placeholder="Enter Full Name" name="fname" required/>
    </div>
    <div class="form-group">
      <label for="mname">Middle Name:</label>
      <input type="text" class="form-control" id="mname" placeholder="Enter Middle Name" name="mname">
    </div>
    <div class ="form-group">
    <label for ="lname">Last Name:*</label>
    <input type ="text" class ="form-control" id ="lname" placeholder = "Enter Last Name" name ="lname" required/>
    </div>
    <div class ="radio">
    <label for ="gender">Gender:*</label><br/>
    <input type ="radio" value = "Male" name ="gender1" checked>Male</input><br/>
    <input type ="radio" value = "Female" name ="gender1">Female</input>
    
    </div>
   
    <div class ="form-group">
    <label for ="date">Date of Birth:*</label>
    <input type ="date" class = "from-control" id ="dob" placeholder ="Enter the date of birth" name ="date" required/>
    </div>
    <div class = "form-group">
    <label for = "nationality">Nationality:</label>
    <select class ="form-control" id = "nationality" name = "nationality">
    
    <option>Indian</option>
    
    </select>
    </div>
    <div class ="form-group">
    <label for = "email">Email:*</label>
    <input type = "email" class="form-control" id ="email" placeholder="Enter the email" name = "email" required/>
    </div>
    <hr>
    <h3>Customer Address*</h3>
    <div class ="form-group">
    <label for ="address">Address:</label>
    <textarea class= "form-control" type="textarea" id ="address" placeholder="Enter the address" name="address" required></textarea>
    </div>
    <div class="form-group">
    <label for ="country">City:*</label>
    <select class ="form-control" id ="country" name ="country">
    <option>Delhi</option>
    <option>Lucknow</option>
    <option>Varansi</option>
    <option>Bangalore</option>
    <option>Kanpur</option>
    <option>Allahabad</option>
    <option>Bareilly</option>
    <option>Ballia</option>
    <option>Hydrabad</option>
    <option>
    </select>
    </div>    
         <hr>
         <h3>Login Details</h3>
         <div class ="from-group">
         <label for="username">Username:*</label>
         <input type ="text" class = "form-control" id ="username" placeholder ="Enter the username" name="username" required/>
         </div>
         <div class ="form-group">
         <label for ="password">Password:*</label>
         <input type ="password" class ="form-control" id ="password" placeholder="Enter the password" name="password" required/>
         </div>
    
    <button type ="submit" class ="btnbtndefault">Submit</button>
    
 
</div>
</form>
</body>
</html>
