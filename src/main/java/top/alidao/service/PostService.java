package top.alidao.service;

import top.alidao.dal.pojo.CategoryV;
import top.alidao.dal.pojo.PostInfoV;
import top.alidao.dal.pojo.TagV;
import top.alidao.entity.Message;
import top.alidao.entity.Result;
import top.alidao.request.PostRequest;

import java.util.List;

public interface PostService {
    public Result<List<PostInfoV>> getPost(PostRequest request);
    public Result<List<CategoryV>> getCategory();
    public Result<List<TagV>> getTag();
    public Message addCategory(String name);
    public Message addTag(String name);
}
