package com.example.service;

import com.example.mapper.ParkuserTableMapper;
import com.example.pojo.ParkuserTable;
import com.example.pojo.ParkuserTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkuserService {
    @Autowired
    ParkuserTableMapper parkuserTableMapper;
    //登陆验证
    public List<ParkuserTable> selectName(ParkuserTable parkuserTable){
        ParkuserTableExample parkuserTableExample = new ParkuserTableExample();
        parkuserTableExample.createCriteria().andUserNameEqualTo(parkuserTable.getUserName()).andUserPasswordEqualTo(parkuserTable.getUserPassword());
        List<ParkuserTable> parkuserTableList = parkuserTableMapper.selectByExample(parkuserTableExample);
        return parkuserTableList;
    }

}
