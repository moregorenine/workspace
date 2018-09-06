<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="${pageContext.request.contextPath}/js/users/users.js"></script>
<header class="main">
	<h2>Menu List</h2>
</header>

<h3>메뉴 목록</h3>
<div class="table-wrapper">
	<table>
		<thead>
			<tr>
				<th>Menu Id</th>
				<th>Menu Name</th>
				<th>url</th>
				<th>Reg Date</th>
				<th>Update Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${menus}" varStatus="status">
				<tr>
					<td>${item.menuId}</td>
					<td>${item.menuNm}</td>
					<td>${item.url}</td>
					<td>${item.regDt}</td>
					<td>${item.uptDt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<ul class="actions align-right">
		<li><a id="btnRegUser" href="#" class="button special small">사용자 추가</a></li>
	</ul>
</div>