<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/easyui/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/easyui/icon.css">
<script type="text/javascript" 	src="${pageContext.request.contextPath }/static/js/jquery/jquery-1.8.2.min.js"></script>
<script type="text/javascript"	src="${pageContext.request.contextPath }/static/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"	src="${pageContext.request.contextPath }/view/servicecenter/js/customercenter.js"></script>
<title>用户留言信息</title>
</head>
<body>
	<div id="">
		<a href="javascript:query()">点击查询</a>
	</div>
	<div id="downCls" style="background-color: #126aaa;display: none;">
		<a href="javascript:void(0)"	plain="true"	class="easyui-linkbutton" onclick="exportPDForEXCELPub()" onmouseover="this.style.background='#043f77';" onmouseout="this.style.background='#126aaa';">
			<font style="font-size:16px;color: #ffffff;font-family: Microsoft YaHei;">导出Excel</font>
		</a> 
		<a	href="javascript:void(0)" class="easyui-linkbutton"	plain="true" onmouseover="this.style.background='#043f77';" onmouseout="this.style.background='#126aaa';" onclick="deleteCentent()">
			<font style="font-size:16px;color: #ffffff;font-family: Microsoft YaHei;">删除留言</font>
		</a> 
	</div>
	<div id="tab" style="display: none;">
		<table id='mytable' class="easyui-datagrid" width="500px" style=""
			height="300px" title="用户留言" rownumbers="true" 
			fitColumns="true" toolbar="#downCls" 
			pagination="true" singleSelect="false" loadMsg="正在加载中……">						
			<thead>
				<tr>
					<th data-options="field:'ck',checkbox:true"></th>
					<th field="id" Width="80" align="center" hidden="true">
						<font style="font-size: 14px;">id</font>
					</th>
					<th field="name" Width="80" align="center" >
						<font style="font-size: 14px;">姓名</font>
					</th>
					<th field="tel" Width="80" align="center"  >
						<font style="font-size: 14px;">电话</font>
					</th>
					<th field="centent" Width="80" align="center"  >
						<font style="font-size: 14px;">留言内容</font>
					</th>
					<th field="date" Width="80" align="center"  >
						<font style="font-size: 14px;">留言时间</font>
					</th>
				</tr>
			</thead>
		</table>
	</div>
</body>
</html>