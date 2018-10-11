<!DOCTYPE HTML>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/zTree_v3/css/demo.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/zTree_v3/css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/zTree_v3/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/zTree_v3/js/jquery.ztree.core.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/zTree_v3/js/jquery.ztree.excheck.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/zTree_v3/js/jquery.ztree.exedit.js"></script>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/zTree_v3/js/jquery.ztree.excheck.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/zTree_v3/js/jquery.ztree.exedit.js"></script> --%>
<script src="${pageContext.request.contextPath}/js/menus/menusZtree.js"></script>
<script>
	var zNodes = ${jsZTrees};
</script>
</head>
<body>

<div id="zTree" class="ztree" style="background: #f0f6e4;"></div>

<div id="rMenu">
	<ul>
		<li id="m_add" onclick="addTreeNode();">Add Node</li>
		<li id="m_del" onclick="removeTreeNode();">Delete Node</li>
		<!-- <li id="m_check" onclick="checkTreeNode(true);">Check Node</li> -->
		<!-- <li id="m_unCheck" onclick="checkTreeNode(false);">Uncheck Node</li> -->
		<li id="m_reset" onclick="resetTree();">Resume zTree</li>
	</ul>
</div>

</body>
</html>