package top.alidao.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.alidao.dal.pojo.CategoryV;
import top.alidao.entity.Category;
import top.alidao.entity.Message;
import top.alidao.entity.Result;
import top.alidao.request.CategoryRequest;
import top.alidao.service.CategoryService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;
    @RequestMapping("getCategory")
    public Result<List<CategoryV>> getCategory(@RequestBody(required = false)CategoryRequest request){
        return categoryService.getCategory(request);
    }
    @RequestMapping("addCategory")
    public Message addCategory(@RequestBody(required = false)Category category){
        return categoryService.addCategory(category);
    }
    @RequestMapping("updateCategory")
    public Message updateCategory(@RequestBody(required = false)Category category){
        return categoryService.updateCategory(category);
    }
    @RequestMapping("deleteCategory")
    public Message deleteCategory(@RequestBody(required = false) Category category){
        return categoryService.deleteCategory(category);
    }
}
