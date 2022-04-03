<%@ page import="com.zhbit.biz.TypeBiz" %>
<%@ page import="com.zhbit.bean.Type" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>公告类型管理</title>
</head>

<body>
<%
    TypeBiz typeBiz = new TypeBiz();
    List<Type> allType = typeBiz.getAllType();

    if (allType == null){
%>
<div>无公告类型！</div>
<%
    } else {
%>
<table>
    <tr>
        <td>类型编号</td>
        <td>类型名称</td>
        <td colspan="2">操作</td>
    </tr>
<%
    for (Type type : allType) {
%>
<tr>
    <td><%=type.gettNo()%></td>
    <td><%=type.gettTypeName()%></td>
    <td><a href="http://localhost:8080/notice/typeUpdateServlet?tName=<%=type.gettTypeName()%>&tNo=<%=type.gettNo()%>">修改</a>
        /
        <a href="http://localhost:8080/notice/typeDeleteServlet?tNo=<%=type.gettNo()%>">删除</a></td>

</tr>
<%
        }
    }
%>
</table>
<a href="http://localhost:8080/notice/page/admin/typeADD.jsp"><button>添加</button></a>
</body>
</html>
