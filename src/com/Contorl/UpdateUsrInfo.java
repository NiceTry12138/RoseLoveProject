package com.Contorl;

import com.Pojo.Usrs;
import com.Service.ChangeUsr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;

@Controller
@RequestMapping("UpdateUsrInfo")
public class UpdateUsrInfo {
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

    @RequestMapping(value = "Signature", method = RequestMethod.POST)
    public void updateUsrSignature(){
        String mail = request.getParameter("mail");
        String signature = request.getParameter("signature");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ChangeUsr changeUsr = (ChangeUsr) ac.getBean("changeUsr");
        changeUsr.UpdateUsrSignature(mail, signature);
    }

    @RequestMapping("Password")
    @ResponseBody
    public String updateUsrPasswd(){
        String mail = request.getParameter("mail");
        String passwd = request.getParameter("passwd");
        String vcode = request.getParameter("vcode");
        String mailcode = (String) request.getSession().getAttribute("mailcode");
        if (mailcode == null){
            return null;
        }
        if (vcode.equals(mailcode)){
            return null;
        }
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ChangeUsr changeUsr = (ChangeUsr) ac.getBean("changUsr");
        changeUsr.UpdateUsrPassword(mail, passwd);
        return "{\"state\":\"success\"}";
    }

    @RequestMapping("UsrInfo")
    @ResponseBody
    public String updateUsrInfo() throws ParseException {

        System.out.println("update Usr Info");
        String mail = request.getParameter("mail"); // 邮箱
        String gender = request.getParameter("gender"); // 性别
        String bride = request.getParameter("bride"); // 婚姻状况
        String height = request.getParameter("height"); // 身高
        String income = request.getParameter("income"); // 收入
        String sheng = request.getParameter("sheng"); // 省
        String shi = request.getParameter("shi"); // 市
        String qu = request.getParameter("qu"); // 区
        String education = request.getParameter("education"); // 教育水平
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ChangeUsr changeUsr = (ChangeUsr) ac.getBean("changeUsr");
        changeUsr.UpdateUsrEducation(mail, education);
        changeUsr.UpdateUsrHeight(mail, height);
        changeUsr.UpdateUsrIncome(mail, income);
        changeUsr.UpdateUsrSex(mail, gender);
        changeUsr.UpdateUsrBrideState(mail, bride);
        return "{\"state\":\"success\"}";
    }

    @RequestMapping("photoState")
    @ResponseBody
    public String updatePhotoState(){
        String mail = request.getParameter("mail");
        String photoState = request.getParameter("photoState");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ChangeUsr changeUsr = (ChangeUsr) ac.getBean("changeUsr");
        changeUsr.UpdateUsrPhotoState(mail, photoState);
        return "{\"state\":\"sucess\"}";
    }
}
