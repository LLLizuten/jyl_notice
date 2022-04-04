<%@ page import="com.zhbit.bean.Notice" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lzy
  Date: 2022/4/4
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示模糊查询结果</title>
</head>
<body>
<%
    List<Notice> list = (List<Notice>)request.getAttribute("list");
    if (list==null || list.size()==0){
%>
<div>没有记录</div>
<% } else {
    for (Notice notice: list){
%>
<a href="noticeServlet?method=showNoticeDetail&noticeId=<%=notice.getnNo()%>"><%=notice.getnTitle()%></a><br />
<%
        }
    }
%>
</body>
</html>
