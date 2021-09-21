
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

	<h1>Best bicycle ever</h1>
	<table>
			<thead>
					<tr>
						<td>Image</td>
						<td>Year</td>
						<td>Make</td>
						<td>Model</td>
						<td>Delete</td>
					</tr>
			</thead>
			<tbody>
			<c:forEach items="${bicycles}" var="bicycle">
				<tr>
					<td><img src = "${bicycle.image}" width="100" height="100" /></td>
					<td>${bicycle.year}</td>
					<td>${bicycle.make}</td>
					<td>${bicycle.model}</td>
					<td><a href= "/delete-bicycle?id=${bicycle.id}">Delete</a></td>
				</tr>
			</c:forEach>	
			</tbody>
				
			
		</table>
	
	 <a href="/add-bicycle">Add a bicycle</a> 
<%@ include file="common/footer.jspf"%>