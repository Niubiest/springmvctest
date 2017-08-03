package com.xrq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class TestController
{
    @RequestMapping
    public String dispatchTest()
    {
        System.out.println("Enter TestController.dispatchTest");
        return "test";
    }

    @RequestMapping(value = "/add")
    public String dispatchAddTest()
    {
        System.out.println("Enter TestControll.dispatchAddTest()");
        return "add1";
    }

    @RequestMapping(value = "/add/add")
    public String dispatchAddAddTest()
    {
        System.out.println("Enter TestControll.dispatchAddAddTest()");
        return "add2";
    }

    @RequestMapping(value = "/del")
    public String dispatchDelTest()
    {
        System.out.println("Enter TestControll.dispatchDelTest()");
        return "del";
    }

    @RequestMapping(value = "/test")
    public String dispatchTest(String test)
    {
        System.out.println("Enter TestController.dispatchTest(), test: " + test);
        return "redirect:/test2.jsp?test="+test;
    }
}
