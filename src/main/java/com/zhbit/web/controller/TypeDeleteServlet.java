package com.zhbit.web.controller;

import com.zhbit.biz.TypeBiz;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lzy
 * 2022/4/3 9:54
 */
public class TypeDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int tNo = Integer.parseInt(req.getParameter("tNo"));
        TypeBiz typeBiz = new TypeBiz();
        int i = typeBiz.deleteType(tNo);
        if (i != 0) {
            System.out.println("删除成功");
            req.getRequestDispatcher("/page/admin/typeManage.jsp").forward(req, resp);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
