package com.zhbit.web.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
	private FilterConfig filterConfig;
	private final String DEFAULTCHARSET = "UTF-8";
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("Character filter...................");
		String charset = filterConfig.getInitParameter("charset");
		if (charset==null)
			charset = DEFAULTCHARSET;
		request.setCharacterEncoding(charset);
		response.setContentType("text/html;charset=" + charset);
		response.setCharacterEncoding(charset);
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
