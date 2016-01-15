package com.demo.myproject.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by tianwen on 16/1/10.
 */
public class MyFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {



        System.out.println("do ----  Filter");

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("done ----  Filter");

    }

    @Override
    public void destroy() {

    }
}
