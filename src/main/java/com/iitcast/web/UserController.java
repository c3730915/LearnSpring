package com.iitcast.web;


import com.iitcast.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller
 */

@Controller
public class UserController {
    @RequestMapping("/quick")
    public String save(){
        System.out.println("save running....");
        return "success.jsp";
    }
    @RequestMapping("/quick2")
    public ModelAndView save2(){
        /**
         * Modle 模型用于封装数据
         * View 视图 用于展示数据
         *
         */
        ModelAndView modelAndView =new ModelAndView();
        //设置视图名称
        modelAndView.setViewName("indexTmp.jsp");
        modelAndView.addObject("username","itcast");
        return modelAndView;
    }
    public ModelAndView save3(ModelAndView modelAndView)
    {

        modelAndView.setViewName("indexTmp.jsp");
        modelAndView.addObject("username","itcast");
        return modelAndView;
    }
    @ResponseBody
    //告诉mvc框架，不要进行数据跳转，直接进行数据相应
    @RequestMapping("/quick4")
    public String save4(){
        return "Hello Itheima";
    }

    @RequestMapping("/quick5")
    public String save5(VO vo){
        return null;
    }

    @RequestMapping("/quick6/{username}")
    @ResponseBody
    /**
     * Restful style
     */
    public String save6(@PathVariable("username")String username){
        System.out.println(username);
        return null;
    }
    @RequestMapping("/quick7")
    @ResponseBody
    public String save7(){
        return null;
    }
}
