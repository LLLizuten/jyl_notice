package com.zhbit.web.controller;

import com.zhbit.bean.Type;
import com.zhbit.biz.TypeBiz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lzy
 * 2022/4/3 10:33
 */
public class TypeUpdateServlet extends HttpServlet {
    private static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    private static TypeBiz typeBiz = context.getBean("typeBiz", TypeBiz.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tName = req.getParameter("tName");
        int tNo = Integer.parseInt(req.getParameter("tNo"));
        req.setAttribute("tName", tName);
        req.setAttribute("tNo", tNo);
        req.getRequestDispatcher("/page/admin/typeUpdate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String typeName = req.getParameter("typeName");
        int tNo = Integer.parseInt(req.getParameter("tNo"));
        //TypeBiz typeBiz = new TypeBiz();
        int i = typeBiz.alterType(tNo, typeName);
        if (i != 0){
            System.out.println("修改成功");
            req.getRequestDispatcher("/page/admin/typeManage.jsp").forward(req, resp);
        }


    }
}
