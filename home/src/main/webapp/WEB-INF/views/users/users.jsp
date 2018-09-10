<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script src="${pageContext.request.contextPath}/js/users/users.js"></script>
<header class="main">
	<h2>User List</h2>
</header>

<h3>사용자 목록</h3>

<div class="table-wrapper">
	<table>
		<thead>
			<tr>
				<th>User Id</th>
				<th>system</th>
				<th>email</th>
				<th>Reg Date</th>
				<th>Update Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users}" varStatus="status">
				<tr>
					<td>${user.userId}</td>
					<td>${user.system}</td>
					<td>${user.email}</td>
					<td>${user.regDt}</td>
					<td>${user.uptDt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<ul class="actions align-right">
		<li><a id="btnRegUser" href="#" class="button special small">사용자 추가</a></li>
	</ul>
</div>