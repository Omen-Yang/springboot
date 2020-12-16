package com.controller;

import com.po.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController

public class UsersController {
    @RequestMapping(value = "check.do",method = RequestMethod.GET)
    public ModelAndView check(HttpServletRequest request, HttpServletResponse response, Users user){
        String us=user.getUname();
        String ps=user.getPasswd();
        System.out.println("账号:"+us.toString()+"\n"+"密码:"+ps.toString());
        ModelAndView mv=new ModelAndView();
        if (user!=null){
            if (us!=""&&ps!=""){
                System.out.println("true");
                mv.addObject("us",user);
                mv.setViewName("ok.jsp");
                return  mv;
            }
            System.out.println("无传入参数");
        }
        System.out.println("false");
        mv.setViewName("Error.jsp");
        return mv;
    }
}
