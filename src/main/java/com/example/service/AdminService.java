package com.example.service;

import com.example.mapper.AdminTableMapper;
import com.example.pojo.AdminTable;
import com.example.pojo.AdminTableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    AdminTableMapper adminTableMapper;
    //登陆验证
    public List<AdminTable> selectName(String name, String password) {
        AdminTableExample adminTableExample = new AdminTableExample();
        adminTableExample.createCriteria().andNameEqualTo(name).andPasswordEqualTo(password);
        return adminTableMapper.selectByExample(adminTableExample);
    }

}
