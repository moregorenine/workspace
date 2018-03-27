<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page session="false"%>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
<link rel="shortcut icon" href="<c:url value='/resources/favicon.ico'/>" type="image/x-icon" />
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<link type="text/css" rel="stylesheet" href="assets-editorial/css/main.css" />
<%-- <link type="text/css" rel="stylesheet" href="<c:url value='/css/tiles/layouts/default.css'/>" /> --%>
</head>
<body>

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Main -->
		<div id="main">
			<div class="inner">

				<!-- Header -->
				<header id="header">
					<a href="index.html" class="logo"><strong>Wait For
							Spring Rain</strong></a>
					<ul class="icons">
						<li><a href="#" class="icon fa-twitter"><span
								class="label">Twitter</span></a></li>
						<li><a href="#" class="icon fa-facebook"><span
								class="label">Facebook</span></a></li>
						<li><a href="#" class="icon fa-snapchat-ghost"><span
								class="label">Snapchat</span></a></li>
						<li><a href="#" class="icon fa-instagram"><span
								class="label">Instagram</span></a></li>
						<li><a href="#" class="icon fa-medium"><span
								class="label">Medium</span></a></li>
					</ul>
				</header>

				<!-- Content -->
				<section>
					<tiles:insertAttribute name="content" />
				</section>

			</div>
		</div>

		<!-- Sidebar -->
		<div id="sidebar">
			<tiles:insertAttribute name="sidebar" />
		</div>

	</div>

	<!-- Scripts -->
	<script src="assets-editorial/js/jquery.min.js"></script>
	<script src="assets-editorial/js/skel.min.js"></script>
	<script src="assets-editorial/js/util.js"></script>
	<!--[if lte IE 8]><script src="assets-editorial/js/ie/respond.min.js"></script><![endif]-->
	<script src="assets-editorial/js/main.js"></script>
</body>
</html>