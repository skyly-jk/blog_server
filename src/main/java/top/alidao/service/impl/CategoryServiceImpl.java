package top.alidao.service.impl;

import top.alidao.dal.pojo.CategoryV;
import top.alidao.entity.Category;
import top.alidao.entity.Message;
import top.alidao.entity.Result;
import top.alidao.request.CategoryRequest;
import top.alidao.service.CategoryService;

import java.util.List;

/**
 * @description:
 */
public class CategoryServiceImpl implements CategoryService {
    @Override
    public Result<List<CategoryV>> getCategory(CategoryRequest request) {
        return null;
    }

    @Override
    public Message addCategory(Category Category) {
        return null;
    }

    @Override
    public Message updateCategory(Category Category) {
        return null;
    }

    @Override
    public Message deleteCategory(Category Category) {
        return null;
    }
}
