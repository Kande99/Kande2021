<%@ include file="../common/header.jspf"%>


	<p><font color="red">${errorMessage }</font></p>
	<p>
		<form action="/login.do" method="post">
  <fieldset>
  <legend>Basic Information:</legend>
		<form action="Login.do" method="post">  
Name:    <input type="text" name="nom"><br>  
Password:<input type="password" name="pass"><br>  
<input type="submit" value="login"> 
</fieldset>

 
</form>  
		
	</p>
</body>
<%@ include file="../common/footer.jspf"%>