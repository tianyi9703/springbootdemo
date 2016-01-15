package com.demo.myproject.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tianwen
 */
public class SystemInterceptor implements HandlerInterceptor {
    private final static Logger logger = LoggerFactory.getLogger(SystemInterceptor.class);

    /**
     * 拦截器入口
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {



        logger.info("拦截器------开始");

            return true;

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

}
