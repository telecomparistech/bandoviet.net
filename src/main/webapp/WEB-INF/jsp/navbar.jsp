<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<div class="navbar navbar-custom navbar-fixed-top">
	<div class="navbar-header">
		<a class="navbar-brand" href="/"><spring:message code="home.navbar.title"/></a> 
		<a class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> 
			<span class="icon-bar"></span> 
			<span class="icon-bar"></span> 
			<span class="icon-bar"></span>
		</a>
	</div>
	<div class="navbar-collapse collapse">
	
		<ul class="nav navbar-nav">		
			<%-- 
			<li class="language" lang="en"> <a href="#">English</a></li>
			<li class="language" lang="fr"><a href="#">Français</a></li>
			<li class="language" lang="vn"><a href="#">Tiếng Việt</a></li>
			 --%>
			 <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><font size="3">Bản đồ nhóm</font> <span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="#">Nhóm cô dâu Việt</a></li>
	            <li><a href="#">Nhóm Centre Parc</a></li>
	            <li><a href="#">Nhóm Télécom ParisTech</a></li>
	            <li role="separator" class="divider"></li>
	            <li><a href="#">Separated link</a></li>
	            <li role="separator" class="divider"></li>
	            <li><a href="#">Nhóm FA</a></li>
	            <li role="separator" class="divider"></li>
	            <li><a href="#">Tạo nhóm mới...</a></li>
	          </ul>
	        </li>
			 <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Bản đồ của bạn <span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li onClick="searchByType(this.value);" id="searchByfriendsmap">
								<a href="#"><spring:message code="home.navbar.friendsmap" /> </a>
							</li>
	 
	            <li role="separator" class="divider"></li>
	            <li><a href="#">Gia đình, họ hàng</a></li>
	            <li role="separator" class="divider"></li>
	            <li><a href="#">Địa chỉ cần nhớ</a></li>
	          </ul>
	        </li>	        
			<li>&nbsp;</li>
		</ul>
		<form class="navbar-form">
			<div class="form-group" style="display: inline;">
				<div class="input-group">
					<div class="input-group-btn">
						<button type="button" class="btn btn-default dropdown-toggle"
							data-toggle="dropdown">
							<span class="glyphicon glyphicon-chevron-down"></span>
						</button>
						<ul class="dropdown-menu">
							<li id="eventCategory" class="active">
								<a href="#"><spring:message	code="home.navbar.event" /></a>
							</li>
							<li>
								<a href="#"><spring:message code="home.navbar.news" /></a>
							</li>
							
							<li>
								<a href="#type=annoucement"><spring:message	code="home.navbar.annoucement" /> </a>
							</li>
							<li>
								<a href="#"><spring:message	code="home.navbar.restaurant" /> </a>
							</li>
							<li>
								<a href="#"><spring:message	code="home.navbar.administration" /></a>
							</li>
							<li>
								<a href="#"><spring:message	code="home.navbar.company" /></a>
							</li>
							<li>
								<a href="#"><spring:message	code="home.navbar.association" /></a>
							</li>
							<li>
								<a href="#"><spring:message	code="home.navbar.tourism" /></a>
							</li>
							<li>
								<a href="#"><spring:message code="home.navbar.sport" /></a>
							</li>
							<li>
								<a href="#"><spring:message	code="home.navbar.market" /></a>
							</li>
							<li>
								<a href="#"><spring:message	code="home.navbar.service" /></a>
							</li>
							<li>
								<a href="#"><spring:message	code="home.navbar.individual" /></a>
							</li>
							<li>
								<a href="#"><spring:message	code="home.navbar.usefulinfo" /></a>
							</li>
							<li>
								<a href="#"><spring:message	code="home.navbar.countries" /></a>
							</li>
						</ul>
					</div>
					<input id="keywords" type="text" data-provide="typeahead" class="form-control"
						placeholder=<spring:message	code="home.navbar.search.placeholder" />> 
						<div class="input-group-btn">							
							<button type="submit" class="btn btn-default">
								<span class="glyphicon glyphicon-search"></span> 
							</button>							
						</div>
						
						
				</div>
			</div>
		</form>
	</div>
</div>