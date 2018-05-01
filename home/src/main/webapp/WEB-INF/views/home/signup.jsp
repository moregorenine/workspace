<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<script>
	
<%@include file="/js/home/signup.js"%>

</script>

<h2>Sing Up</h2>
<form:form method="POST" action="/users" modelAttribute="user">
	<div class="row uniform">
		<div class="12u$">
			<form:input path="system" />
		</div>
		<div class="12u$">
			<form:input path="email" placeholder="Email" />
		</div>
		<div class="12u$">
			<form:input path="password" type="password" placeholder="Password" />
		</div>
		<div class="12u$">
			<input type="password" name="passwordConfirm" value=""
				placeholder="Password Confirm" />
		</div>
		<div class="12u$">
			<ul class="actions small align-right">
				<li><input type="submit" id="btnSignUp" value="Sign Up"
					class="small special" /></li>
			</ul>
		</div>
	</div>
</form:form>