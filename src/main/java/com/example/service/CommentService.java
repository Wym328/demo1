package com.example.service;

import com.example.mapper.CommentTableMapper;
import com.example.pojo.CommentTable;
import com.example.pojo.ParkTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentTableMapper commentTableMapper;

    public List<CommentTable> findGG(){
        return commentTableMapper.selectByExample(null);
    }

    public int saveGG(CommentTable commentTable){
        return commentTableMapper.insertSelective(commentTable);
    }

    public CommentTable findByIdGG(int id){
        return commentTableMapper.selectByPrimaryKey(id);
    }

    public int updateGG(CommentTable commentTable){
        return commentTableMapper.updateByPrimaryKeySelective(commentTable);
    }

    public int deleteGG(int id){
        return commentTableMapper.deleteByPrimaryKey(id);
    }
}
