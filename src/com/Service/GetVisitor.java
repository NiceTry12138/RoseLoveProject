package com.Service;

import com.Mapper.VisitorMapper;
import com.Pojo.Visitor;
import com.Pojo.VisitorExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class GetVisitor {

    @Autowired
    private VisitorMapper visitorMapper;

    public List<String> getVisitor(String mail){
        VisitorExample visitorExample = new VisitorExample();
        VisitorExample.Criteria criteria = visitorExample.createCriteria();
        criteria.andUsremailEqualTo(mail);
        List<Visitor> visitors = visitorMapper.selectByExample(visitorExample);
        if (visitors == null)
            return null;
        List<String> mails = new ArrayList<>();
        for (Visitor visitor : visitors){
            mails.add(visitor.getUsremail());
        }

        return mails;
    }
}
