<script>
<%@include file="/WEB-INF/views/users/signup.js"%>
</script>

<h2>Sign Up</h2>
<div class="row uniform">
	<div class="12u$">
		<input type="email" name="email" value="" placeholder="Email" />
	</div>
	<div class="12u$">
		<input type="password" name="password" value="" placeholder="Password" />
	</div>
	<div class="12u$">
		<input type="password" name="passwordConfirm" value=""
			placeholder="Password Confirm" />
	</div>
	<div class="12u$">
		<ul class="actions small align-right">
			<li><input type="button" id="btnSignUp" value="Sign Up"
				class="small special" /></li>
		</ul>
	</div>
</div>