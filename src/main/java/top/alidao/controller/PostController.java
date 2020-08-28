package top.alidao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
    private Message addPost(@RequestBody(required = false) Post request){
        return postService.addPost(request);
    }
    @RequestMapping("/{id}")
    private Message getOnePost(@PathVariable long id){
        return postService.getPostById(id);
    }
    @RequestMapping("/updatePost")
    private Message updatePost(@RequestBody(required = false) Post post){
        return postService.updatePost(post);
    }
    @RequestMapping("/deletePost")
    private Message deletePost(long id){
        return postService.deletePost(id);
    }
    @RequestMapping("/getArchive")
    public Result getArchive(){
        return postService.getArchive();
    }
}
