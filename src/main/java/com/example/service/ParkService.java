package com.example.service;

import com.example.mapper.ParkTableMapper;
import com.example.pojo.ParkTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkService {
    @Autowired
    ParkTableMapper parkTableMapper;

    public List<ParkTable> findAll(){
        return parkTableMapper.selectByExample(null);
    }

    public int saveAll(ParkTable parkTable){
        return parkTableMapper.insertSelective(parkTable);
    }

    public ParkTable findById(int id){
        return parkTableMapper.selectByPrimaryKey(id);
    }

    public int update(ParkTable parkTable){
        return parkTableMapper.updateByPrimaryKeySelective(parkTable);
    }

    public int delete(int id){
        return parkTableMapper.deleteByPrimaryKey(id);
    }
}
