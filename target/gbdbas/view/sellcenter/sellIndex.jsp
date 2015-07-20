<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="<%=basePath%>static/css/sellcenter/myeasyui.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="<%=basePath%>static/css/sellcenter/sellIndex.css">

<script type="text/javascript" 	src="<%=basePath%>static/js/jquery/jquery.js"></script>
<script type="text/javascript" src="<%=basePath%>static/js/artdialog/artdialogopen.js"></script>
<script type="text/javascript"	src="<%=basePath%>static/js/artdialog/artDialog.source.js?skin=twitter"></script>
<script type="text/javascript" 	src="<%=basePath%>static/js/jquery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>static/js/easyui/jquery.easyui.min.js"></script>
    
<script type="text/javascript" src="<%=basePath%>static/js/common/common.js"></script>    
<script type="text/javascript" src="<%=basePath%>static/js/common/check.js"></script>
<script type="text/javascript" src="<%=basePath%>view/sellcenter/js/sellcenter.js"></script>
<script type="text/javascript" src="<%=basePath%>static/js/common/easyuiCascadeMenu.js"></script>
<title>定制中心</title>
</head>
<body style="background-color: #f0f3f5">
<div style="margin:0 auto;text-align:left;padding: 0;width: 100%;background-color: #f0f3f5">
  <!--头部页面  -->
    <jsp:include page="/view/common/head/head.jsp"></jsp:include>
	<!-- 主div -->
	 <div class='mainDiv'> 
	   		 <!-- 左标签栏 -->
		    <div class='leftDiv'>
		    <div style='width:150px;margin:10px auto auto auto;'>
		      <ul id='treeFloor1'>
		        <li>
		          <span>
		               <img src="<%=basePath%>static/img/sellcenter/tree_add.png">
		              <a href="javascript:void(0)" onclick="showFrame(1)">产品定制</a>
		          </span>
		          
		        </li>
		        <li >
		         <span ><img src="<%=basePath%>static/img/sellcenter/tree_add.png">
		                <a href="javascript:void(0)" onclick="showFrame(2)">我的订单</a>
		          </span>
		        </li>
		        <li >
		          <span ><img src="<%=basePath%>static/img/sellcenter/tree_minus.gif">
		                <a href="javascript:void(0)" onclick="showFrame(3)">我的积分</a>
		          </span>
		            <ul id='treeFloor2'>
		              <li >
		                 <span><a href="javascript:void(0)" onclick="showFrame(4)">积分兑换</a></span>
		              </li>
		              <li >
		                 <span><a href="javascript:void(0)" onclick="showFrame(5)">积分规则</a></span>
		              </li>
		              <li >
		                 <span><a href="javascript:void(0)" onclick="showFrame(6)">积分详情</a></span>
		              </li>
		            </ul>
		        </li>
		      </ul>
		     </div>
		  </div>
		 <!-- 右边1内容 --> 
		  <div class="rightDiv">
		    <div id="userMessege">
		        <div id="myPictrue">
		             <div><img  src="<%=basePath %>/static/img/sellcenter/head.jpg" style="width: 120px;height: 120px;"></div>
		             <div style="margin-left: 20px;margin-top: 10px;height: 20px" >
		                      <a href="#" onclick='fillInfo()' >完善资料</a>
		             </div>
		         </div>
		        <div id="myInfo">
		              <table>
		                  <tr><td>用户名称:<span  id="myLoginName"></span></td></tr>
		                  <tr><td>注册日期：<span  id="registertime"></span></td></tr>
		                  <tr><td>上次登录：<span  id="endlogintime"></span></td></tr>
		                  <tr><td>邮箱：<span  id="myEmial"></span></td></tr>
		               </table>
		        </div>
		    </div>
		    <div id='product'>
		       <iframe id="mainFrame" height="660px" width="840px" frameborder="0" scrolling="no" src="<%=basePath %>/view/sellcenter/product.jsp" ></iframe>
		    </div>
		  </div>  
		 <!-- 右边2内容 -->
	 </div>
	 <!-- 用户信息修 -->
	 <div id='recInfo' closed="true" class="easyui-dialog" style="border-width:1px; width:700px;height:550px;padding:10px 20px;overflow-x:hidden;">
	       <form id='upUserForm' action='/gbdbas/userManager/upUserInfo' method="post">
	         <input type="hidden" id='userId' name=userId>
	         <div class='upUserForm' align="center">
	            <table>
		           <tr>
			           <td class='tag'>登录名：</td>
			           <td><input type='text' readonly='true' style='border:none' id='loginName' name='loginName'></td>
			       </tr>
		           <tr>
		                 <td class='tag'>真实姓名：</td>
		               <td><input type='text' id='userName' name='userName' class='inputNomarl'  class="easyui-validatebox" validtype="realname"></td>
		           </tr>
		           <tr>
		               <td class='tag'>注册邮箱：</td>
		               <td><input type='text' id='email' validtype="email" class='inputNomarl'  name='email' invalidMessage="邮箱格式不对" missingMessage='邮箱不能为空'
		               class="easyui-validatebox" data-options="required:true"></td>
		           </tr>
		           <tr><td class='tag'>单位名称：</td><td><input type='text' class='inputNomarl'  id='unitName' name='unitName'></td></tr>
		           <tr><td class='tag'>手机：</td><td><input type='text' class='inputNomarl' class="easyui-validatebox" id='phone' name='phone' validtype="mobile"></td></tr>
		           <tr><td class='tag'>QQ：</td><td><input type='text' class='inputNomarl' id='qq' class="easyui-validatebox"  name='qq' validtype="qq" ></td></tr>
		           <tr><td class='tag'>所在地：</td>
		                <td>
		                   <input id="country" name='country'>
		                   <input id="province" name='province' >  
		                </td>
		           </tr>
		           <tr>
		             <td></td><td><input id="city" name='city'></td>
		           </tr>
		           <tr>
		                 <td class='tag' > 住址：</td>
		                 <td><textarea id='address'  name='address'></textarea></td>
		           </tr>
		           <tr>
		                 <td class='tag'>邮编：</td><td><input type='text'  class='inputNomarl' name='postalNum'   class="easyui-validatebox"  id='postalNum'  class="easyui-validatebox" validtype='zip' ></td>
		         </tr>
		           <tr><td class='tag'>电话：</td><td><input type='text' name='tel' class='inputNomarl'   class="easyui-validatebox"  id='tel'></td></tr>
		        </table>
	         </div>
         	<div class='formButtom'>
	            <span class='buttonSpan' onclick="subRecForm()">确定</span>
	            <span class='buttonSpan' onclick="clearRecForm()">取消</span>
	        </div>
	       </form> 
	 </div>
	</div>
</body>
</html>