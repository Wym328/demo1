package com.example.mapper;

import com.example.pojo.ParkTable;
import com.example.pojo.ParkTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkTableMapper {
    int countByExample(ParkTableExample example);

    int deleteByExample(ParkTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ParkTable record);

    int insertSelective(ParkTable record);

    List<ParkTable> selectByExample(ParkTableExample example);

    ParkTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ParkTable record, @Param("example") ParkTableExample example);

    int updateByExample(@Param("record") ParkTable record, @Param("example") ParkTableExample example);

    int updateByPrimaryKeySelective(ParkTable record);

    int updateByPrimaryKey(ParkTable record);
}