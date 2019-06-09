package com.Contorl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
//@RequestMapping(value = "/test", method = RequestMethod.POST) 设置请求方式
//@RequestMapping(value = "/test", method = RequestMethod.GET)
@RequestMapping("/changePage")
public class changePage {
    private HttpServletRequest request;
    private HttpServletResponse response;

    @ModelAttribute
    public void bindRequest(HttpServletRequest request){
        this.request = request;
    }
    @ModelAttribute
    public void bindResponse(HttpServletResponse response){
        this.response = response;
    }

    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/register")
    public String toRegister(){
        return "register";
    }

    @RequestMapping("/search")
    public String toSearch(){
        return "search";
    }

    @RequestMapping("/personnal")
    public String toPersonnal(){
        return "personnal";
    }

    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/markmail")
    public String toMarkMail(){ return "markMail"; }

}
