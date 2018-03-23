<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page session="false"%>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
<%-- <link href="<c:url value='/resources/css/layout.css' />" rel="stylesheet"></link> --%>
</head>
<body>
	<header id="header">
		<tiles:insertAttribute name="header" />
	</header>
	<section id="sidemenu">
		<tiles:insertAttribute name="menu" />
	</section>
	<section id="siteContent">
		<tiles:insertAttribute name="body" />
	</section>
	<footer id="footer">
		<tiles:insertAttribute name="footer" />
	</footer>
</body>
</html>