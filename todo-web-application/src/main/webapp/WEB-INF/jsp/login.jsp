<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div id="error-message" style="color:red">${errorMessage}</div>
	<form method="post">
		Name : <input type="text" id="name" name="name" /> Password : <input
			type="password" id="password" name="password" /> <input id="submit" type="submit" />
	</form>
</div>
<%@ include file="common/footer.jspf"%>