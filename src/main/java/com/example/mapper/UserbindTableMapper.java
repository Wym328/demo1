package com.example.mapper;

import com.example.pojo.UserbindTable;
import com.example.pojo.UserbindTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserbindTableMapper {
    int countByExample(UserbindTableExample example);

    int deleteByExample(UserbindTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserbindTable record);

    int insertSelective(UserbindTable record);

    List<UserbindTable> selectByExample(UserbindTableExample example);

    UserbindTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserbindTable record, @Param("example") UserbindTableExample example);

    int updateByExample(@Param("record") UserbindTable record, @Param("example") UserbindTableExample example);

    int updateByPrimaryKeySelective(UserbindTable record);

    int updateByPrimaryKey(UserbindTable record);
}