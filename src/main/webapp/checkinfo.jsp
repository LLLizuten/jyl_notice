<%@ page import="com.zhbit.bean.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>查询个人信息</title>
    <% User user = (User) session.getAttribute("LOGINED_USER"); %>
</head>

<body>
<table>
    <tr>
        <td>id</td>
        <td>用户名</td>
        <td>密码</td>
    </tr>
    <tr>
        <td><%=user.getuNo()%>
        </td>
        <td><%=user.getuName()%>
        </td>
        <td><%=user.getuPassword()%>
        </td>
    </tr>
    <tr>
        <td></td>
        <td><a href="alter.jsp"><button>修改个人信息</button></a></td>
        <td><a href="http://localhost:8080/notice/userServlet"><button>返回</button></a> </td>
    </tr>
</table>
</body>

</html>