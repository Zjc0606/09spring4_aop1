package com.zjc.serviceimpl;

import com.zjc.service.UserService;

/**
 * Created by zjc on 2017/4/16.
 *
 */
public class UserServiceImpl implements UserService {

    public void add() {
        System.out.println("增加用户");
    }


    public void update() {
        System.out.println("修改用户");
    }


    public void delete() {
        System.out.println("删除用户");
    }


    public void search() {
        System.out.println("查询用户");
    }

}
