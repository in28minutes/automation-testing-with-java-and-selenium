<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<table class="table table-striped" id="todos-list">
		<caption>Your todos are</caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td id="desc-${todo.id}">${todo.desc}</td>
					<td id="targetdate-${todo.id}"><fmt:formatDate
							value="${todo.targetDate}" pattern="dd/MM/yyyy" /></td>
					<td><a type="button" class="btn btn-success"
						href="/update-todo?id=${todo.id}" id="update-${todo.id}">Update</a></td>
					<td><a type="button" class="btn btn-warning"
						href="/delete-todo?id=${todo.id}" id="delete-${todo.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<a class="button" href="/add-todo">Add a Todo</a>
	</div>
</div>

<%@ include file="common/footer.jspf"%>