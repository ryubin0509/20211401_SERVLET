<header>
<%@ page import="example.*" %>
</header>
<%@ page contentType="text/html; charset=utf-8"%>

1  <footer class="container">
     <p> <br> &copy; 쇼핑몰 대표 : 홍길동, 고유번호 : 20111234, 연락처 : bin00509@sungkyul.ac.kr<br> 
        <%
    	ShopTime time = new ShopTime();
         %>    
        오늘 날짜와 시간 : <%=time.timenow() %>
        </p>
	</footer>cp tomcat-users.xml tomcat-user_back.xml
