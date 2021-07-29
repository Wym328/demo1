package com.example.mapper;

import com.example.pojo.CommentTable;
import com.example.pojo.CommentTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentTableMapper {
    int countByExample(CommentTableExample example);

    int deleteByExample(CommentTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommentTable record);

    int insertSelective(CommentTable record);

    List<CommentTable> selectByExample(CommentTableExample example);

    CommentTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommentTable record, @Param("example") CommentTableExample example);

    int updateByExample(@Param("record") CommentTable record, @Param("example") CommentTableExample example);

    int updateByPrimaryKeySelective(CommentTable record);

    int updateByPrimaryKey(CommentTable record);
}