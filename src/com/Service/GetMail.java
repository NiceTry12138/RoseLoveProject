package com.Service;

import com.Mapper.EmailMapper;
import com.Pojo.Email;
import com.Pojo.EmailExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class GetMail {
    @Autowired
    EmailMapper emailMapper;

    public List<Email> getSendEmail(String mail){ // 获得我发送的邮件
        System.out.println("开始获得邮件");
        EmailExample emailExample = new EmailExample();
        emailExample.createCriteria().andEmailsenderEqualTo(mail).andEmailifdeletedEqualTo("false"); // 如果是true 则不获得 true 代表被删除
        System.out.println("获得完毕");
        return emailMapper.selectByExample(emailExample);
    }

    public List<Email> getGetEmail(String mail){ // 获得发给我的邮件
        System.out.println("开始获得邮件");
        EmailExample emailExample = new EmailExample();
        EmailExample.Criteria criteria = emailExample.createCriteria();
        criteria.andEmailrecipientEqualTo(mail).andEmailifdeletedEqualTo("false");
        System.out.println("获得完毕 ");
        return emailMapper.selectByExample(emailExample);
    }

    public void deleteTheEmailById(Integer id){// 删除邮件
        Email email = emailMapper.selectByPrimaryKey(id);
        email.setEmailifdeleted("true"); // 作为被删除邮件
        emailMapper.updateByPrimaryKey(email);
    }
}
