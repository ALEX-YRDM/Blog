package com.zhang.blog.service;

import com.zhang.blog.po.User;

/**
 * @author zbq
 * @date 2022/10/14 17:09
 */
public interface UserService {
    User checkUser(String username,String password);
}
