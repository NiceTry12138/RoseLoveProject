package com.Contorl;


import com.Pojo.Activity;
import com.Service.ActivityService;
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
@RequestMapping("Activity")
public class ActivityController {
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

    @RequestMapping("allActivity")
    @ResponseBody
    public String allActivity(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ActivityService activityService = (ActivityService) ac.getBean("activityService");
        String acs = activityService.allActivity().toString();
        System.out.println("总共的活动");
        System.out.println(acs);
        return acs;
    }
    @RequestMapping("theActivity")
    @ResponseBody
    public String theActivity(){
        String mail = request.getParameter("mail");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ActivityService activityService = (ActivityService) ac.getBean("activityService");
        List<Activity> activityList = activityService.myActivity(mail);
        if (activityList == null)
            return "null";
        String str = activityList.toString();
        System.out.println("你的活动是 " + str);
        return str;
    }

    @RequestMapping("deleteActivity")
    public void deleteActivity(){
        String id = request.getParameter("id");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ActivityService activityService = (ActivityService) ac.getBean("activityService");
        activityService.deleteActivity(new Integer(id));
    }

    @RequestMapping("addActivity")
    public void addActivity(){

    }
}
