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
<!-- 不要删除 -->
<script type="text/javascript" src="<%=basePath%>/static/js/common/common-path.js"></script>
<title>英蓓-安全验证</title>
<script type="text/javascript">
$(document).ready(function(){
	$("#timer_id").one("click", function(){
		//发送邮件
		sendEmail();
	    //触发定时器，定时器回调函数里再使用one绑定div的点击事件
		sendValidate(60);
	})
})
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
	         <li class="mod-sub-list2 list2-active" style="font-size: 16px;">安全验证  </li>
	         <li class="mod-sub-list3" style="font-size: 16px;">重置密码 </li>
	       </ul>
	       <form id='findPwdForm' action="/gbdbas/UserPassword/checkEmailCheckUrl" method='post' onsubmit="return validateEmailCode()">
	       	<div> 
		       	<p class="account-info">为了你的帐号安全，请完成身份验证</p>   
		       	<div class="emailValidate">邮箱验证：</div> 
		       	<div class="clearfix pass-input-container"> 
			       	<label class="form-2-label">邮箱：</label> 
			       	<div class="form-2-content line-32" id="userEmail"> ${sessionScope.user.email} </div> 
		       	</div>
		       	<div class="form-2-item clearfix"> 
			       	<label class="form-2-label">验证证码：</label> 
			       	<div class="form-2-content pass-input-container vcode-container">
			       		<!-- 验证码 -->
				       	<input type="text" class="pass-input vcode-input" placeholder="邮箱验证码" name="sId" value="" id="pass-input-emailVcode"> 
				       	<div class="pass-button-timer" id="timer_id">发送验证码</div> 
				       	<span class="pass-input-stip" id="forgot-emailVcode-success"></span> 
				       	<span class="pass-input-msg" id="forgot-emailVcode-tip" style="display: none;">请填写验证码</span> 
			       	</div>
		       	</div>
		       	<div class="p-l80"> 
		       		<input type="submit" name="" value="下一步" class="pass-button-submit" id="submit"> 
		       	</div>
	       	</div>
	       </form>
	    </div>
	   </div>
   </div>
</body>
</html>