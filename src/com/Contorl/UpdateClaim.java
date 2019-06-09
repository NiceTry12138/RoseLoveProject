package com.Contorl;

import com.Service.ChangeDemanInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller

public class UpdateClaim {
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

    @RequestMapping("UpdateClaim")
    @ResponseBody
    public String updateClaim(){

        String mail = request.getParameter("mail");
        String gender = request.getParameter("gender");
        String minOld = request.getParameter("minOld");
        String maxOld = request.getParameter("maxOld");
        String minHeight = request.getParameter("minHeight");
        String maxHeight = request.getParameter("maxHeight");
        String education = request.getParameter("education");
        String bride = request.getParameter("bride");

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ChangeDemanInfo changeDemanInfo = (ChangeDemanInfo) ac.getBean("changeDemanInfo");
        if (changeDemanInfo.updateDemand(mail, gender, minOld, maxOld, minHeight, maxHeight, education, bride))
            return "{\"success\":\"success\"}";
        return null;
    }
}
