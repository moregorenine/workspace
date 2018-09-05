<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script>
	
<%@include file="/js/home/login.js"%>
	
</script>

<h2>Login</h2>
<form:form method="POST" action="/loginProcess" modelAttribute="user">
	<div class="row">
		<div class="4u 12u$(medium)">
			<form:input path="email" placeholder="Email" />
		</div>
	</div>
	<div class="row uniform">
		<div class="6u$">
			<form:input path="email" placeholder="Email" />
		</div>
		<div class="6u$">
			<form:input path="password" type="password" placeholder="Password" />
		</div>
		<%-- <c:if test="${param.logFail eq 'true'}"> --%>
			<div class="6u$">
				${param.booleanPopLogin}
			</div>
		<%-- </c:if> --%>
		<div class="6u$">
			<ul class="actions small align-right">
				<li><input type="submit" id="btnLogin" value="Login"
					class="small special" /></li>
			</ul>
		</div>
	</div>
</form:form>