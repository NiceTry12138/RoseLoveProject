package com.Contorl;

import com.Pojo.Address;
import com.Pojo.Usrs;
import com.Service.Forlogin;
import com.Service.SaveUsr;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class register {
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

    @RequestMapping("register")
    @ResponseBody
    public String registUsr() throws ParseException {

        String mailCode = (String) request.getSession().getAttribute("mailcode");// mail 的验证码

        String usrName = request.getParameter("usrname"); // 用户名
        String passwd = request.getParameter("passwd"); // 密码
        String vcode = request.getParameter("vcode"); // 验证码
        String mail = request.getParameter("mail"); // 邮箱
        String gender = request.getParameter("gender"); // 性别
        String bride = request.getParameter("bride"); // 婚姻状况
        String birth = request.getParameter("birth"); // 生日
        String height = request.getParameter("height"); // 身高
        String income = request.getParameter("income"); // 收入
        String sheng = request.getParameter("sheng"); // 省
        String shi = request.getParameter("shi"); // 市
        String qu = request.getParameter("qu"); // 区
        String education = request.getParameter("education"); // 教育水平
        String constellation = request.getParameter("constellation");
        System.out.println("开始注册 mail = " + mail + " mailcode = " + mailCode + " vcode = " + vcode);

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Forlogin forlogin = (Forlogin) ac.getBean("forlogin");

        if (!forlogin.findPersonMail(mail)){
            System.out.println("邮箱存在");
            request.getSession().setAttribute("registmsg", "邮箱存在");
            return "register.jsp";
        }

        if (mailCode == null || !mailCode.equals(vcode)){
            System.out.println("验证码错误");
            request.getSession().setAttribute("registmsg", "验证码错误");
            return "register.jsp";
        }
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Usrs usrs = new Usrs();
        usrs.setUsrname(usrName);
        usrs.setUsrincome(new Integer(income));
        usrs.setUsremail(mail);
        usrs.setUsrbirth(format.parse(birth));
        usrs.setUsreducation(education);
        usrs.setUsrheight((new Integer(height)).floatValue());
        usrs.setUsrsex(gender);
        usrs.setUsrmaritalstate(bride);
        usrs.setUsrspassword(passwd);
        usrs.setUsrconstellation(constellation);

        Address address = new Address();
        address.setUsremail(mail);
        address.setUsrcity(shi);
        address.setUsrprovince(sheng);
        address.setUsrcountry(qu);

        SaveUsr saveUsr = (SaveUsr) ac.getBean("saveUsr");
        saveUsr.saveUsrs(usrs);

        System.out.println(usrs.toString());
        request.getSession().setAttribute("usr", usrs);
        request.getSession().setAttribute("address", address);

        return "index.jsp";
    }
}
