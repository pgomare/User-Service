<html>
<head>
<title>Registration Page</title>
</head>
<body>
    <font color="red">${errorMessage}</font>
    <form method="post">
    	ID : <input type="text" name="id" /><br>
        Name : <input type="text" name="name" /><br>
        Last Name : <input type="text" name="lname" /><br>
        City : <input type="text" name="city" /><br>
        Password : <input type="password" name="password" /> <br><br>
        <input type="submit" />
    </form>
   <br>  <a href="/login"> Click Here to Login  </a>
</body>
</html>