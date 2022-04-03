<%--
  Created by IntelliJ IDEA.
  User: lzy
  Date: 2022/4/2
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加公告类型</title>
    <script type="text/javascript">
        function checkType(){
            var typeName = form1.typeName.value;
            if ((typeName==null)||(typeName==="")){
                alert("请填写输入类型名称！");
                return false;
            }
        }
    </script>
</head>
<body>
<form method="post" name="form1" action="http://localhost:8080/notice/typeAddServlet" onsubmit="javascript: return checkType();">
    <label>
        请输入要添加的公告类型名称:
        <input type="text" name="typeName" value="">
    </label>
    <br>
    <input type="submit" value="确定" name="submit">
    <input type="reset" value="重置" name="reset"/>
</form>


</body>
</html>
