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
import java.util.List;

public class TypeServlet extends HttpServlet {
	private static final long serialVersionUID = 3874739343783059139L;
	private static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	private static TypeBiz typeBiz = context.getBean("typeBiz", TypeBiz.class);

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//TypeBiz typeBiz = new TypeBiz();
		List<Type> typeList = typeBiz.getAllType();
		request.setAttribute("list", typeList);
		request.getRequestDispatcher("/page/portal/index.jsp").forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
