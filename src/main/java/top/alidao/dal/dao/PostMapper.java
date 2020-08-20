package top.alidao.dal.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.alidao.dal.pojo.CategoryV;
import top.alidao.dal.pojo.PostInfoV;
import top.alidao.dal.pojo.TagV;
import top.alidao.entity.Category;
import top.alidao.entity.Post;
import top.alidao.entity.Tag;
import top.alidao.request.PostRequest;


import java.util.List;

@Mapper
public interface PostMapper {
    public List<PostInfoV> selectPost(PostRequest request);
    public List<CategoryV> selectCategory();
    public List<TagV> selectTag();
    public int insertCategory(Category category);
    public int insertTag(Tag tag);
    public int insertPost(Post post);
    public int insertRelation(long id,long[] tagIDs);
}
