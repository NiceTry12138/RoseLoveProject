package com.Mapper;

import com.Pojo.Passage;
import com.Pojo.PassageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PassageMapper {
    int countByExample(PassageExample example);

    int deleteByExample(PassageExample example);

    int deleteByPrimaryKey(Integer passageid);

    int insert(Passage record);

    int insertSelective(Passage record);

    List<Passage> selectByExampleWithBLOBs(PassageExample example);

    List<Passage> selectByExample(PassageExample example);

    Passage selectByPrimaryKey(Integer passageid);

    int updateByExampleSelective(@Param("record") Passage record, @Param("example") PassageExample example);

    int updateByExampleWithBLOBs(@Param("record") Passage record, @Param("example") PassageExample example);

    int updateByExample(@Param("record") Passage record, @Param("example") PassageExample example);

    int updateByPrimaryKeySelective(Passage record);

    int updateByPrimaryKeyWithBLOBs(Passage record);

    int updateByPrimaryKey(Passage record);
}