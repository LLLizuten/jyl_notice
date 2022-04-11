package com.zhbit.web.controller;

import com.zhbit.biz.UserBiz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Controller
public class UserRegServlet extends HttpServlet {
    private static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    private static UserBiz userBiz = context.getBean("userBiz", UserBiz.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
       // UserBiz userBiz = new UserBiz();
        int result = userBiz.register(userName, password);
        if (result == 1) {
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }else {
            req.setAttribute("message", "注册失败");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }
    }
}
