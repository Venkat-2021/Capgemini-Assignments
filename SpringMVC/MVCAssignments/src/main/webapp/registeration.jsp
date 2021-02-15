<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<header>Register Here..</header>
<form action="regestration" method="post" >
	<p>
		User name:<input type="text" name="username"><br>
		
	<p>	
		Password:  <input type="password" name="password"><br>
	<p>	
		Email:     <input type="email" name="email" ><br>
	<p>
		Contact:     <input type="text" name="contact" ><br>
	<p>
		City:     <input type="text" name="city" ><br>	
	<p>
		ZipCode:     <input type="text" name="zipCode" ><br>	
	<p></p>		
	<input type="submit">
</form>
</body>
</html>
