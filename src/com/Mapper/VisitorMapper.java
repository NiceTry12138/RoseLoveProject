package com.Mapper;

import com.Pojo.Visitor;
import com.Pojo.VisitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitorMapper {
    int countByExample(VisitorExample example);

    int deleteByExample(VisitorExample example);

    int deleteByPrimaryKey(Integer visitimformationid);

    int insert(Visitor record);

    int insertSelective(Visitor record);

    List<Visitor> selectByExample(VisitorExample example);

    Visitor selectByPrimaryKey(Integer visitimformationid);

    int updateByExampleSelective(@Param("record") Visitor record, @Param("example") VisitorExample example);

    int updateByExample(@Param("record") Visitor record, @Param("example") VisitorExample example);

    int updateByPrimaryKeySelective(Visitor record);

    int updateByPrimaryKey(Visitor record);
}