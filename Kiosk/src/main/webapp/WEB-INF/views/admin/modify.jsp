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
        <h3>상품 수정</h3>
        
        <form action="/admin/register" method="post">
          <input type="hidden" name="gdId" id="gdId" value="${goods.gdId }"/>
          <div class="inputArea">
            <label>1차 분류</label>
            <select class="category" id="gdCate" name="gdCate">
              <option value="100">무기</option>
              <option value="200">탄</option>
              <option value="300">방어구</option>
              <option value="400">회복</option>
            </select>          
          </div>
            <div class="inputArea">
              <label>상품명</label>
              <input type="text" id="gdName" name="gdName" value="${goods.gdName }"/>
            </div>
            <div class="inputArea">
              <label>상품 가격</label>
              <input type="text" id="gdPrice" name="gdPrice" value="${goods.gdPrice }"/>
            </div>
            <div class="inputArea">
              <label>재고</label>
              <input type="text" id="gdStock" name="gdStock" value="${goods.gdStock }"/>
            </div>
            <div class="inputArea">
              <label>이미지</label>
              <input type="text" id="gdImg" name="gdImg" value="${goods.gdImg }"/>
              <div class="select_img"></div>
            </div>
            <div class="inputArea">
              <button type="submit" class="btn" id="modify_btn">수정</button>
            </div>
          </form>
        </div>
    </section>
    
    <footer class="footer">
      <div class="footer_box">
        <%@include file="include/footer.jsp" %>
      </div>
    </footer>
  </div>
<!-- 스크립트 -->
<script>
// 가격, 재고에 숫자만 허용하기
	var regExp = /[^0-9]/gi;
	
	function numCheck(selector){
	  var tempVal = selector.val();
	  selector.val(tempVal.replace(regExp,""));
	}
	
	$("#gdPrice").keyup(function(){ numCheck($(this)); });
	$("#gdStock").keyup(function(){ numCheck($(this)); });
	
</script>
</body>
</html>