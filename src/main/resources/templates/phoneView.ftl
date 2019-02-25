<#include "public/default.ftl">
<#include "public/pushdefault.ftl">
<#include "public/userdefault.ftl">
<#assign base="${request.contextPath}"/>
<@header title="麦芒网">
<link rel="stylesheet" href="${base}/css/style.css">
<link rel="stylesheet" href="${base}/css/menu.css">
<link rel="stylesheet" href="${base}/css/userInfo.css">
</@header>
<@headerArea>
<li><a href="${base}/index">回首页</a></li>
</@headerArea>
<@user_nav>
<div class="col-md-6">
    <div class="user_bar"><h4>手机版</h4></div>
</div>
</@user_nav>

<div class="container_self" style="min-height: 750px;">
    <div class="row">
        <div class="col-xs-4">
            <img src="${base}/img/phonePage.png" alt="">
        </div>
        <div class="col-xs-8">
            <h3 style="margin-top: 100px;">①通过手机/平板电脑浏览器输入即可访问网站</h3>
            <input type="text" class="form-control" readonly value="http://www.kfmm.com.cn">

            <div class="row">
                <div class="col-xs-6">
                    <h3 style="margin-top: 100px;">②扫码访问手机版</h3>
                    <div class="row">
                        <div class="col-md-offset-2 col-xs-6">
                            <img src="${base}/img/kfmm.png" alt="">
                        </div>
                    </div>
                </div>
                <div class="col-xs-6">
                    <h3 style="margin-top: 100px;">③扫码关注公众号</h3>
                    <div class="row">
                        <div class="col-md-offset-2 col-xs-6">
                            <img src="${base}/img/gongzhonghao.png" alt="">
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>


<@push_footer>
<script type="text/javascript" src="${base}/js/jquery.min.js"></script>
<script type="text/javascript" src="${base}/js/bootstrap.min.js"></script>
</@push_footer>


