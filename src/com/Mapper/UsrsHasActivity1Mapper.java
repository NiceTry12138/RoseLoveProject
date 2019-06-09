package com.Mapper;

import com.Pojo.UsrsHasActivity1Example;
import com.Pojo.UsrsHasActivity1Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrsHasActivity1Mapper {
    int countByExample(UsrsHasActivity1Example example);

    int deleteByExample(UsrsHasActivity1Example example);

    int deleteByPrimaryKey(UsrsHasActivity1Key key);

    int insert(UsrsHasActivity1Key record);

    int insertSelective(UsrsHasActivity1Key record);

    List<UsrsHasActivity1Key> selectByExample(UsrsHasActivity1Example example);

    int updateByExampleSelective(@Param("record") UsrsHasActivity1Key record, @Param("example") UsrsHasActivity1Example example);

    int updateByExample(@Param("record") UsrsHasActivity1Key record, @Param("example") UsrsHasActivity1Example example);
}