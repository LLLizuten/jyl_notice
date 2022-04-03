package com.zhbit.web.controller; /**
 * @author lzy
 * 2022/4/2 21:48
 */

import com.zhbit.biz.TypeBiz;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TypeAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String typeName = request.getParameter("typeName");
        TypeBiz typeBiz = new TypeBiz();
        int i = typeBiz.addType(typeName);
        if (i != 0){
            System.out.println(i);
            request.getRequestDispatcher("/page/admin/typeManage.jsp").forward(request, response);
        }

    }
}
