/**
 * 刷新验证码
 */
function myRandReload(){
	var codeStr = "/gbdbas/getCheckCode?nocache="+new Date().getTime();
	$("#createcheckcode")[0].src= codeStr;
}

/**
 * 验证账户
 * @author XL
 */
function netSetp(){
	//获取登录名称
	var loginValue = $("#loginName").val();
	//获取验证码
	var veritycode = $("#veritycode").val();
	 if(loginValue.trim().length==0&&veritycode.trim().length==0)
	 {
		 $("#loginName").addClass('red_cls'); 
		 $("#loginName_msg").css("display","block");
		 $("#veritycode").addClass('red_cls'); 
		 $("#veritycode_msg").css("display","block");
		 return;
	 }
	 else
	 {
		if(loginValue.trim().length==0){
			$("#loginName").addClass('red_cls'); 
			$("#loginName_msg").css("display","block");
			return;
		 }else{
			 $("#loginName").removeClass('red_cls'); 
			 $("#loginName").removeClass('blue_cls'); 
			 $("#loginName_msg").css("display","none");
		 }
		 if(veritycode.trim().length==0){
				$("#veritycode").addClass('red_cls'); 
				$("#veritycode_msg").css("display","block");
				return;
		 }else{
				 $("#veritycode").removeClass('red_cls'); 
				 $("#veritycode").removeClass('blue_cls'); 
				 $("#veritycode_msg").css("display","none");
		 }
	 }
	 $.post("/gbdbas/UserPassword/isUserExit",{"loginName":loginValue,"veritycode":veritycode},
		function(data){
			if(data=="0")
			{
				$("#loginName").addClass('red_cls'); 
				$("#loginName_msg").empty();
				$("#loginName_msg").append("用户名不存在");
				$("#loginName_msg").css("display","block");
			}
			else if(data == "1")
			{
				$("#veritycode").addClass('red_cls'); 
				$("#veritycode_msg").empty();
				$("#veritycode_msg").append("验证码错误");
				$("#veritycode_msg").css("display","block");
			}
			else if (data == "2")
			{
				window.location.href="/gbdbas/view/login/findpassword/emailvalidate.jsp";  
			}
			
		}
		,"text"); 
	}

function sendValidate(num){
	var tt;
	num -=1;
	$("#timer_id").empty();
	$("#timer_id").addClass('gray_cls'); 
	$("#timer_id").append("重新发送("+num+")");
	if(num == 0)
	{
		window.clearTimeout(tt);
		$("#timer_id").empty();
		$("#timer_id").removeClass('gray_cls'); 
		$("#timer_id").append("重新发送");
		$("#timer_id").one("click", function(){
			//发送邮件
			sendEmail();
			//触发定时器，定时器回调函数里再使用one绑定div的点击事件
			sendValidate(60);
		})
		return;
	}
	//每秒执行一次,showTime()  
   tt=setTimeout('sendValidate('+num+')',1000);
}

/**
 * 发送邮件
 */
function sendEmail(){
	 $.post("/gbdbas/UserPassword/sendEmail",
		function(data){
			if(data == "0")
			{
				$("#forgot-emailVcode-success").empty();
				$("#forgot-emailVcode-success").append("验证码发送失败");
			}
			else if(data == "1")
			{
				$("#forgot-emailVcode-success").empty();
				$("#forgot-emailVcode-success").append("验证码已发送");
			}
		}
		,"text"); 
}

/**
 * 验证邮箱验证码是否填写成功
 */
function validateEmailCode(){
	//获取发送到邮箱的验证码
	var verityEmailcode = $("#pass-input-emailVcode").val();
	if(verityEmailcode.trim().length==0){
		$("#pass-input-emailVcode").addClass('red_cls'); 
		$("#forgot-emailVcode-tip").css("display","block");
		return false;
	 }else{
		 $("#pass-input-emailVcode").removeClass('red_cls'); 
		 $("#pass-input-emailVcode").removeClass('blue_cls'); 
		 $("#forgot-emailVcode-tip").css("display","none");
		return true;
	 }
}

/**
 * 验证用户输入的密码是否正确
 */
function validateUserPwd()
{
	//获取密码
	var password = $("#password").val();
	//获取确认密码
	var verifypwd = $("#verifypwd").val();
	 if(password.trim().length==0&&verifypwd.trim().length==0)
	 {
		 $("#password").addClass('red_cls'); 
		 $("#pwd-msg").css("display","block");
		 $("#verifypwd").addClass('red_cls'); 
		 $("#verifypwd-msg").css("display","block");
		 return false;
	 }
	 else
	 {
		if(password.trim().length==0){
			$("#password").addClass('red_cls'); 
			$("#pwd-msg").css("display","block");
			return false;
		 }else{
		    if (password.trim().length < 4 || password.trim().length > 12) {
				$("#password").addClass('red_cls'); 
	        	$("#pwd-msg").empty();
				$("#pwd-msg").append("密码长度必须大于4");
				$("#pwd-msg").css("display","block");
				return false;
	        } else {
	        	var test = /^([A-Za-z0-9-+=|,!@#$%^&*?_.~+/\\(){}\[\]<>]){6,12}$/;
	            if (!test.test(password.trim())) {
	            	$("#password").addClass('red_cls'); 
	            	$("#pwd-msg").empty();
	    			$("#pwd-msg").append("密码不符合格式");
	    			$("#pwd-msg").css("display","block");
	    			return false;
	            }
	            else
	            {
		   			 $("#password").removeClass('red_cls'); 
					 $("#password").removeClass('blue_cls'); 
					 $("#pwd-msg").css("display","none");
	            }
	        }
		 }
		 if(verifypwd.trim().length==0){
				$("#verifypwd").addClass('red_cls'); 
				$("#verifypwd-msg").css("display","block");
				return false;
		 }else{
				 $("#verifypwd").removeClass('red_cls'); 
				 $("#verifypwd").removeClass('blue_cls'); 
				 $("#verifypwd-msg").css("display","none");
		 }
		 if(password.trim().length!=0&&verifypwd.trim().length!=0)
		 {
			 if(password.trim()==verifypwd.trim()){
				 $("#verifypwd").removeClass('red_cls'); 
				 $("#verifypwd").removeClass('blue_cls'); 
				 $("#verifypwd-msg").css("display","none");
				 return true;
			 }
			 else
			{
				$("#verifypwd").addClass('red_cls'); 
				$("#verifypwd-msg").empty();
				$("#verifypwd-msg").append("您输入的密码与确认密码不一致");
				$("#verifypwd-msg").css("display","block");
				return false;
			}
		 }
	 }
}