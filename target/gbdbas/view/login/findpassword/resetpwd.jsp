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
<title>英蓓-重置密码</title>
<script type="text/javascript">
//初始化页面
$(document).ready(function(){
	$('#password').focus(function(){ 
		$(this).removeClass('red_cls'); 
		//添加文本框样式
		$(this).addClass('blue_cls'); 
		//提示
		$("#pwd-msg").empty();
		$("#pwd-msg").append("只能包含字母、数字以及标点符号，长度为6～12");
		$("#pwd-msg").css("display","block");
	});
	$('#password').blur(function(){ 
		var password = $("#password").val();
		if(""==password)
		{
			$(this).removeClass('blue_cls'); 
			$("#password").addClass('red_cls'); 
			$("#pwd-msg").empty();
			$("#pwd-msg").append("请您填写密码");
			$("#pwd-msg").css("display","block");
		}
		else
		{
			$(this).removeClass('red_cls'); 
			$(this).removeClass('blue_cls'); 
			$("#pwd-msg").css("display","none");
		}
	});
	$('#verifypwd').focus(function(){
		$(this).removeClass('red_cls');  
		//添加文本框样式
		$(this).addClass('blue_cls'); 
		$("#verifypwd-msg").css("display","none");
	});
	$('#verifypwd').blur(function(){ 
		var verifypwd = $("#verifypwd").val();
		if(""==verifypwd)
		{
			$(this).removeClass('blue_cls'); 
			$("#verifypwd").addClass('red_cls'); 
			$("#verifypwd-msg").empty();
			$("#verifypwd-msg").append("请您输入确认密码");
			$("#verifypwd-msg").css("display","block");
		}
		else
		{
			$(this).removeClass('red_cls'); 
			$(this).removeClass('blue_cls'); 
			$("#verifypwd-msg").css("display","none");
		}
	});
});
</script>
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
		       <p class="step-form-tip m_l80">您正在找回的帐号是：${sessionScope.user.loginName }</p> 
		       <form action="/gbdbas/UserPassword/updatePwd" method="post" id="resetpwd-form" onsubmit="return validateUserPwd()"> 
		       	<div class="pass-input-container clearfix">
	       	        <label class="pass-input-title" for="password">新密码</label> 
	       	        <input type="password" class="pass-input left pass-input-error" name="password" id="password" value="" autocomplete="off"> 
	       	        <span class="pass-input-msg" id="pwd-msg" style="display: none;">请您填写密码</span> 
		       	</div> 
		       	<div class="pass-input-container clearfix"> 
		       		<label class="pass-input-title" for="repassword">确认新密码</label> 
		       		<input type="password" class="pass-input left pass-input-error" name="verifypwd" id="verifypwd" value="" autocomplete="off"> 
		       		<span class="pass-input-msg" id="verifypwd-msg" style="display: none;">请您输入确认密码</span> 
		       	</div> 
		       	<div class="m_l80"> 
		       		<input type="submit" name="" value="下一步" class="pass-button-submit" id="submit">  
		       	</div> 
		      </form> 
		   </div>
	    </div>
	   </div>
   </div>
</body>
</html>