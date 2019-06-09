package com.Service;

import com.Mapper.*;
import com.Pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class GetUsrInfo {

    @Autowired
    UsrsMapper usrsMapper;
    @Autowired
    AddressMapper addressMapper;
    @Autowired
    HobbyMapper hobbyMapper;
    @Autowired
    PassageMapper passageMapper;
    @Autowired
    DemandMapper demandMapper;

    public Address getAddressByMail(String mail){
        AddressExample addressExample = new AddressExample();
        AddressExample.Criteria criteria = addressExample.createCriteria();
        criteria.andUsremailEqualTo(mail);
        List<Address> addresses = addressMapper.selectByExample(addressExample);
        System.out.println("address is used");
        return addresses.get(0);
    }

    public List<Hobby> getHobbyByMail(String mail){
        HobbyExample hobbyExample = new HobbyExample();
        HobbyExample.Criteria criteria = hobbyExample.createCriteria();
        criteria.andUsremailEqualTo(mail);
        List<Hobby> hobbies = hobbyMapper.selectByExample(hobbyExample);
        System.out.println("hobby is ussed");
        return hobbies;
    }

    public Demand getDemandByMail(String mail){
        DemandExample demandExample = new DemandExample();
        DemandExample.Criteria criteria = demandExample.createCriteria();
        criteria.andUsremailEqualTo(mail);
        List<Demand> demands = demandMapper.selectByExample(demandExample);
        System.out.println("demand is used");
        return demands.get(0);
    }

    public List<String> findUsrByName(String name){
        UsrsExample usrsExample = new UsrsExample();
        UsrsExample.Criteria criteria = usrsExample.createCriteria();
        criteria.andUsrnameEqualTo(name);
        List<Usrs> list = usrsMapper.selectByExample(usrsExample);
        List<String> mails = new ArrayList<>();
        for (Usrs usrs : list){
            mails.add(usrs.getUsremail());
        }
        if (list.size() == 0)
            return null;
        else
            return mails;
    }
}
