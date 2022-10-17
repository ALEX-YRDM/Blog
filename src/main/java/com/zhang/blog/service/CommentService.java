package com.zhang.blog.service;

import com.zhang.blog.po.Comment;

import java.util.List;

/**
 * @author zbq
 * @date 2022/10/17 14:58
 */
public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
