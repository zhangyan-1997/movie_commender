<html lang="en">
<style>
    .wrapper {
        margin: 0 auto;
        padding-top: 20px;
        font-size: 30px;
        color: rebeccapurple;
        width: 1000px;
        text-align: center;
    }
</style>

<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div class="wrapper">
    hello
    <#list smsList as sms>
        <div style="font-size: 14px">用户ID:${sms.userId}  手机号:${sms.mobile}  验证码:${sms.veriCode}</div>
    </#list>
</div>
</body>
</html>