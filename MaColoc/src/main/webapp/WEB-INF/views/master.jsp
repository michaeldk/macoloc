<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
		<link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>"/>
		<link rel="stylesheet" type="text/css" href="<c:url value="/css/style.responsive.css"/>"/>
		<script src="<c:url value="jquery.js"/>"></script>
    	<script src="<c:url value="script.js"/>"></script>
    	<script src="<c:url value="script.responsive.js"/>"></script>
	</head>
<body>
	<div id="art-main">
    	<div id="art-hmenu-bg" class="art-bar art-nav">
    	</div>
    	<div class="art-sheet clearfix">
			<tiles:insertAttribute name="header"/>
			<tiles:insertAttribute name="body"/>
			<tiles:insertAttribute name="footer"/>
		</div>
	</div>	
</body>
</html>