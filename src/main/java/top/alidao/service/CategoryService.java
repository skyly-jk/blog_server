package top.alidao.service;

import top.alidao.dal.pojo.CategoryV;
import top.alidao.entity.Message;
import top.alidao.entity.Result;
import top.alidao.entity.Category;
import top.alidao.request.CategoryRequest;

import java.util.List;

/**
 * @description:
 */
public interface CategoryService {
    public Result<List<CategoryV>> getCategory(CategoryRequest request);
    public Message addCategory(Category category);
    public Message updateCategory(Category category);
    public Message deleteCategory(Category category);
}
