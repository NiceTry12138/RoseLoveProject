package com.Mapper;

import com.Pojo.Email;
import com.Pojo.EmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailMapper {
    int countByExample(EmailExample example);

    int deleteByExample(EmailExample example);

    int deleteByPrimaryKey(Integer emailid);

    int insert(Email record);

    int insertSelective(Email record);

    List<Email> selectByExample(EmailExample example);

    Email selectByPrimaryKey(Integer emailid);

    int updateByExampleSelective(@Param("record") Email record, @Param("example") EmailExample example);

    int updateByExample(@Param("record") Email record, @Param("example") EmailExample example);

    int updateByPrimaryKeySelective(Email record);

    int updateByPrimaryKey(Email record);
}