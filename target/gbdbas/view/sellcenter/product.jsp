<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

	String language = (String)request.getSession().getAttribute("language");
	if(language == null || "".equals(language) || "pleaseSelect".equals(language)){
	    language = "message_zh_CN";
	}
	String dateLanguage = "zh-cn";
	if(language.equals("message_en_US")){
		dateLanguage ="en";
	}
%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="<%=basePath%>static/css/sellcenter/myeasyui.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>static/css/sellcenter/product.css" rel="stylesheet" type="text/css" />
    
    <script type="text/javascript" src="<%=basePath%>static/js/jquery/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>view/sellcenter/js/json2.js"></script>
    <script type="text/javascript" src="<%=basePath%>static/js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript"	src="<%=basePath%>static/js/My97DataPicker/WdatePicker.js"></script>
    
    <script type="text/javascript" src="<%=basePath%>view/sellcenter/js/product.js"></script>
    <script type="text/javascript"	src="<%=basePath%>static/js/common/date.js"></script>
     <script type="text/javascript"	src="<%=basePath%>static/js/common/common-path.js"></script>
<title>产品购买中心</title>
</head>
<body >
       <div class="mainDiv">
          <div class='title'>产品定制</div>
          <div id='menuDiv'>
            <span onclick="showBox('hs')">按HSCODE定制</span>
            <span onclick="showBox('de')">按产品描述定制</span>
            <span onclick="showBox('cy')">按国家定制</span>
            <span onclick="showBox('nm')">按次数定制</span>
          </div>
          <!-- 存放查询条件 -->
          <div class='conditionDiv'>
             <!-- hsCode -->
	           <div id="hs">
	              <form id="hs_Form">
                     <div class='formCondition'>
	                      <table width="750px">
	                         <tr>
	                            <td class='tag'>HSCODE:</td>
	                            <td><input class='inputNomarl' type="text" id="hs_code"/></td>
	                            <td class='tag'>国家：</td>
                                <td> <input type="text" id='hs_country' ></td>
	                            <td class='tag'>进出口类型：</td>
	                            <td><input type="text" id='hs_io'></td>
	                         </tr>
	                         <tr>
	                              <td  class='tag'>时间范围：</td>
	                              <td colspan="2"><input id="hs_beginTime" name="hs_beginTime"  class="doubleinpText" onclick="WdatePicker({lang:'<%=dateLanguage%>',quickSel:['2010-1-1','2011-1-1','2012-1-1','2013-1-1','2014-1-1'],readOnly:true})"/> -
	                              <input id="hs_endTime" name="hs_endTime"  class="doubleinpText" onclick="WdatePicker({lang:'<%=dateLanguage%>',quickSel:['2010-1-1','2011-1-1','2012-1-1','2013-1-1','2014-1-1'],readOnly:true})"/> 
	                              </td>
	                              <td></td>
	                              <td></td>
	                              <td style='padding-left: 30px;'><span class='buttonSpan' onclick="addCar('hs')">确定</span>
	                              <span class='buttonSpan' onclick="cancle('hs')">清空</span></td>
	                         </tr>
	                      </table>
                      </div>
	                 </form>
	              </div>
	              <!-- 产品描述 -->
	            <div id='de'>
                  <form id="de_Form">
                     <div class='formCondition'>
                        <table>
                        <tr>
	                            <td class='tag'>产品关键词:</td>
	                            <td><input class='inputNomarl' type="text" id="de_desc"/></td>
	                            <td class='tag'>国家：</td>
                                <td> <input type="text" id='de_country' ></td>
	                            <td class='tag'>进出口类型：</td>
	                            <td><input type="text" id='de_io'></td>
	                         </tr>
	                         <tr>
	                              <td  class='tag'>时间范围：</td>
	                              <td colspan="2"><input id="de_beginTime" name="de_beginTime"  class="doubleinpText" onclick="WdatePicker({lang:'<%=dateLanguage%>',quickSel:['2010-1-1','2011-1-1','2012-1-1','2013-1-1','2014-1-1'],readOnly:true})"/> -
	                              <input id="de_endTime" name="de_endTime"  class="doubleinpText" onclick="WdatePicker({lang:'<%=dateLanguage%>',quickSel:['2010-1-1','2011-1-1','2012-1-1','2013-1-1','2014-1-1'],readOnly:true})"/> 
	                              </td>
	                              <td></td>
	                              <td></td>
	                              <td style='padding-left: 30px;'><span class='buttonSpan' onclick="addCar('de')">确定</span>
	                              <span class='buttonSpan' onclick="cancle('de')">清空</span></td>
	                         </tr>
                        </table>
                     </div>
                  </form>
                </div>
                <!-- 国家 -->
                <div id='cy'>
                  <form id="cy_Form">
                     <div class='formCondition'>
                        <table>
                        
                         <tr>
	                            <td class='tag'>国家：</td>
                                <td> <input type="text" id='cy_country' ></td>
                                <td class='tag'></td>
	                            <td class='tag'>进出口类型：</td>
	                            <td><input type="text" id='cy_io'></td>
	                         </tr>
	                         <tr>
	                              <td  class='tag'>时间范围：</td>
	                              <td colspan="2"><input id="cy_beginTime" name="cy_beginTime"  class="doubleinpText" onclick="WdatePicker({lang:'<%=dateLanguage%>',quickSel:['2010-1-1','2011-1-1','2012-1-1','2013-1-1','2014-1-1'],readOnly:true})"/> -
	                              <input id="cy_endTime" name="cy_endTime"  class="doubleinpText" onclick="WdatePicker({lang:'<%=dateLanguage%>',quickSel:['2010-1-1','2011-1-1','2012-1-1','2013-1-1','2014-1-1'],readOnly:true})"/> 
	                              </td>
	                              <td></td>
	                              <td></td>
	                              <td style='padding-left: 30px;'>
		                              <span class='buttonSpan' onclick="addCar('cy')">确定</span>
		                              <span class='buttonSpan' onclick="cancle('cy')">清空</span>
	                              </td>
	                         </tr>
                        </table>
                     </div>
                  </form>
                </div>
                <!-- 按次 -->
                <div id='nm'>
                 <form id="nm_Form">
                     <div class='formCondition'>
                        <table >
                           <tr>
                              <td ><span  class='tag'> 请输入次数:</span><input type="text"  class='inputNomarl' id="times" onblur="checkNum()"></td>
                           </tr>
                           <tr>
                             <td style="padding-left: 400px;">
                                <span class='buttonSpan' onclick="addCar('nm')">确定</span>
                                <span  class='buttonSpan' onclick="cancle('nm')">清空</span>
                             </td>
                           </tr>
                        </table>
                     </div>
                  </form>
                </div>    
          </div>
          <!-- 存放购物车 -->
          <div id='car'  class='car'>
               <div id="tool_bar">
                 	<a	href="javascript:void(0)"	class="easyui-linkbutton"	plain="true" onmouseover="this.style.background='#DA4653';" onmouseout="this.style.background='#EC5565';" onclick="deletePros()">
							<font style="font-size:16px;color: #ffffff;font-family: Microsoft YaHei;">删除</font>
						</a>
               </div>
               <!-- 海关编码或者国家或者产品描述 -->
               <div class='carDet'>
		              <table id="car_table" toolbar="#tool_bar" >
		              </table>
               </div>
               <div class='formButtom' >
                 <span class='buttonSpan' onclick='buyPro("car_table")'>立即购买</span>
               </div>
          </div>
       </div>
       
</body>
</html>