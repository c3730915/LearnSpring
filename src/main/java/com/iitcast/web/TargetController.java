package com.iitcast.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TargetController {
    @RequestMapping("/target")
    public ModelAndView show(){
        System.out.println("running");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","itcast");
        modelAndView.setViewName("indexTmp");
        return modelAndView;
    }
}
