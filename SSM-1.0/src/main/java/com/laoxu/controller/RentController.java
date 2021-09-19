package com.laoxu.controller;

import com.laoxu.dao.RentMapper;
import com.laoxu.pojo.Rent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RentController {

    @Autowired
    RentMapper rentMapper;

    @RequestMapping(value = "/test",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String test(@RequestParam String username,@RequestParam String password){
        System.out.println(username+password);
        Rent rent = rentMapper.selectByPrimaryKey(2);
        return rent.toString();
    }
}
