<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<title>重新激活用户</title>
<link rel="stylesheet" type='text/css' href="<%=basePath%>static/css/easyui/easyui.css">
<link rel="stylesheet" type='text/css' href="<%=basePath%>static/css/login/register.css">

<script type="text/javascript" src="<%=basePath%>/static/js/jquery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"	src="<%=basePath%>/static/js/artdialog/artDialog.source.js?skin=twitter"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/artdialog/artdialogopen.js"></script>
<script type="text/javascript" src="<%=basePath%>static/js/login/regest.js"></script>
<style type="text/css">
 .main{
   margin: 200px auto auto auto;
   width:400px;
   height:400px;
 }
</style>
<script type="text/javascript">
</script>
</head>
<body>
<!-- 重新激活页面 -->
   <div class="main"> 
        <div>对不起！邮件已超时，请您重新激活</div>
        <div>
           <button id="reActive" onclick="reActive()">再次发送邮件</button>
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