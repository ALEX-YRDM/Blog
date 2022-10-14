package com.zhang.blog.dao;

import com.zhang.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zbq
 * @date 2022/10/14 17:10
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username,String password);
}
