package com.zdy.dao;

import com.zdy.entities.TB_User;


public interface ITB_User_Dao {
    void insertTB_User(TB_User tb_user);
    void delTB_User(TB_User tb_user);
    void updateTB_User(TB_User tb_user);
    TB_User queryTB_User();
}
