package top.alidao.service.impl;

import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import top.alidao.dal.dao.PostMapper;
import top.alidao.dal.pojo.CategoryV;
import top.alidao.dal.pojo.PostInfoV;
import top.alidao.dal.pojo.TagV;
import top.alidao.entity.*;
import top.alidao.request.PostRequest;
import top.alidao.service.PostService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PostServiceImpl implements PostService {
    @Resource
    private PostMapper postMapper;
    @Override
    public Result<List<PostInfoV>> getPost(PostRequest request) {
        List<PostInfoV> postInfoVList=postMapper.selectPost(request);
        Page page=new Page();
        Result<List<PostInfoV>> result=new Result<>(postInfoVList,page);
        return result;
    }

    @Override
    public Message<PostInfoV> getPostById(long id) {
        Message<PostInfoV> message=new Message<>();
        PostInfoV postInfoV=postMapper.selectPostById(id);
        message.setStatus(postInfoV==null?0:1);
        message.setData(postInfoV);
        return message;
    }

    @Override
    public Message addPost(Post post) {
        Message message=new Message();
        postMapper.insertPost(post);
        postMapper.insertRelation(post.getId(),post.getTagIDs());
        message.setStatus(1);
        return message;
    }

    @Override
    public Message updatePost(Post post) {
        Message message=new Message();
        postMapper.updatePost(post);
        postMapper.deleteRelation(post.getId());
        postMapper.insertRelation(post.getId(),post.getTagIDs());
        message.setStatus(1);
        return message;
    }

    @Override
    public Message deletePost(long id) {
        Message message=new Message();
        postMapper.deletePost(id);
        postMapper.deleteRelation(id);
        message.setStatus(1);
        return message;
    }

    @Override
    public Result getArchive() {
        Result result=new Result();
        result.setData(postMapper.selectArchive());
        return result;
    }
}
