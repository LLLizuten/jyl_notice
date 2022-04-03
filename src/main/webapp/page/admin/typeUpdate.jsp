<%@ page import="com.zhbit.bean.Type" %><%--
  Created by IntelliJ IDEA.
  User: lzy
  Date: 2022/4/2
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改公告类型</title>
    <script type="text/javascript">
        function checkType(){
            var typeName = form1.typeName.value;
            if ((typeName==null)||(typeName==="")){
                alert("请填写输入公告名称！");
                return false;
            }
        }
    </script>
</head>
<body>
    <%
        String tName = (String) request.getAttribute("tName");
        int tNo = (int) request.getAttribute("tNo");
    %>
<form method="post" name="form1" action="http://localhost:8080/notice/typeUpdateServlet" onsubmit="javascript: return checkType();">
    <input type="hidden" name="tNo" value="<%=tNo%>">
    请输入更改后的公告类型名称:<input type="text" name="typeName" value="<%=tName%>">
    <br>
    <input type="submit" value="确定">
</form>

</body>
</html>
