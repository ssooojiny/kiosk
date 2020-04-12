<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<ul>
	<c:if test="true">
		<li>로그인</li>
	</c:if>
	<c:if test="false">
		<li>로그아웃</li>
	</c:if>
</ul>
