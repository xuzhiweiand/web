<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<link rel="stylesheet" href="./res/css/bootstrap.min.css">
<link rel="stylesheet" href="./res/css/blog.css">

<script src="./res/js/jquery.min.js"></script>
<script src="./res/js/bootstrap.min.js"></script>
<title>和徐志伟</title>
</head>
<body style="height: 100%">
	<%@ include file="/WEB-INF/jsp/jspf/header.jspf"%>

	<div class="container">
		<div style="height: 100%">
		<form action="./validate" method="post" class="form-signin">
	        <h3 class="form-signin-heading">请登录</h3>
	        <input type="text" id="username" name="username" class="form-control login-input" placeholder="用户名" required autofocus>
	        <input type="password" id="password" name="password" class="form-control login-input" placeholder="密码" required>
	        <div class="checkbox">
	          <label>
	            <input type="checkbox" value="remember-me">记住我
	          </label>
	        </div>
	        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		</form>
		</div>
    </div>

    <footer class="blog-footer" style="position: absolute;bottom: 0px;width: 100%;">
      <span>copyright:xuzhiweiand, Email:xuzhiweiand@163.com</span>
    </footer>
</body>
</html>