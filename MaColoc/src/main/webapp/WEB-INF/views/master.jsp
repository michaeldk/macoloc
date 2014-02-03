<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta name="keywords" content="" />
		<meta name="description" content="" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
		<link href="http://fonts.googleapis.com/css?family=Signika:400,600,700" rel="stylesheet" type="text/css" />
		<link href="<c:url value="/css/bootstrap.css"/>" rel="stylesheet" type="text/css" media="all" />
		<link href="<c:url value="/css/default.css"/>" rel="stylesheet" type="text/css" media="all" />
		<script type="text/javascript" src="<c:url value="/js/jquery-1.7.1.min.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/js/jquery.dropotron-1.0.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/js/jquery.form.min.js"/>"></script>
		<script type="text/javascript" src="<c:url value="/js/init.js"/>"></script>
		<!--[if lte IE 7]>
		<link href="ie6.css" rel="stylesheet" type="text/css" />
		<![endif]-->
	</head>
<body class="homepage">
<div id="wrapper">
	<tiles:insertAttribute name="header"/>
	<div id="banner" class="container">
		<div id="image-banner"><img src="<c:url value="/images/homepage01.jpg"/>" width="920" height="250" alt="" /></div>
		<div id="banner-caption">
			<h2>Pour que votre coloc'</h2>
			<p class="text1">ne vous regarde plus</p>
			<p class="text2">avec une envie de meurtre</p>
		</div>
	</div>
	<div id="page" class="container">
		<tiles:insertAttribute name="body"/>
	</div>
</div>
<tiles:insertAttribute name="footer"/>
</body>
</html>