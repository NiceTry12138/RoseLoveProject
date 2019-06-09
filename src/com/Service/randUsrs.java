package com.Service;

import com.Mapper.AddressMapper;
import com.Mapper.UsrsMapper;
import com.Pojo.Address;
import com.Pojo.AddressExample;
import com.Pojo.Usrs;
import com.Pojo.UsrsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.*;

@Component
@Service
public class randUsrs {
    @Autowired
    private UsrsMapper usrsMapper;
    @Autowired
    private AddressMapper addressMapper;

    public List<Usrs> getRandUsrs(List<Integer> list){
        List<Usrs> usrs = new ArrayList<>();
        List<Usrs> example = usrsMapper.selectByExample(null);
        System.out.println("Usrs is used");
        for (int i=0; i<list.size(); i++){
            usrs.add(example.get(list.get(i)));
        }
        System.out.println("size = " + list.size());
        return usrs;
    }

    public List<String> getClaimUsers(Map<String, String> map){
        AddressExample addressExample = new AddressExample();
        UsrsExample usrsExample = new UsrsExample();
        Integer minH = 0; // 最低高度
        Integer maxH = 0; // 最高高度
        Integer minO = 0; // 最低年龄
        Integer maxO = 0; // 最高年龄
        Integer maxI = 0; // 最高收入
        Integer minI = 0; // 最低年龄
        for (String key : map.keySet()){
            switch (key){
                case "minHeight":
                    String minHeight = map.get(key);
                    if ( minHeight == null || minHeight.equals(""))
                        break;
                    minH = new Integer(minHeight);
                    break;
                case "maxHeight":
                    String maxHeight = map.get("maxHeight");
                    if ( maxHeight == null || maxHeight.equals(""))
                        break;
                    maxH = new Integer(maxHeight);
                    break;
                case "minOld":
                    String minOld = map.get("minOld");
                    if ( minOld == null || minOld.equals(""))
                        break;
                    minO = new Integer(minOld);
                    break;
                case "maxOld":
                    String maxOld = map.get("maxOld");
                    if ( maxOld == null || maxOld.equals(""))
                        break;
                    maxO = new Integer(maxOld);
                    break;
                case "minIncome":
                    String minIncome = map.get("minIncome");
                    if ( minIncome == null || minIncome.equals(""))
                        break;
                    minI = new Integer(minIncome);
                    break;
                case "maxIncome":
                    String maxIncome = map.get("maxIncome");
                    if ( maxIncome == null || maxIncome.equals(""))
                        break;
                    maxI = new Integer(maxIncome);
                    break;
            }
        }
        if (minH != 0 && maxH != 0){ // 对 上线和下限都有要求
            usrsExample.or().andUsrheightBetween(minH.floatValue(), maxH.floatValue());
        } else if (minH != 0 && maxH == 0){ // 对 下限又要求 无上限
            usrsExample.or().andUsrheightGreaterThanOrEqualTo(minH.floatValue());
        } else if (minH == 0 && maxH != 0){ // 对 上限又要求 无下限
            usrsExample.or().andUsrheightLessThanOrEqualTo(maxH.floatValue());
        }

        if (minI != 0 && maxI != 0) {
            usrsExample.or().andUsrincomeBetween(maxI, maxI);
        } else if (minI != 0 && maxI == 0) {
            usrsExample.or().andUsrincomeGreaterThanOrEqualTo(minI);
        } else if (minI == 0 && maxI != 0) {
            usrsExample.or().andUsrincomeLessThanOrEqualTo(maxI);
        }
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        if (minO != 0 && maxO != 0){
            Date minDate = new Date(year-minO, 1, 1);
            Date maxDate = new Date(year-maxO, 12, 31);
            usrsExample.or().andUsrbirthBetween(minDate, maxDate);
        } else if (minO != 0 && maxO == 0){
            Date date = new Date(year-minO, 1, 1);
            usrsExample.or().andUsrbirthGreaterThanOrEqualTo(date);
        } else if (minO == 0 && maxO != 0){
            Date date = new Date(year-maxO, 12, 31);
            usrsExample.or().andUsrbirthLessThanOrEqualTo(date);
        }

        if (map.containsKey("gender")){ // 性别
            if (!map.get("gender").equals(""))
                usrsExample.or().andUsrsexEqualTo(map.get("gender"));
        }
        if (map.containsKey("Constellation")) {//星座
            if (!map.get("Constellation").equals(""))
                usrsExample.or().andUsrconstellationEqualTo(map.get("Constellation"));
        }
        if (map.containsKey("occupation")){ // 职业
            if (!map.get("occupation").equals(""))
                usrsExample.or().andUsroccupationEqualTo(map.get("occupation"));
        }
        if (map.containsKey("education")){ // 教育
            if (!map.get("education").equals(""))
                usrsExample.or().andUsreducationEqualTo(map.get("education"));
        }
        List<Usrs> usrsList = usrsMapper.selectByExample(usrsExample);

        if (map.containsKey("sheng")){
            if (!map.get("sheng").equals(""))
                addressExample.or().andUsrprovinceEqualTo(map.get("sheng"));
        }
        if (map.containsKey("shi")){
            if (!map.get("shi").equals(""))
                addressExample.or().andUsrcityEqualTo(map.get("shi"));
        }
        if (map.containsKey("qu")){
            if (!map.get("qu").equals(""))
                addressExample.or().andUsrcountryEqualTo("qu");
        }
        List<Address> addressList = addressMapper.selectByExample(addressExample);

        List<String> usrsMail = new ArrayList<>();

        for (Usrs usr : usrsList){
            String mail = usr.getUsremail();
            for (Address address : addressList){
                if ((address.getUsremail()).equals(mail)){
                    usrsMail.add(usr.getUsremail());
                    System.out.println("查找到的Usr 的 Mail 是" + usr.getUsremail());
                    break;
                }
            }
        }
        return usrsMail;
    }

    public int getUsrSum(){
        List<Usrs> list = usrsMapper.selectByExample(null);
        return list.size();
    }

    public List<String> getTheYear(String mingyear, String maxyear){
        UsrsExample usrsExample = new UsrsExample();
        UsrsExample.Criteria criteria = usrsExample.createCriteria();
        GregorianCalendar mindate = new GregorianCalendar();
        mindate.set(Calendar.YEAR, Integer.parseInt(mingyear));//设置年
        mindate.set(Calendar.MONTH, 0);//这里0是1月..以此向后推
        mindate.set(Calendar.DAY_OF_MONTH, 1);//设置天

        GregorianCalendar maxdate = new GregorianCalendar();
        maxdate.set(Calendar.YEAR, Integer.parseInt(maxyear));//设置年
        maxdate.set(Calendar.MONTH, 0);//这里0是1月..以此向后推
        maxdate.set(Calendar.DAY_OF_MONTH, 1);//设置天

        criteria.andUsrbirthBetween(mindate.getTime(), maxdate.getTime());
        List<Usrs> usrs = usrsMapper.selectByExample(usrsExample);
        List<String> mails = new ArrayList<>();
        for (Usrs usr : usrs){
            mails.add(usr.getUsremail());
        }
        return mails;
    }

    public Usrs getTheUsrByMail(String mail){
        return usrsMapper.selectByPrimaryKey(mail);
    }
}
