<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<header class="main">
	<h2>User List</h2>
</header>

<h4>사용자 목록</h4>
<div class="table-wrapper">
	<table>
		<thead>
			<tr>
				<th>userId</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users}" varStatus="status">
			<tr>
				<td>${user.userId}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>