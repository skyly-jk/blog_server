package top.alidao.service.impl;

import org.springframework.stereotype.Service;
import top.alidao.dal.dao.CategoryMapper;
import top.alidao.dal.pojo.CategoryV;
import top.alidao.dal.pojo.PostInfoV;
import top.alidao.entity.Category;
import top.alidao.entity.Message;
import top.alidao.entity.Page;
import top.alidao.entity.Result;
import top.alidao.request.CategoryRequest;
import top.alidao.service.CategoryService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    @Override
    public Result<List<CategoryV>> getCategory(CategoryRequest request) {
        List<CategoryV> categoryVList=categoryMapper.selectCategory(request);
        Page page=new Page();
        Result<List<CategoryV>> result=new Result<>(categoryVList,page);
        return result;
    }

    @Override
    public Message addCategory(Category category) {
        Message message=new Message();
        categoryMapper.addCategory(category);
        return message;
    }

    @Override
    public Message updateCategory(Category category) {
        Message message=new Message();
        categoryMapper.updateCategory(category);
        return message;
    }

    @Override
    public Message deleteCategory(Category category) {
        Message message=new Message();
        categoryMapper.deleteCategory(category);
        return message;
    }
}
