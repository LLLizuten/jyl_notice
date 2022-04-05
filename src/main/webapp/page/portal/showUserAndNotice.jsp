<%@ page import="com.zhbit.bean.User" %>
<%@ page import="com.zhbit.bean.Notice" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lzy
  Date: 2022/4/5
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一对多查询结果</title>
</head>
<body>
<%
    User user = (User) request.getAttribute("user");
    List<Notice> list = user.getNotices();
    if (list == null || list.size() == 0) {
%>
<div>没有记录</div>
<% } else {
    for (Notice notice : list) {
%>
<a href="noticeServlet?method=showNoticeDetail&noticeId=<%=notice.getnNo()%>"><%=notice.getnTitle()%>
</a><br/>
<%
        }
    }
%>
</body>
</html>
