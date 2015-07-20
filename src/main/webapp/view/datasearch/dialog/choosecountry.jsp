<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 国际化 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String language = (String)request.getSession().getAttribute("language");
if(language == null || "".equals(language) || "pleaseSelect".equals(language))
    language = "message_zh_CN";
%>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<fmt:setBundle basename="<%=language%>" var="messages" />
<html>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Insert title here</title>
    <head>
    </head>
  <body>
		<div id="countrysel" style="overFlow-x: hidden;position: relative; width:500px;height:430px;display: none;">
			<div class="country_middle" style="width: 498px; height: 350px;">
				<div class="country_middle_lb">
				<br/>
					<div class="lb_div">
						<div class="bt"><fmt:message key="common.southAmerica" bundle="${messages}"/></div>
						<div class="zlb">
						<ul class="country_list_ul">
							<li>
								  <img  src="${root}/static/img/datasearch/country/argentina.png"><font>阿根廷</font>
			                      <div style="display:block;">
			                          <a href="javascript:void(0)" onclick = "chooseCountry('阿根廷进口')">进口</a>
			                      	  <a href="javascript:void(0)" id="agt_export_click" onclick = "chooseCountry('阿根廷出口')">出口</a>
			                      </div>
							</li>
							<li>
								  <img  src="${root}/static/img/datasearch/country/paraguay.png"><font>巴拉圭</font>
			                      <div style="display:block;">
			                          <a href="javascript:void(0)" onclick="chooseCountry('巴拉圭进口')">进口</a>
			                      	  <a href="javascript:void(0)" onclick="chooseCountry('巴拉圭出口')">出口</a>
			                      </div>
							</li>
							<li>
								  <img  src="${root}/static/img/datasearch/country/ecuador.png"><font>厄瓜多尔</font>
			                      <div style="display:block;">
			                          <a href="javascript:void(0)" onclick="chooseCountry('厄瓜多尔进口')">进口</a>
			                      	  <a href="javascript:void(0)" onclick="chooseCountry('厄瓜多尔出口')">出口</a>
			                      </div>
							</li>
							<li>
								  <img  src="${root}/static/img/datasearch/country/chile.png"><font>智利</font>
			                      <div style="display:block;">
			                          <a href="javascript:void(0)" onclick="chooseCountry('智利进口')">进口</a>
			                      	  <a href="javascript:void(0)" onclick="chooseCountry('智利出口')">出口</a>
			                      </div>
							</li>
							<li>
								  <img  src="${root}/static/img/datasearch/country/venezuela.png"><font>委内瑞拉</font>
			                      <div style="display:block;">
			                          <a href="javascript:void(0)" onclick="chooseCountry('委内瑞拉进口')">进口</a>
			                          <a href="javascript:void(0)" onclick="chooseCountry('委内瑞拉出口')">出口</a>
			                      </div>
							</li>
							<li>
								  <img  src="${root}/static/img/datasearch/country/panama.png"><font>巴拿马</font>
			                      <div style="display:block;">
			                          <a href="javascript:void(0)" onclick="chooseCountry('巴拿马进口')">进口</a>
			                          <a href="javascript:void(0)" onclick="chooseCountry('巴拿马出口')">出口</a>
			                      </div>
							</li>
							<li>
								  <img  src="${root}/static/img/datasearch/country/uruguay.png"><font>乌拉圭</font>
			                      <div style="display:block;">
			                          <a href="javascript:void(0)" onclick="chooseCountry('乌拉圭进口')">进口</a>
			                      	  <a href="javascript:void(0)" onclick="chooseCountry('乌拉圭出口')">出口</a>
			                      </div>
							</li>
							<li>
								  <img  src="${root}/static/img/datasearch/country/colombia.png"><font>哥伦比亚</font>
			                      <div style="display:block;">
			                          <a href="javascript:void(0)" onclick="chooseCountry('哥伦比亚进口')">进口</a>
			                      	  <a href="javascript:void(0)" onclick="chooseCountry('哥伦比亚出口')">出口</a>
			                      </div>
							</li>
							<li>
								  <img  src="${root}/static/img/datasearch/country/peru.png"><font>秘鲁</font>
			                      <div style="display:block;">
			                          <a href="javascript:void(0)" onclick="chooseCountry('秘鲁进口')">进口</a>
			                      	  <a href="javascript:void(0)" onclick="chooseCountry('秘鲁出口')">出口</a>
			                      </div>
							</li>
							<li>
								  <img  src="${root}/static/img/datasearch/country/bolivia.png"><font>玻利维亚</font>
			                      <div style="display:block;">
			                          <a href="javascript:void(0)" onclick="chooseCountry('玻利维亚进口')">进口</a>
			                      </div>
							</li>
							<li>
								  <img  src="${root}/static/img/datasearch/country/brazil.png"><font>巴西</font>
			                      <div style="display:block;">
			                          <a href="javascript:void(0)" onclick="chooseCountry('巴西进口')">进口</a>
			                      </div>
							</li>
						</ul>
					</div>
					</div>
					<div class="lb_div">
						<div class="bt"><fmt:message key="common.northAmerica" bundle="${messages}"/></div>
						<div class="zlb">
							<ul class="country_list_ul">
								<li>
									  <img  src="${root}/static/img/datasearch/country/nicaragua.png"><font>尼加拉瓜</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" onclick = "chooseCountry('尼加拉瓜进口')">进口</a>
				                          <a href="javascript:void(0)" onclick = "chooseCountry('尼加拉瓜出口')">出口</a>
				                      </div>
								</li>
								<li>
									  <img  src="${root}/static/img/datasearch/country/salvatore.png"><font>萨尔瓦多</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" onclick = "chooseCountry('萨尔瓦多进口')">进口</a>
				                          <a href="javascript:void(0)" onclick = "chooseCountry('萨尔瓦多出口')">出口</a>
				                      </div>
								</li>
								<li>
									  <img  src="${root}/static/img/datasearch/country/honduras.png"><font>洪都拉斯</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" id="hdls_click" onclick = "chooseCountry('洪都拉斯进口')">进口</a>
				                        <!--   <a href="javascript:void(0)" onclick = "chooseCountry('洪都拉斯出口')">出口</a> -->
				                      </div>
								</li>
								<li>
									  <img  src="${root}/static/img/datasearch/country/mexico.png"><font>墨西哥</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" id="mxg_click" onclick = "chooseCountry('墨西哥进口')">进口</a>
				                      </div>
								</li>
								<li>
									  <img  src="${root}/static/img/datasearch/country/usa.png"><font>美国</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" onclick = "chooseCountry('美国进口')">进口</a>
				                      </div>
								</li>
								<li>
									  <img  src="${root}/static/img/datasearch/country/guatemala.png"><font>危地马拉</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" onclick = "chooseCountry('危地马拉进口')">进口</a>
				                          <a href="javascript:void(0)" onclick = "chooseCountry('危地马拉出口')">出口</a>
				                      </div>
								</li>
								<li>
									  <img  src="${root}/static/img/datasearch/country/costarica.png"><font>哥斯达黎加</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" onclick = "chooseCountry('哥斯达黎加进口')">进口</a>
				                          <a href="javascript:void(0)" onclick = "chooseCountry('哥斯达黎加出口')">出口</a>
				                      </div>
								</li>
							</ul>
						</div>
					</div>
					<div class="lb_div">
						<div class="bt"><fmt:message key="common.europe" bundle="${messages}"/></div>
						<div class="zlb">
							<ul class="country_list_ul">
								<li>
									  <img  src="${root}/static/img/datasearch/country/russia.gif"><font>俄罗斯</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" onclick = "chooseCountry('俄罗斯进口')">进口</a>
				                      </div>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" onclick = "chooseCountry('俄罗斯出口')">出口</a>
				                      </div>
								</li>
								<li>
									  <img  src="${root}/static/img/datasearch/country/ukraine.png"><font>乌克兰</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" onclick = "chooseCountry('乌克兰进口')">进口</a>
				                      </div>
								</li>
								<li>
									  <img  src="${root}/static/img/datasearch/country/uk.png"><font>英国</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" onclick = "chooseCountry('英国进口')">进口</a>
				                      </div>
								</li>
							</ul>
						</div>
					</div>
					<div class="lb_div">
						<div class="bt"><fmt:message key="common.asia" bundle="${messages}"/></div>
						<div class="zlb">
							<ul class="country_list_ul">
								<li class="country_space_li">
									  <img  src="${root}/static/img/datasearch/country/india.png"><font>印度</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" onclick = "chooseCountry('印度进口')">进口</a>
				                      </div>
								</li>
								<li class="country_space_li">
									  <img  src="${root}/static/img/datasearch/country/vietnam.png"><font>越南</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" onclick = "chooseCountry('越南进口')">进口</a>
				                          <a href="javascript:void(0)" onclick = "chooseCountry('越南出口')">出口</a>
				                      </div>
								</li>
								<li class="country_space_li">
									  <img  src="${root}/static/img/datasearch/country/pakistan.png"><font>巴基斯坦</font>
				                      <div style="display:block;">
				                          <a href="javascript:void(0)" onclick = "chooseCountry('巴基斯坦进口')">进口</a>
				                      </div>
								</li>
								<li class="country_space_li">
									  <img  src="${root}/static/img/datasearch/country/chinaEight.png"><a href="javascript:void(0)" onclick = "chooseCountry('中国')" style="float: right;">中国</a>
								</li>
								<li class="country_space_li">
									  <img  src="${root}/static/img/datasearch/country/korea.png"><a href="javascript:void(0)" onclick = "chooseCountry('韩国')" style="float: right;">韩国</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
  </body>
</html>
