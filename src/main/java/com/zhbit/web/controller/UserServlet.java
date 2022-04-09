package com.zhbit.web.controller;


import com.zhbit.bean.User;
import com.zhbit.biz.UserBiz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 6971717725995508517L;
	String userName;
	String password;
	private static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	private static UserBiz userBiz = context.getBean("userBiz", UserBiz.class);

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//改动
		User user = (User) request.getSession().getAttribute("LOGINED_USER");
		if (user != null) {
			userName = user.getuName();
			password = user.getuPassword();
		}else {
			userName = request.getParameter("userName");
			password = request.getParameter("password");
		}
		//UserBiz userBiz = new UserBiz();
		User loginUser = userBiz.login(userName,password);
		if (loginUser!=null){
			request.getSession().setAttribute("LOGINED_USER", loginUser);
	 		request.getRequestDispatcher("/page/system/backIndex.jsp").forward(request, response);
	 	}else{
	 		request.setAttribute("message", "登录失败");
	 		request.getRequestDispatcher("login.jsp").forward(request, response);
	 } 

	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
