<!DOCTYPE HTML>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
<link rel="shortcut icon" href="<c:url value='resources/favicon.ico'/>" type="image/x-icon" />
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/html5up/editorial/assets/css/main.css" />
<!-- Scripts -->
<script src="${pageContext.request.contextPath}/html5up/editorial/tiles/layouts/layout.js"></script>
<script src="${pageContext.request.contextPath}/html5up/editorial/assets/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/html5up/editorial/assets/js/skel.min.js"></script>
<script src="${pageContext.request.contextPath}/html5up/editorial/assets/js/util.js"></script>
<!--[if lte IE 8]><script src="html5up/editorial/assets/js/ie/respond.min.js"></script><![endif]-->
<script src="${pageContext.request.contextPath}/html5up/editorial/assets/js/main.js"></script>
<script src="${pageContext.request.contextPath}/js/common/common.js"></script>
</head>

<body>
<input type="hidden"
	name="${_csrf.parameterName}"
	value="${_csrf.token}"/>

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Main -->
		<div id="main">
			<div class="inner">

				<!-- Header -->
				<tiles:insertAttribute name="header" />

				<!-- Content -->
				<section>
					<tiles:insertAttribute name="content" />
				</section>

			</div>
		</div>

		<!-- Sidebar -->
		<tiles:insertAttribute name="sidebar" />
		
	</div>
</body>
</html>