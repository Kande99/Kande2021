
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

		<form action="/add-bicycle" method="post">
				year: <input type="text" name="year" />
				make: <input type="text" name="make" />
				model: <input type="text" name="mode" />
				picture: <input type="text" name="picture" />
				<input type="submit">
		</form>
	  
	<%@ include file="common/footer.jspf"%>
	