package com.gui.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInterceptor1 implements HandlerInterceptor
{
    public void afterCompletion(HttpServletRequest arg0,
                                HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception
    {
        System.out.println("TestInterceptor1.afterCompletion()");
    }

    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
                           Object arg2, ModelAndView arg3) throws Exception
    {
        System.out.println("TestInterceptor1.postHandle()");
    }

    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
                             Object arg2) throws Exception
    {
        System.out.println("TestInterceptor1.preHandle()");
        return true;
    }
}
