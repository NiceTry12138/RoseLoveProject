package com.Service;

import com.Mapper.UsrsMapper;
import com.Pojo.Usrs;
import com.Pojo.UsrsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class Forlogin {

    @Autowired
    UsrsMapper usrsMapper;

    public boolean findPerson(String mail, String passwd){

        UsrsExample usrsExample = new UsrsExample();
        UsrsExample.Criteria criteria = usrsExample.createCriteria();
        criteria.andUsrnameEqualTo(mail);

        List<Usrs> list = usrsMapper.selectByExample(usrsExample);
        if (list.size() == 0)
            return false;
        System.out.println("usr mail = " + mail + " passwd " + list.get(0).getUsrspassword() + " inPaswd = " + passwd);
        if (list.get(0).getUsrspassword().equals(passwd))
            return true;

        return false;
    }

    public boolean findPersonMail(String mail){
        Usrs usrs = usrsMapper.selectByPrimaryKey(mail);
        System.out.println("find mail is " + mail);
        if (usrs == null)
            return true;
        System.out.println("用户存在 " + usrs.getUsremail());
        return false;

    }

}
