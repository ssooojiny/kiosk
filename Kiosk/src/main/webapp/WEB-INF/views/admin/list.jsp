<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BUBG</title>
<!-- jQuery -->
<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>

<body>
  <div class="root">
    <header class="header">
      <div class="header_box">
        <%@ include file="include/header.jsp" %>
      </div>
    </header>
    
    <nav class="nav">
      <div class="nav_box">
        <%@ include file="include/nav.jsp" %>
      </div>
    </nav>
    
    <section class="container">
      <aside>
        <%@ include file="include/aside.jsp" %>
      </aside>
      
      <div class="container_box">
        <h3>상품 관리</h3>
        <table class="tbl_goods">
          <thead>
            <tr>
              <th>썸네일</th>
              <th>카테고리</th>
              <th>이름</th>
              <th>가격</th>
              <th>재고</th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            <c:forEach items="${goodsList }" var="list">
              <tr>
                <td><img src="${list.gdThumbImg }"/></td>
                <td>${list.gdCate }</td>
                <td><a href="/admin/view?n=${list.gdId }">${list.gdName }</a></td>
                <td>${list.gdPrice }</td>
                <td>${list.gdStock }</td>
                <td>삭제</td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
        
        <div class="buttons">
          <input type="button" value="상품 등록" onClick="location.href='./register'"/>
        </div>
      </div>
    </section>
    
    <footer class="footer">
      <div class="footer_box">
        <%@include file="include/footer.jsp" %>
      </div>
    </footer>
  </div>
</body>
</html>