
<%@ include file="common/header.jspf"%>


	<p><font color="red">${errorMessage }</font></p>
	<p>
		
		<form action="/login" method="post">
			<label>Username:</label>
			<input type="text" name="nom">
			<label>Password</label>
			<input type="password" name="pass">
			<input type="submit">
		</form>
	</p>
</body>
<%@ include file="common/footer.jspf"%>