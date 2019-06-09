package com.Mapper;

import com.Pojo.Usrs;
import com.Pojo.UsrsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrsMapper {
    int countByExample(UsrsExample example);

    int deleteByExample(UsrsExample example);

    int deleteByPrimaryKey(String usremail);

    int insert(Usrs record);

    int insertSelective(Usrs record);

    List<Usrs> selectByExample(UsrsExample example);

    Usrs selectByPrimaryKey(String usremail);

    int updateByExampleSelective(@Param("record") Usrs record, @Param("example") UsrsExample example);

    int updateByExample(@Param("record") Usrs record, @Param("example") UsrsExample example);

    int updateByPrimaryKeySelective(Usrs record);

    int updateByPrimaryKey(Usrs record);
}