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
<script src="./res/editor/kindeditor.js"></script>
<script src="./res/editor/lang/zh_CN.js"></script>
<title>和徐志伟</title>
<script type="text/javascript">

	KindEditor.ready(function(K) {
		window.editor = K.create('#editor_id');
	});
	
</script>
</head>
<body>
	<%@ include file="/WEB-INF/jsp/jspf/header.jspf"%>
	<div class="container">
	<div class="row">
		<div class="col-sm-9 blog-main">
			<div class="blog-header">
				<h3 class="blog-title">写博客</h3>
				<p>记录你的思想，分享你的成果.</p>
			</div>
			<div class="blog-post">
				<form action="./pubBlog" method="post">
					<input type="text" name="blogTitle" class="form-control" style="margin-bottom: 10px;" placeholder="请输入博客标题">
					<textarea id="editor_id" name="blogContent" style="width: 100%;min-height: 300px;"></textarea>
					<input type="submit" value="发表" class="btn btn-primary btn-sm" style="margin-top: 10px;width: 100px;">
					<input type="button" value="取消" class="btn btn-warning btn-sm" style="margin-top: 10px;width: 60px;">
				</form>
				<hr>
			</div>
			<div class="blog-post">
			</div>
        </div>
        <div class="col-sm-3 blog-sidebar">
          <div class="sidebar-module sidebar-module-inset">
            <h1>介绍</h1>
            <p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>
          </div>
          <div class="sidebar-module">
            <h4>时间分类</h4>
            <ol class="list-unstyled">
              <li><a href="#">March 2014</a></li>
              <li><a href="#">February 2014</a></li>
              <li><a href="#">January 2014</a></li>
            </ol>
          </div>
        </div>
      </div>
    </div>
    <footer class="blog-footer" style="position: absolute;bottom: 0px;width: 100%;">
      <span>copyright@2015:xuzhiwei, Email:xuzhiweiand@163.com</span>
    </footer>
</body>
</html>