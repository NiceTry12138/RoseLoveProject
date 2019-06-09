package com.Contorl;

import com.Service.GetMail;
import com.Service.randUsrs;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("SearchMail")
public class SearchMail {
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

    @RequestMapping("sendMail")
    @ResponseBody
    public String getSendMail(){
        String mail = request.getParameter("mail");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetMail getMail  = (GetMail) ac.getBean("getMail");
        String result = getMail.getSendEmail(mail).toString();
        System.out.println(result);
        return result;
    }

    @RequestMapping("getMail")
    @ResponseBody
    public String getGetMail(){
        String mail = request.getParameter("mail");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetMail getMail  = (GetMail) ac.getBean("getMail");
        String result = getMail.getGetEmail(mail).toString();
        System.out.println(result);
        return result;
    }

    @RequestMapping("deleteMail")
    @ResponseBody
    public String deleteMail(){
        String mailId = request.getParameter("mailId");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetMail getMail  = (GetMail) ac.getBean("getMail");
        getMail.deleteTheEmailById(new Integer(mailId));
        return "{\"success\":\"success\"}";
    }
}
