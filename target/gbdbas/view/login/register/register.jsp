<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<link rel="stylesheet" type='text/css' href="<%=basePath%>/static/css/easyui/easyui.css">
<link rel="stylesheet" type='text/css' href="<%=basePath%>/static/css/login/register.css">

<script type="text/javascript" src="<%=basePath%>/static/js/jquery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"	src="<%=basePath%>/static/js/artdialog/artDialog.source.js?skin=twitter"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/artdialog/artdialogopen.js"></script>

<script type="text/javascript" src="<%=basePath%>/static/js/login/regest.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/common/check.js"></script>
<title>英蓓-注册</title>
<script type="text/javascript">
$(document).ready(function(){
	myRandReload();
	$("#ug").css("display","none");
	checkStatus=true;
	$('#loginName').validatebox({    
	    required: true,   
	    validType: ['account[4,12]',"remote['/gbdbas/userSon/checkUserSonName','loginName']"],
	    missingMessage:'账号必须由英文字母、数字(0-9)、汉字组成，长度在4-12个字符之间。',
	    delay:300
	}); 
	$('#loginPassword').validatebox({    
	    required: true,    
	    validType: 'passwd[6,20]',
	    missingMessage:'只能包含字母、数字以及标点符号，长度为6～12。'
	}); 
	$('#email').validatebox({    
	    required: true,    
	    validType: 'myEmail',
	    missingMessage:'邮箱不能为空'
	}); 
	//关键激活窗口时刷新验证码
	$('#activeDiv').dialog({
	    onClose:function(){
	    	myRandReload();
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
	    <div class='titleLeft'>会员注册中心</div>
	    <div class='titleRight'>
	    	<div class='imgDiv'><a href="/gbdbas/view/login/infobase/login.jsp" target="_self"><img src="/gbdbas/static/img/login/login.png"/></a></div>
	    	<div class='textDiv'>我已注册，现在就</div>
	    </div>
	    <div class="mainDiv">
	       <form id='regestForm' action="/gbdbas/userRegest" method='post'>
	         <div class='formDiv'>
	         	 <ul>
	         	  <li>
	         	    <div class='a_text'>用户名:</div>
	         	    <div class="a_input">
						<div>
						   <input id="loginName" name="loginName" class="inputbox" /> 
			            </div>
	         	    </div>
	         	  </li>
	         	  <li>
		         	  <div class='a_text'>密码:</div>
		         	    <div class="a_input">
							<div>
								<input name="loginPassword" id="loginPassword" type="password" class="inputbox" />
				            </div>
		         	    </div>
	         	  </li>
	         	  <li>
	         	   <div class='a_text'>邮箱:</div>
	         	    <div class="a_input">
						<div>
							<input name="email" id="email" type="text" class="inputbox" />
			            </div>
	         	    </div>
	         	  </li>
	         	  <li>
	         	   <div class='a_text'>验证码:</div>
	         	    <div class="a_input">
						<div style='float:left;'>
							<input name="checkCode" id="checkCode"  onfocus="clearMessage()"  type="text" style="width:85px;" class="inputbox" />
			            </div>
			            <div class='a_img'>
				   							<a href="#" onClick="javascript:myRandReload()"  title="看不清，从重新生产" > 
												<img align="bottom" id="createcheckcode" style="width:100px;height:28px;" border="0">
											</a>
											<a id="bjc" href="javascript:myRandReload()" style="text-decoration: none;color:#4a97e3;float:right;padding:6px 2px;">
												<img title="刷新验证码" src="<%=basePath%>/static/img/login/refresh.png"/>
											</a>
				    </div>
	         	    </div>
	         	  </li>
	         	  <li>
	         	     <div class='pact'>
	         	         <div id="agreeDiv" onclick="changeSatus()"> 
	         	             <span id="ag"><img src="/gbdbas/static/img/login/ok.png"></span>
	         	             <span id="ug"><img src="/gbdbas/static/img/login/no.png"></span>
	         	         </div>
	         	         <div>
	         	             <span>我已阅读</span><span><a href="<%=basePath%>/view/login/register/argeement.pdf" target="_blank" title='用户注册协议'>《用户注册协议》</a></span>
	         	             <span id="pactMessege"></span>
	         	         </div>
		         	 </div>
	         	  </li>
	         	 </ul>
	          </div>
	       </form>
	    </div>
	    
	    <div id="regestButton" onclick="regest()"><div>注&nbsp;&nbsp;册</div></div>
	   </div>
	   <!-- bottom -->
	   <div class="bottomDiv">
	   </div>
   </div>
   <!-- 激活邮箱 -->
   <div  id="activeDiv" closed="true" class="easyui-dialog" style="border-width:1px; width:400px;height:400px;padding:10px 20px;overflow-x:hidden;">
       <div class="toMail">
       <font  >恭喜您！<span id="name"></span></font><br/>
       <font >我们已经向您的邮箱  发送了一封激活邮件，请点击邮件中的链接完成激活！</font><br/>
                前往 <a id='emailId' href="#" style='font-size:16px;'></a> 激活  <br/>
       </div>
        <!--  <button id="redoButton" onclick="sendAgin()">重新发送</button>-->
   </div>
   
</body>
</html>