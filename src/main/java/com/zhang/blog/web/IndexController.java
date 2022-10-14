package com.zhang.blog.web;

import com.zhang.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zbq
 * @date 2022/10/13 14:40
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        //int i=9/0;
        /*String blog=null;
        if(blog==null){
            throw new NotFoundException("blog doesn't exist!");
        }*/
        //System.out.println("----------index--------------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping("/aboutme")
    public String aboutme(){
        return "aboutme";
    }


}
