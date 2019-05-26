package com.zdy.controller;

import com.alibaba.fastjson.JSON;
import com.zdy.dao.ITB_User_Dao;
import com.zdy.entities.TB_User;
import com.zdy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ITB_User_Dao ITB_user_dao;

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String  getUser(){

        TB_User tb_user = userService.getUser();
        return JSON.toJSONString(tb_user);
    }
}
