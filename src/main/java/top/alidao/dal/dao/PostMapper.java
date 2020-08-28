package top.alidao.dal.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.alidao.dal.pojo.Archive;
import top.alidao.dal.pojo.CategoryV;
import top.alidao.dal.pojo.PostInfoV;
import top.alidao.dal.pojo.TagV;
import top.alidao.entity.Category;
import top.alidao.entity.Post;
import top.alidao.entity.Tag;
import top.alidao.request.PostRequest;


import java.util.List;

public interface PostMapper {
    public List<PostInfoV> selectPost(PostRequest request);
    public int insertPost(Post post);
    public int insertRelation(long id,long[] tagIDs);
    public PostInfoV selectPostById(long id);
    public int updatePost(Post post);
    public int deletePost(long id);
    public int deleteRelation(long id);
    public List<Archive> selectArchive();
}
