<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
		<!-- 宽度设置为设备实际宽度，初始化倍数为1，最小倍数为1，最大倍数为1，用户缩放为否 -->
		<meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1, maximum-scale=1">
		<!-- 删除默认的苹果工具栏和菜单栏 -->
		<meta name="apple-mobile-web-app-capable" content="yes" />
		<!-- 苹果手机顶部为黑色 -->
		<meta name="apple-mobile-web-status-bar-style" content="block" />
		<!-- 屏蔽浏览器自动识别数字为电话号码 -->
		<meta name="fromat-detecition" content="telephone=no" />
		<title>宏古</title>
		<link rel="stylesheet" href="css/common.css"/>
		<link rel="stylesheet" href="css/login.css?v=1"/>
		<script type="text/javascript" src="js/library/jquery-1.11.1.min.js"></script>
		<script type="text/javascript" src="js/library/banner.js"></script>
		<script type="text/javascript" src="js/config/url.js?v=1"></script>
		<script type="text/javascript" src="js/config/comn.js"></script>
		<script type="text/javascript" src="js/control/login.js?v=1"></script>
</head>
<body>
<div id="errorMsg"></div>
<!-- <div id="loding">
	<img src="img/loding.gif">
</div> -->
<div class="wrap">
	<div class="back-img">
		<img src="img/img-beijingtu.png" alt=""/>
	</div>
	<div class="login-info">
		<img class="login-info-img" src="img/img-touxiang.png" alt=""/>
		<div class="info">
			<div class="info-img" style="margin-top:0.74rem;">
				<img class="info-img-img" src="img/icon-yonghu.png" alt=""/>
				<span style="color:#FF1247;font-size:0.26rem;">用户名</span>
			</div>
			<div class="info-input">
				<div class="info-input-div info-fl">
					<img src="img/img-dianred.png" alt=""/>
					<input class="login-input" type="text" id="telNumber" name="telNumber" placeholder="请输入您的用户名">
				</div>
			</div>
			<div class="info-img">
				<img class="info-img-img" src="img/icon-mima.png" alt=""/>
				<span style="color:#FFB58F;font-size:0.26rem;">密码</span>
			</div>
			<div class="info-input" style="margin-bottom:0.6rem;">
				<div class="info-input-div info-fl">
					<img src="img/img-diancheng.png" alt=""/>
					<input class="login-input"  type="password" id="passWord" name="passWord" placeholder="请输入您的密码">
				</div>
			</div>
		</div>
		<div class="foget-password">
			<img src="img/icon-wangji.png" alt=""/>
			<span style="color:#fff;font-size:0.2rem;"  onclick="gotoPassword()">忘记密码</span>
			<span style="color:#fff;font-size:0.2rem;float:right;margin-right:0.5rem;" onclick="location.href='../mgr/register.jsp'">注册</span>
		</div>
	</div>
	<div class="bottom-btn" id="loginBtn" onclick="login()"></div>
	<div class="bottomdiv" style="height:2rem";></div>
</div>
</body>
</html>