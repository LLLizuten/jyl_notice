package com.zhbit.web.filter;

import com.zhbit.bean.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PermissionFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Permission filter...................");
		HttpServletRequest httpRequst = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		User loginUser = (User)httpRequst.getSession().getAttribute("LOGINED_USER");
		if (loginUser==null){
			httpResponse.sendRedirect(httpRequst.getContextPath() + httpResponse.encodeRedirectURL("/login.jsp"));
		}else{
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {

	}

}
