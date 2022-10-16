package com.zhang.blog.dao;

import com.zhang.blog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zbq
 * @date 2022/10/16 14:33
 */
public interface TagRepository extends JpaRepository<Tag,Long> {
    Tag findByName(String name);
}
