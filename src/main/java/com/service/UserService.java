package com.service;

import com.pojo.User;

import java.util.List;

/**
 * @author zhangjingyu
 */
public interface UserService {
    User get(String studentNumber, String password);
    void update(User user);
    User get(int id);
    List<User> list();
    List<User> list(int smallGroup,int groupId);
}