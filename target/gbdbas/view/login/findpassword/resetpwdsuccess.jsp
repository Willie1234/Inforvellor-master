<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<link rel="stylesheet" type='text/css' href="<%=basePath%>/static/css/login/findpwd.css">
<link rel="stylesheet" type='text/css' href="<%=basePath%>/static/css/easyui/icon.css">
<link rel="stylesheet" type='text/css' href="<%=basePath%>/static/css/easyui/easyui.css">
<script type="text/javascript" src="<%=basePath%>/static/js/jquery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/login/findpwd.js"></script>
<title>英蓓-重置密码成功</title>
</head>
<body>
   <!--主DIV-->
   <div class="all">
	   <!-- head -->
	   <div class="header">
	   </div>
	   <!-- body -->
	   <div class="sub">
	    <div class='titleLeft'>会员找回密码</div>
	    <div class='titleRight'>
	    </div>
	    <div class="find_div">
	       <ul class="mod-sub-nav">
	         <li class="mod-sub-list1" style="font-size: 16px;">确认帐号  </li>
	         <li class="mod-sub-list2" style="font-size: 16px;">安全验证  </li>
	         <li class="mod-sub-list3 list3-active" style="font-size: 16px;">重置密码 </li>
	       </ul>
	       <div class="mod-step-detail"> 
	       	<div class="result-info"> 
	       		<div class="result-message"> 
	       			<img src="/gbdbas/static/img/login/success_icon.png"> 
	       			<span style="font-size: 18px;">恭喜，平台账号${sessionScope.user.loginName }重置密码成功</span> 
	       			<div class="login_div_cls">
	       				<a class="result-title-btn" href="/gbdbas/UserPassword/login">直接登录</a> 
	       			</div>
	       		</div>
		   </div>
	    </div>
	   </div>
   </div>
</body>
</html>