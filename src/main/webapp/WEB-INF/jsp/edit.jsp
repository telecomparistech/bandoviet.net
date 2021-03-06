<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title><spring:message code="application.title"/></title>
<meta name="generator" content="Bootply" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="author" content="Le Quoc Anh - PhD in Computer Science - Telecom ParisTech, France"> 
<meta name="description" content="Ban do nguoi Viet Nam tren the gioi, Viet kieu, the map of Vietnamese people in the world">
    	
<link href="css/bootstrap.min.css" rel="stylesheet">
<%--<link href="css/bootstrap-combined.min.css" rel="stylesheet"> --%>

<link rel="stylesheet" type="text/css" href="css/jquery.datetimepicker.css"/>
<!--[if lt IE 9]>	<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>	<![endif]-->
<link href="css/styles.css" rel="stylesheet">
<link rel="stylesheet" href="libs/jquery-ui.min.css">	
<link href="libs/summernote/summernote.css" rel="stylesheet">
<link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" rel="stylesheet">
<link rel="icon" type="image/png" href="/img/map.png"> <!-- http://www.favicon.cc -->
</head>
<body>

<div id="fb-root"></div>

	<!-- begin view -->
	<jsp:include page="about.jsp" />
	
	<jsp:include page="feedback.jsp" />
	<jsp:include page="createtype.jsp" />
	
	<jsp:include page="selectCountry.jsp" />
	
	<jsp:include page="navbar.jsp" />

	<%--<div id="map-canvas" style="width:33%;"></div>
	
	<div class="newplace addbutton">+</div> --%>
	
	<div class="my_location"><spring:message code="home.map.mylocation" /></div>
	
	<jsp:include page="mylocationalert.jsp" />

	<jsp:include page="newplaceform.jsp" />
	<!-- end view -->

	<!-- script references -->
	<script	src="js/jquery.js"></script>
	<script	src="libs/jquery.validate.js"></script>
	<script src="js/jquery.datetimepicker.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="http://maps.googleapis.com/maps/api/js?extension=.js&output=embed&amp;language=en&amp;v=3.exp&libraries=places"></script>
 
 	<script src="/js/detectmobilebrowser.js"></script>
    <script src="js/cookie.js" type="text/javascript"></script>
    
    <script src="js/lang.js"></script>
    <script src="js/edit.js"></script>
    <%-- <script src="js/mapService.js"></script> --%>
	
	
	<script type="text/javascript" src="js/search.js"></script>
	<script type="text/javascript" src="js/newplace.js"></script>
	<%-- <script src="js/item.js" type="text/javascript"></script> --%>
	<script src="js/app.js" type="text/javascript"></script>
	
	
	<script type="text/javascript" src="libs/jquery-ui.min.js"></script>
	<script type="text/javascript" src="libs/summernote/summernote.min.js"></script>
	<script src="libs/summernote/lang/summernote-vi-VN.js"></script>
	<script type="text/javascript" src="js/avim.js"></script>
</body>
</html>