package top.alidao.dal.dao;

import top.alidao.dal.pojo.CategoryV;
import top.alidao.entity.Category;
import top.alidao.request.CategoryRequest;

import java.util.List;

/**
 * @description:
 */
public interface CategoryMapper {
    public List<CategoryV> selectCategory(CategoryRequest request);
    public int addCategory(Category Category);
    public int updateCategory(Category Category);
    public int deleteCategory(Category Category);
}
