package com.zhbit.web.controller;

import com.zhbit.bean.Notice;
import com.zhbit.bean.User;
import com.zhbit.biz.TypeBiz;
import com.zhbit.biz.UserBiz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author lzy
 * 2022/4/5 10:26
 * 用于一对多查询的servlet
 */
@Controller
public class UserQueryServlet extends HttpServlet {
    private static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    private static UserBiz userBiz = context.getBean("userBiz", UserBiz.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int uNo = Integer.parseInt(req.getParameter("uNo"));
        //userBiz = new UserBiz();
        User user = userBiz.getUserAndNotice(uNo);
        if (user != null) {
            req.setAttribute("user", user);
            req.getRequestDispatcher("/page/portal/showUserAndNotice.jsp").forward(req, resp);
        }else {
            System.out.println("查询失败");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
