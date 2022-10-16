package com.zhang.blog.dao;

import com.zhang.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zbq
 * @date 2022/10/15 14:19
 */
public interface TypeRepository extends JpaRepository<Type,Long> {
    Type findByName(String n);
}
