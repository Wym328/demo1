package com.example.controller;

import com.example.pojo.AdminTable;
import com.example.pojo.ParkuserTable;
import com.example.service.AdminService;
import com.example.service.ParkuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    AdminService adminService;
    @Autowired
    ParkuserService parkuserService;
    @RequestMapping("openlogin")
    public String openlogin(){
        return "login";
    }
    @RequestMapping("logins")
    public String login(ParkuserTable parkuserTable, Model model, HttpSession session){
        List<ParkuserTable> parkuserTableList = parkuserService.selectName(parkuserTable);
        List<AdminTable> adminTableList = adminService.selectName(parkuserTable.getUserName(),parkuserTable.getUserPassword());
        if (adminTableList.size()>0){
            session.setAttribute("name",parkuserTable.getUserName());
            return "Aindex";
        }else if (parkuserTableList.size()>0){
            session.setAttribute("name",parkuserTable.getUserName());
            return "Uindex";
        }else {
            model.addAttribute("msg","登录名或密码错误请重新登录!!!!!!!");
            return "login";
        }
    }
}
