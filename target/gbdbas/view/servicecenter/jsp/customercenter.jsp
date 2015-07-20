<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"　"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/servicecenter/customerCenter.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/common/button/button.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/easyui/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/easyui/icon.css">
<script type="text/javascript"	src="${pageContext.request.contextPath }/static/js/artdialog/artDialog.source.js?skin=twitter"></script>
<script type="text/javascript"	src="${pageContext.request.contextPath }/static/js/artdialog/iframeTools.source.js"></script>
<script type="text/javascript"	src="${pageContext.request.contextPath }/static/js/artdialog/artdialogopen.js"></script>
<script type="text/javascript" 	src="${pageContext.request.contextPath }/static/js/jquery/jquery-1.8.2.min.js"></script>
<script type="text/javascript"	src="${pageContext.request.contextPath }/static/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" 	src="${pageContext.request.contextPath }/view/servicecenter/js/customercenter.js"></script>
<title>客服中心</title>
</head>
<body style="background-color: #f0f3f5;" >
	<div style="min-height: 100%;height: auto!important;height: 100%;position: relative;">
	    <!--头部页面  -->
		<jsp:include page="/view/common/head/head.jsp"></jsp:include>
		<div style="width:1020px;margin: 0 auto; padding-bottom: 60px;text-align: right;padding-top: 50px;">
			  <div class="advancesearchCenter">
			  	<div style="width: 930px;margin: 0 auto ;">
					<div style="width: 930px;text-align: left;">
						<div style="font-size: 14px; font-family: 宋体; color: #1369c0;width: 100px;height: 36px;line-height: 36px;font-weight: bold;"><img alt="客服中心" style="vertical-align: middle;" src="${pageContext.request.contextPath}/static/img/servicecenter/center.png">客服中心</div>
						<div style="width: 900px; margin: 0 auto;height:160px;text-align: center;">
							<div style="border-bottom:1px dashed #333333;height: 2px;margin:0px auto 10px auto;"></div>
							<img alt="图片" src="/gbdbas/static/img/contrastreport/img/yb.png" style="width: 900px; height: 140px;">
						</div>
						<div style="margin-top: 20px;width:900px; height:inherit;text-align: left; line-height:27px; margin: 0 auto;">
							<font style="font-size: 14px; font-family: 宋体;color: #333333;">&nbsp;&nbsp;南通趣易信息技术有限公司通过统一规范服务行为，向广大用户提供“专业、真诚、全面”的服务，旨在充分满足客户在贸易数据的差异化服务需求。凭借资深的行业背景和多年信息化服务经验，全力打造专业的数据专家团队，提供全面、周到、个性化的服务，让客户以更低成本、更高效率、更快速度建立贸易决策支持系统和贸易风险管理体系，体验“信息时代，快乐贸易”的全新感受。</font> 
						</div>
						<div style="width:900px; height:auto !important;text-align: left; margin: 0 auto;  line-height: 25px!important;padding-top: 10px;">
							<div>
								<font style="font-size: 14px; font-family: 宋体; color: #1369c0;">一、欢迎您拨打客户服务热线！</font>
							</div>
							<div style="margin-left: 20px;">
								<font style="font-size: 14px; font-family: 宋体; font-weight: 900;color: #e3000b;">服务热线：025-66684219</font><br/>
							</div>
							<div style="margin-left: 20px;">
								<font style="font-size: 14px; font-family: 宋体; font-weight: 900;color: #e3000b;">提供国际一流水准、快捷、透明的数据服务</font>
							</div>
							<ul style="list-style:square;margin-left: 40px;color:#333333;">
								<li style="font-family: 宋体;font-size: 14px;"> 7*8小时的客户支持服务</li>
								<li style="font-family: 宋体;font-size: 14px;"> 一对一的在线咨询和平台使用指导服务</li>
								<li style="font-family: 宋体;font-size: 14px;"> 为企业提供多方位的行业分析报告</li>
								<li style="font-family: 宋体;font-size: 14px;"> 定期回访服务</li>
							</ul>
						</div>
						<div style="width:900px; height:auto !important;text-align: left; margin: 0 auto;  line-height: 25px!important; border: 0px solid red;padding-top: 10px;">
							<div style="width: 100%; height:auto !important; line-height: 28px;">
								<font style="font-size: 14px; font-family: 宋体;color: #1369c0;">二、给我们留言</font>
							</div>
							<div style="width: 100%; height:auto !important; margin-left: 20px;color:#333333;">
								<ul id="" style="list-style:square;margin-left: 20px;">
									<li style="font-family: 宋体;font-size: 14px;">您有建议在此提出，请在下方表框中详细描述您遇到的疑问。</li>
									<li style="font-family: 宋体;font-size: 14px;">请您告知您在平台中看到的错误提示信息，我们将做出更精确的回答。</li>
									<li style="font-family: 宋体;font-size: 14px;">我们会在48小时之内回复您的信件，请填写您的联络方式。</li>
								</ul>
							</div>
						</div>
						<div id="companyInfo" style="width: 900px; margin:0 auto; text-align:center;margin-left: 40px;padding-bottom: 50px;">
							<table width="700px" height="180px;" cellpadding="0" cellspacing="0">
								<tr>
									<td style="width:45px; height:auto !important;color:#333333;font-size: 14px;">姓名：</td>
									<td><input id="name" type="text" class="call_inp_cls"/></td>
								</tr>
								<tr>
									<td style="height:auto !important;color:#333333;font-size: 14px;">电话：</td>
									<td><input id="tel" type="text" class="call_inp_cls"/></td>
								</tr>
								<tr style="width: 100%; height: height:auto !important;">
									<td style="height:auto !important;color:#333333;font-size: 14px;">留言：</td>
									<td><textarea id="centent" class="call_area_cls"></textarea> </td>
								</tr>
								<tr>
									<td></td>	
									<td align="left" style="padding-left: 240px;"><a class="sub_cls" title="提交" onclick="btnClick(this)">提交</a></td>	
								</tr>
							</table>
						</div>
					</div>
				  </div>	
			    </div>	
			</div>
		<!-- xl 添加页尾 -->
		<jsp:include page="/view/common/footer/footer.jsp"></jsp:include>
	</div>
</body>
</html>