package com.example.controller;

import com.example.pojo.ParkTable;
import com.example.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ParkController {
    @Autowired
    ParkService parkService;

    @RequestMapping("findAll")
    public String findAll(Model model){
        List<ParkTable> listAll = parkService.findAll();
        model.addAttribute("listAll",listAll);
        return "Aindex";
    }

    @RequestMapping("saveAll")
    public String saveAll(ParkTable parkTable){
        int result = parkService.saveAll(parkTable);
        if (result==1){
            return "redirect:/findAll";
        }else {
            return "insertAll";
        }
    }

    @RequestMapping("findById")
    public String findById(int id,Model model){
        ParkTable parkTable = parkService.findById(id);
        model.addAttribute("parkTable",parkTable);
        return "update";
    }

    @RequestMapping("update")
    public String update(ParkTable parkTable){
        parkService.update(parkTable);
        return "user";
    }

    @RequestMapping("delete")
    public String delete(int id,Model model){
        parkService.delete(id);
        return "redirect:/findAll";
    }
}
