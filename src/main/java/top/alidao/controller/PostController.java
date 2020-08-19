package top.alidao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.alidao.entity.Message;
import top.alidao.entity.Post;
import top.alidao.entity.Result;
import top.alidao.request.PostRequest;
import top.alidao.service.PostService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/post")
public class PostController {
    @Resource
    private PostService postService;
    @RequestMapping("/getPost")
    private Result getPost(PostRequest request){
        return postService.getPost(request);
    }
    @RequestMapping("/addPost")
    private Message addPost(Post request){
        return null;
    }
    @RequestMapping("/getCategory")
    private Result getCategory(){
        return postService.getCategory();
    }
    @RequestMapping("/addCategory")
    private Message addCategory(String name){
        return postService.addCategory(name);
    }
    @RequestMapping("/getTag")
    private Result getTag(){
        return postService.getTag();
    }
    @RequestMapping("/addTag")
    private Message addTag(String name){
        return null;
    }
}
