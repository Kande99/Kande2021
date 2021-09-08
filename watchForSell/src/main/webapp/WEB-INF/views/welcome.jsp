
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>




	
	<h1>Welcome to My First ${name} Page From Saraya Tech</h1>
	

	<p>
		
		<table>
			<thead>
					<tr>
						<td>Image</td>
						<td>Year</td>
						<td>Make</td>
						<td>Model</td>
						
					</tr>
			</thead>
			<tbody>
			<c:forEach items="${watches}" var="watch">
				<tr>
					<td><img src = "${watch.image}" width="200" height="150" /></td>
					<td>${watch.year}</td>
					<td>${watch.make}</td>
					<td>${watch.model}</td>
					<td><a href="/delete.do?id=${watch.id}">Delete</a></td>
				</tr>
			</c:forEach>	
			</tbody>
			
			
		</table>
		<form action="/watch.do" method="post">
			<input type="text" name = "yr">
			<input type="text" name = "mk">
			<input type="text" name = "md">
			<input type="text" name = "im">
			<input type="submit" value="Add a Watch">
		</form>
	</p>
<%@ include file="../common/footer.jspf"%>