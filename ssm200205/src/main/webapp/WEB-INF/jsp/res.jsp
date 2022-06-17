<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<body>
    <form action="goods/doinit" method="post">
        商品编号：${goods.gid}<br/>
        商品名称：${goods.gname}<br/>
        商品价格：${goods.gprice}<br/>
        商品状态：${goods.gstatus}<br/>
        商品日期：${goods.gdate}<br/>
        <img src="/images/${goods.gimg}"/>
    </form>
</body>
</html>
