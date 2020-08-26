package top.alidao.dal.dao;

import top.alidao.dal.pojo.TagV;
import top.alidao.entity.Tag;
import top.alidao.request.TagRequest;

import java.util.List;

/**
 * @description:
 */
public interface TagMapper {
    public List<TagV> selectTag(TagRequest request);
    public int addTag(Tag tag);
    public int updateTag(Tag tag);
    public int deleteTag(Tag tag);
}
