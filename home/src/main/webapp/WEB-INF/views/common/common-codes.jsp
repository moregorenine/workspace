<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="${pageContext.request.contextPath}/js/common/common-codes.js"></script>
<header class="main">
	<h2>Common Code</h2>
</header>

<h3>공통코드 목록</h3>
<div class="table-wrapper">
	<table>
		<thead>
			<tr>
				<th>Common Code</th>
				<th>Label(Kor)</th>
				<th>Label(En)</th>
				<th>Label(Ch)</th>
				<th>Description</th>
				<th>Update User</th>
				<th>Update Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${commonCodes}" varStatus="status">
				<tr>
					<td>${item.codeCode}</td>
					<td>${item.codeKor}</td>
					<td>${item.codeEn}</td>
					<td>${item.codeCh}</td>
					<td>${item.codeDesc}</td>
					<td>${item.uptUser}</td>
					<td>${item.uptDt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<ul class="actions align-right">
		<li><a id="btnRegUser" href="#" class="button special small">사용자 추가</a></li>
	</ul>
</div>