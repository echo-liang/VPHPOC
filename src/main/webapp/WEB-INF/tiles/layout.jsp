<%@ include file="/WEB-INF/tiles/global-include.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">
<head>
<META HTTP-EQUIV="X-UA-Compatible" CONTENT="IE=Edge" />

<meta name="_csrf" content="${_csrf.token}"/>
<!-- default header name is X-CSRF-TOKEN -->
<meta name="_csrf_header" content="${_csrf.headerName}"/>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title><tiles:insertAttribute name="title" /></title>
<link rel="shortcut icon" href="${RootPath}/resources/img/favicon.ico" />
<link href="${RootPath}/resources/css/app.min.css" rel="stylesheet" media="all">
<link rel="stylesheet" href="${RootPath}/resources/css/jquery-ui.min.css">

<script src="${RootPath}/resources/js/jquery-3.2.1.min.js"></script>
<script src="${RootPath}/resources/js/jquery-ui.min.js"></script>
<script src="${RootPath}/resources/js/bootstrap3.3.7.min.js"></script>
<script src="${RootPath}/resources/js/datatables.min.js"></script>
<script src="${RootPath}/resources/js/bootbox.min.js"></script>
	
<script type="text/javascript" charset="utf-8">
   function debug_log(message) {
		if (window.console !== undefined && '${environment}' != 'PRD') {
			console.log(message);
		}
	}
</script>

</head>
<body>
	<div id="wrap">
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="nav" />
		<tiles:insertAttribute name="body" />
	</div>
	<tiles:insertAttribute name="footer" />	
	
	<%-- settings to add an environmental override --%>
	<c:set var="javascriptFileName" value="supportConsole.js" />
	<c:set var="overrideJavascriptFileName">
		<spring:eval expression="@environment.getProperty('javascriptFileName')" />
	</c:set>
	<c:if test="${not empty overrideJavascriptFileName}">
		<c:set var="javascriptFileName" value="${overrideJavascriptFileName}" />
	</c:if>
	<script src="${RootPath}/resources/js/${javascriptFileName}"></script>
	
	
</body>
</html>