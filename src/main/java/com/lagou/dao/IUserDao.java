package com.lagou.dao;

import com.lagou.pojo.User;

import java.util.List;

public interface IUserDao {

    //查询所有用户
    public List<User> findAll() throws Exception;


    //根据条件进行用户查询
    public User findByCondition(User user) throws Exception;

    //添加用户
    public int addUser(User user) throws Exception;

    //更新用户
    public int updateUser(User user) throws Exception;



}
