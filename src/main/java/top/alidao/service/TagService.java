package top.alidao.service;

import top.alidao.dal.pojo.TagV;
import top.alidao.entity.Message;
import top.alidao.entity.Result;
import top.alidao.entity.Tag;
import top.alidao.request.TagRequest;

import java.util.List;

/**
 * @description:
 */
public interface TagService {
    public Result<List<TagV>> getTag(TagRequest request);
    public Message addTag(Tag tag);
    public Message updateTag(Tag tag);
    public Message deleteTag(Tag tag);
}
