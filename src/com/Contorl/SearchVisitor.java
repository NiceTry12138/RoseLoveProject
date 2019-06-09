package com.Contorl;

import com.Service.GetVisitor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class SearchVisitor {
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

    @RequestMapping("SearchVisitor")
    @ResponseBody
    public String getVisitor(){
        System.out.println("查找访客 828481273498213");
        String mail = request.getParameter("mail");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetVisitor getVisitor = (GetVisitor) ac.getBean("getVisitor");
        List<String> mails = getVisitor.getVisitor(mail);
        if (mails == null)
            return "{\"usremail\":\"\"}";
        JSONArray json = new JSONArray();
        for (int i=0; i<mails.size(); i++){
            json.put(i, mails.get(i));
        }
        System.out.println(json.toString());
        return json.toString();
    }
}
