package com.Contorl;

import com.Pojo.Address;
import com.Pojo.Demand;
import com.Pojo.Hobby;
import com.Pojo.Usrs;
import com.Service.Forlogin;
import com.Service.GetUsrInfo;
import com.Service.randUsrs;
import com.Utli.SendMail;
import org.aspectj.apache.bcel.util.ClassPath;
import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class login {
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
    public void forLogin() throws ServletException, IOException {
        String mail = request.getParameter("userName");
        String passwd = request.getParameter("password");
        String vcode = request.getParameter("vcode");
        String code = (String) request.getSession().getAttribute("vcode");

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Forlogin forlogin = (Forlogin) ac.getBean("forlogin");
        GetUsrInfo usrInfo = (GetUsrInfo) ac.getBean("getUsrInfo");

        if (!forlogin.findPerson(mail, passwd)){
            request.setAttribute("msg","邮箱或密码错误");
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return ;
        }
        if (!vcode.equals(code)){
            request.setAttribute("msg", "验证码错误");

            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;
        }

        System.out.println("登录成功");
        randUsrs rand = (randUsrs) ac.getBean("randUsrs");
        Usrs usr = rand.getTheUsrByMail(mail);
        Address address = usrInfo.getAddressByMail(mail);
        Demand demand = usrInfo.getDemandByMail(mail);
        System.out.println("usr = " + usr.toString());
        request.getSession().setAttribute("usr", usr);
        request.getSession().setAttribute("address", address);
        request.getSession().setAttribute("demand", demand);
        request.getRequestDispatcher("personnal.jsp").forward(request, response);
    }

    @RequestMapping("sendmail")
    public void sendMail() throws MessagingException {
        String mail = request.getParameter("mail");
        SendMail sendMail = new SendMail();
        sendMail.SendYourMail(mail);
        String vcode = sendMail.getText();
        request.getSession().setAttribute("mailcode", vcode);
    }

}
