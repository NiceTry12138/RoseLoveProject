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
public class ChangeDeman {
    @Autowired
    DemandMapper demandMapper;

    public Demand getDeman(String mail){
        DemandExample demandExample = new DemandExample();
        DemandExample.Criteria criteria = demandExample.createCriteria();
        criteria.andUsremailEqualTo(mail);
        List<Demand> demands = demandMapper.selectByExample(demandExample);
        Demand demand = demands.get(0);

        return demand;
    }

    public void UpdateDemanSex(String mail, String sex){
        Demand demand = getDeman(mail);
        demand.setDemandsex(sex);
        demandMapper.updateByPrimaryKey(demand);
    }

    public void UpdateDemanBrideState(String mail, String state){
        Demand demand = getDeman(mail);
        demand.setDemandmaritalstate(state);
        demandMapper.updateByPrimaryKey(demand);
    }

    public void UpdateDemandHeight(String mail, String height){
        Demand demand = getDeman(mail);
        demand.setDemandheight((new Integer(height)).floatValue());
        demandMapper.updateByPrimaryKey(demand);
    }

    public void UpdateDemandMinAge(String mail, String minAge){
        Demand demand = getDeman(mail);
        demand.setDemandminage(new Integer(minAge));
        demandMapper.updateByPrimaryKey(demand);
    }

    public void UpdateDemandMaxAge(String mail, String maxAge){
        Demand demand = getDeman(mail);
        demand.setDemandmaxage(new Integer(maxAge));
        demandMapper.updateByPrimaryKey(demand);
    }

    public void UpdateDemanEducation(String mail, String education){
        Demand demand = getDeman(mail);
        demand.setDemandeducation(education);
        demandMapper.updateByPrimaryKey(demand);
    }
}
