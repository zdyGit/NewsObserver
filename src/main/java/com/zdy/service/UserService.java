package com.zdy.service;

import com.zdy.dao.ITB_User_Dao;
import com.zdy.entities.TB_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public ITB_User_Dao ITB_user_dao;

    public TB_User getUser(){
        TB_User user = ITB_user_dao.queryTB_User();
        return user;
    }
}
