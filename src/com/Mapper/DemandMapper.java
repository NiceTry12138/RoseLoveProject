package com.Mapper;

import com.Pojo.Demand;
import com.Pojo.DemandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemandMapper {
    int countByExample(DemandExample example);

    int deleteByExample(DemandExample example);

    int deleteByPrimaryKey(Integer demandid);

    int insert(Demand record);

    int insertSelective(Demand record);

    List<Demand> selectByExample(DemandExample example);

    Demand selectByPrimaryKey(Integer demandid);

    int updateByExampleSelective(@Param("record") Demand record, @Param("example") DemandExample example);

    int updateByExample(@Param("record") Demand record, @Param("example") DemandExample example);

    int updateByPrimaryKeySelective(Demand record);

    int updateByPrimaryKey(Demand record);
}