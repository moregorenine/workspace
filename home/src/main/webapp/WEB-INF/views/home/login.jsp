<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script>
	
<%@include file="/js/home/login.js"%>
	
</script>

<h2>Login</h2>
<form:form method="POST" action="/users" modelAttribute="user">
	<div class="row uniform">
		<div class="12u$">
			<form:input path="email" placeholder="Email" />
		</div>
		<div class="12u$">
			<form:input path="password" type="password" placeholder="Password" />
		</div>
		<div class="12u$">
			<ul class="actions small align-right">
				<li><input type="submit" id="btnLogin" value="Login"
					class="small special" /></li>
			</ul>
		</div>
	</div>
</form:form>