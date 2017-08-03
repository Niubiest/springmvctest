package com.gui.controller;

import com.gui.entity.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class TestController
{
    //@RequestMapping
    //public String dispatchTest()
    //{
    //    System.out.println("Enter TestController.dispatchTest");
    //    return "test";
    //}

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

    @RequestMapping
    public String dispatchTest(Test test, Model model)
    {
        model.addAttribute("modelKey", "modelValue");
        return "test3";
    }

    //重定向
    //@RequestMapping
    //public String dispatchTest(Test test, HttpSession session)
    //{
    //    session.setAttribute("modelKey", "modelValue");
    //    return "redirect:/test.jsp";
    //    //return "test";
    //}
}
