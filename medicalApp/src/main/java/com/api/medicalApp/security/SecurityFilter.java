package com.api.medicalApp.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class SecurityFilter implements Filter {
	private static final Logger logger = LogManager.getLogger(SecurityFilter.class);
	private final static String CLIENT_ID = "credenciales";
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if(request instanceof HttpServletRequest){
			HttpServletRequest req = (HttpServletRequest) request;
			String credentials = req.getHeader("clientid");
			if(credentials != null){
				if(credentials.equals(CLIENT_ID)){
					logger.info("Forwarding request.");
					chain.doFilter(request, response);
				} else {
					if(response instanceof HttpServletResponse){
						logger.error("Invalid credentials.");
						HttpServletResponse res = (HttpServletResponse) response;
						res.setStatus(HttpServletResponse.SC_FORBIDDEN);
					}
				}
			}
		} else {
			logger.fatal("It wasn't possible to filter the request.");
		}
	}

	@Override
	public void destroy() {
		
	}

}
