<#include "../defaultLayout/defaultLayout.ftl">
<#assign base="${request.contextPath}"/>
<@header siteName="开封麦芒网" base_css=["global","style","bootstrap.min"] base_keywords="开封麦芒网">
<link rel="stylesheet" href="${base}/css/font-awesome.min.css"></@header>

<@body title="联系方式" back=true>
<div id="contactbar">
    <a href="${base}/m/index" class="bottom_index">首页</a>
    <a href="${base}/m/user/info" class="bottom_member">我的</a>
    <a href="${base}/m/about/cpdesc" class="bottom_history_on">推送</a>
    <a href="${base}/m/push/choose" class="bottom_post">发布</a>
</div>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">手机导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" style="padding: 0" href="#">
                <img alt="麦芒网络" src="${base}/ico/mmfavicon.ico">
                联系方式
            </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li ><a href="${base}/m/about/cpdesc">公司简介</a></li>
                <li class="active"><a href="${base}/m/about/contact">联系方式</a></li>
                <li><a href="${base}/m/about/service">推广服务</a></li>
                <li><a href="${base}/m/about/charge">收费标准</a></li>
                <li><a href="${base}/m/about/help">使用帮助</a></li>
                <li><a href="${base}/m/about/law">网站申明</a></li>
                <li ><a href="${base}/m/about/friend">友情链接</a></li>
            </ul>

        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">
            <p class="table-title">贴片广告、招聘置顶、竞价排名、企业认证请联系：</p>
        </div>
        <div class="panel-body">
            <p> <strong>刘经理</strong> 手机:13213142620;座机:0371-23253932</p>
            <p></p>
            <p> <strong>李经理</strong> :18239903555</p>
        </div>
    </div>
    <div class="panel panel-default">
        <div class="panel-heading">
            <p class="table-title">找回密码、修改手机号、审核信息等网站使用问题请联系：</p>
        </div>
        <div class="panel-body">
            <p> <strong>刘经理</strong> :13213142620</p>
            <p></p>
            <p> <strong>李经理</strong> :18239903555</p>
            <p style="font-size: 16px;font-weight: 800">自助找回密码,<a href="${base}/verifyAccount" style="color: #ff552e;">
                点击这里!</a> &nbsp;&nbsp;修改绑定手机号,<a
                    href="#" style="color: #ff552e;">点击这里!</a> </p>
        </div>
    </div>
    <div class="panel panel-default">
        <div class="panel-heading">
            <p class="table-title">被封、被屏蔽、不能正常发布信息请联系:</p>
        </div>
        <div class="panel-body">
            <p> <strong>刘经理</strong> :13213142620</p>
            <p></p>
            <p> <strong>李经理</strong> :18239903555</p>
        </div>
    </div>

</div>

</@body>

<@footer base_js=["jq_min.211","bootstrap.min"]>

</@footer>

<#--自定义脚本区-->