package com.Contorl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
//@RequestMapping(value = "/test", method = RequestMethod.POST) 设置请求方式
//@RequestMapping(value = "/test", method = RequestMethod.GET)
@RequestMapping("/test")
public class TestController {
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

    @RequestMapping("/test")
    public String test(){
        System.out.println("Tets");
        request.setAttribute("msg", "hello world");
        return "hello";
    }



}
