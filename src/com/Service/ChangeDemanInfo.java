package com.Service;

import com.Mapper.DemandMapper;
import com.Pojo.Demand;
import com.Pojo.DemandExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class ChangeDemanInfo {
    @Autowired
    DemandMapper demandMapper;

    public Demand getDemanByMail(String mail){
        DemandExample demandExample = new DemandExample();
        DemandExample.Criteria criteria = demandExample.createCriteria();
        criteria.andUsremailEqualTo(mail);
        List<Demand> list = demandMapper.selectByExample(demandExample);
        System.out.println("更新前 Deman 为 " + list.get(0).toString());
        if (list == null)
            return null;
        return list.get(0);
    }

    public boolean updateDemand(String mail,String gender,String minOld,String maxOld,String minHeight,
            String maxHeight,String education,String bride ){
        Demand demand = getDemanByMail(mail);
        if (demand == null)
            return false;
        demand.setDemandeducation(education);
        demand.setDemandmaxage(new Integer(maxOld));
        demand.setDemandminage(new Integer(minOld));
        demand.setDemandheight((new Integer(minHeight)).floatValue());
        demand.setDemandsex(gender);
        demand.setDemandmaritalstate(bride);
        System.out.println("Demand 更新为 " + demand.toString());
        demandMapper.updateByPrimaryKey(demand);
        System.out.println("Deman 更新成功");
        return true;
    }
}
