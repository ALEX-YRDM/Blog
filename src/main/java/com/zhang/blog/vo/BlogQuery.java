package com.zhang.blog.vo;

import lombok.Data;

/**
 * @author zbq
 * @date 2022/10/17 13:57
 */
@Data
public class BlogQuery {
    private String title;
    private Long typeId;
    private boolean recommend;
}
