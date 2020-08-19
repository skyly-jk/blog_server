package top.alidao.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import top.alidao.dal.dao.PostMapper;
import top.alidao.dal.pojo.CategoryV;
import top.alidao.dal.pojo.PostInfoV;
import top.alidao.dal.pojo.TagV;
import top.alidao.entity.Category;
import top.alidao.entity.Message;
import top.alidao.entity.Page;
import top.alidao.entity.Result;
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
    public Result<List<CategoryV>> getCategory() {
        List<CategoryV> categoryVList=postMapper.selectCategory();
        Result result=new Result(categoryVList);
        return result;
    }

    @Override
    public Result<List<TagV>> getTag() {
        List<TagV> tagVList=postMapper.selectTag();
        Result result=new Result(tagVList);
        return result;
    }

    @Override
    public Message addCategory(String name) {
        Message message=new Message();
        Category category=new Category(name);
        postMapper.insertCategory(category);
        message.setData(category.getId());
        return message;
    }

    @Override
    public Message addTag(String name) {
        return null;
    }
}
