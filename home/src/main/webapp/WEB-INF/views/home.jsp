<%-- <%@ page session="false"%> --%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="${pageContext.request.contextPath}/js/home.js"></script>

<!-- Elements -->
<h2 id="elements">Think about website</h2>

<div class="row">
	<div class="6u 12u$(small)">
		<h3>Simple is the best</h3>
		<p>
			<span class="image right">
				<img src="${pageContext.request.contextPath}/images/home/speed.png" alt="" />
			</span>
			<strong>고객의 시간은 소중합니다.</strong><br>
			고객이 원하는 정보를 찾기 위해 시간을 허비하지 않도록 배려하세요.<br>
			그러기 위해 정보의 전달은 <strong>직관적이고 간결해야 하며</strong> 고객이 site를 이용하기 위한 학습을 최소화 합니다.<br>
		</p>
	</div>
	<div class="6u$ 12u$(small)">
		<h3>It works well</h3>
		<p>
			<span class="image right"><img
				src="${pageContext.request.contextPath}/images/home/workwell.png" alt="" />
			</span>
			<strong>잘 동작하여야 합니다.</strong><br>
			고객이 기대하고 예상한 결과를 <strong>정확하고 빠르게</strong> 전달되어야 합니다.<br>
			기능에 대한 신뢰는 위의 정확성과 속도가 얼마나 <strong>지속적이고 안정적이게 유지</strong>되느냐에 달려있습니다.
		</p>
	</div>
	<c:if test="${not empty logFail}">
	<input type="hidden" name="logFailMsg" value="${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message}">
	${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
	</c:if>
</div>