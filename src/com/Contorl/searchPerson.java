package com.Contorl;

import com.Pojo.Usrs;
import com.Service.GetUsrInfo;
import com.Service.randUsrs;
import org.apache.catalina.User;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("seachPerson")
public class searchPerson {
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

    @RequestMapping("randomPerson")
    public @ResponseBody String randPerson(){
        List<Integer> randmonId = new ArrayList<Integer>();
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        randUsrs randomusrs = (randUsrs) ac.getBean("randUsrs");
        int sum = randomusrs.getUsrSum();
        for(int i=0; i<8; i++){
            Integer t = (int)(Math.random()*sum);
            randmonId.add(t);
        }
        System.out.println("随机Id");
        List<Usrs> list = randomusrs.getRandUsrs(randmonId);
        Map<Integer, String> map = new HashMap<>();
        int i=0;
        for (Usrs usrs : list){
            map.put(i, usrs.getUsremail());
            i++;
        }
        System.out.println(map.toString());
        JSONObject json = new JSONObject(map);
        return json.toString();
    }

    @RequestMapping("theYear")
    @ResponseBody
    public String theYearLatter(){
        String minyear = request.getParameter("minyear");
        String maxyear = request.getParameter("maxyear");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        randUsrs randomusrs = (randUsrs) ac.getBean("randUsrs");
        List<String> mails = randomusrs.getTheYear(minyear, maxyear);
        JSONArray json = new JSONArray();
        for (int i=0; i<mails.size(); i++){
            json.put(i, mails.get(i));
        }
        System.out.println("开始寻找" + minyear +" 至 " + maxyear);
        System.out.println(json.toString());
        return json.toString();
    }

    @RequestMapping("UsrsSize")
    @ResponseBody
    public int getUserSize(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        randUsrs randomusrs = (randUsrs) ac.getBean("randUsrs");
        return randomusrs.getUsrSum();
    }

    @RequestMapping("usrName")
    @ResponseBody
    public String getUserByName(){
        String usrname = request.getParameter("usrName");
        System.out.println("开始查找用户" + usrname);
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetUsrInfo getUsrInfo = (GetUsrInfo) ac.getBean("getUsrInfo");
        List<String> mails = getUsrInfo.findUsrByName(usrname);
        if (mails == null)
            return "{\"usremail\":\"\"}";
        System.out.println("search Usr " + mails.toString());
        JSONArray json = new JSONArray();
        for (int i=0; i<mails.size(); i++){
            json.put(i, mails.get(i));
        }
        return json.toString();
    }

    @RequestMapping("search")
    @ResponseBody
    public String searchByData(){
        String gender = request.getParameter("gender");
        String min_old = request.getParameter("minold");
        String max_old = request.getParameter("maxold");
        String sheng = request.getParameter("sheng");
        String shi = request.getParameter("shi");
        String qu = request.getParameter("qu");
        String min_height = request.getParameter("minheight");
        String max_height = request.getParameter("maxheight");
        String min_income = request.getParameter("minincome");
        String max_income = request.getParameter("maxincome");
        String occupation = request.getParameter("occupation");
        String Constellation = request.getParameter("constellation");
        String xueli = request.getParameter("education");
        Map<String, String> map = new HashMap<>();
        System.out.println("gender = " + gender);
        if (gender != null && !gender.equals("") && !gender.equals("null"))
            map.put("gender", gender); // 性别
        if (min_old != null && !min_old.equals("") && !min_old.equals("null"))
            map.put("minOld", min_old); // 最低年龄
        if (max_old != null && !max_old.equals("") && !max_old.equals("null"))
            map.put("maxOld", max_old); // 最高年龄
        if (sheng != null && !sheng.equals("") && !sheng.equals("null"))
            map.put("sheng", sheng); // 省
        if (shi != null && !shi.equals("") && !shi.equals("null"))
            map.put("shi", shi); // 市
        if (qu != null && !qu.equals("") && !qu.equals("null"))
            map.put("qu", qu); // 区
        if (min_height != null && !min_height.equals("") && !min_height.equals("null"))
            map.put("minHeight", min_height); // 最低身高
        if (max_height != null && !max_height.equals("") && !max_height.equals("null"))
            map.put("maxHeight", max_height); // 最高身高
        if (min_income != null && !min_income.equals("") && !min_income.equals("null"))
            map.put("minIncome", min_income); // 最低收入
        if (max_income != null && !max_income.equals("") && !max_income.equals("null"))
            map.put("maxIncome", max_income); // 最高收入
        if (occupation != null && !occupation.equals("") && !occupation.equals("null"))
            map.put("occupation", occupation); // 职业
        if (Constellation != null && !Constellation.equals("") && !Constellation.equals("null"))
            map.put("Constellation", Constellation); // 星座
        if (xueli != null && !xueli.equals("") && !xueli.equals("null"))
            map.put("education", xueli);//教育水平
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        randUsrs rand = (randUsrs) ac.getBean("randUsrs");
        System.out.println("开始查找");
        System.out.println(map.toString());
        List<String> mails = rand.getClaimUsers(map);
        JSONArray json = new JSONArray();

        for (int i=0; i<mails.size(); i++){
            json.put(i, mails.get(i));
        }
        System.out.println(json.toString());
        return json.toString();
    }
}
