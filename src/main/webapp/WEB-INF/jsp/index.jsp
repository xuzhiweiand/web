<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<script type="text/javascript">
	$(function(){
		initCurrentTime();
	});
	
	Date.prototype.getFormattedDate = function(pattern){
		function getFullStr(i){
	        return i>9?""+i:"0"+i;
	    }
		pattern = pattern.replace(/yyyy/,this.getFullYear())
	    .replace(/MM/,getFullStr(this.getMonth()+1))
	    .replace(/dd/,getFullStr(this.getDate()))
	    .replace(/hh/,getFullStr(this.getHours()))
	    .replace(/mm/,getFullStr(this.getMinutes()))
	    .replace(/ss/,getFullStr(this.getSeconds()));
		return pattern;
	}
	function initCurrentTime() {
		$("#currenTime").text((new Date()).getFormattedDate("yyyy年MM月dd日 hh:mm:ss"));
		setTimeout(function() {initCurrentTime();}, 1000);
	}
</script>
</head>
<body>
	<%@ include file="/WEB-INF/jsp/jspf/header.jspf"%>
	<div class="container">
		<div class="row">
			<div class="col-sm-9 blog-main">
				<div class="blog-header">
					<h1 class="blog-title">生活如此美好，怎么舍得不记录下来。。.</h1>
				</div>
				<hr>
				<div class="blog-post">
					<c:forEach items="${pageInfo.objects}" var="webBlog">
						<div class="blog-div">
							<div class="blog-title-div">
								<h4 class="blog-title">
									<a>${webBlog.blogTitle }</a>
								</h4>
							</div>
							<div class="blog-content-div">
								<p class="blog-content">${webBlog.blogContent }</p>
							</div>
							<div class="blog-info-div">
								<p class="blog-info"><fmt:formatDate value="${webBlog.blogCreateTime}" type="date"/></p>
							</div>
						</div>
					</c:forEach>
				</div>
				<div class="blog-post">
					<div class="blog-div text-center">
						<a>加载更多...</a>
					</div>
				</div>
			</div>
			<div class="col-sm-3 blog-sidebar">
				<div class="sidebar-module">
					<h5 style="margin-top: 20px;color: #0000FF;text-align: center;"><span id="currenTime"></span></h5> 
				</div>
				<div class="sidebar-module sidebar-module-inset">
					<h4>关于</h4>
					<p>
						和徐志伟是一个帮助你记录你生活点滴的网站。这里有技术日记、生活日记，可以帮助你，你也可以帮助别人。
					</p>
				</div>
				<div class="sidebar-module">
					<h4>时间标签</h4>
					<ol class="list-unstyled">
						<li><a href="#">March 2014</a></li>
						<li><a href="#">February 2014</a></li>
						<li><a href="#">January 2014</a></li>
					</ol>
				</div>
			</div>
		</div>
	</div>
	<footer class="blog-footer">
		<span>copyright@2015:xuzhiwei, Email:xuzhiweiand@163.com</span>
	</footer>
</body>
</html>