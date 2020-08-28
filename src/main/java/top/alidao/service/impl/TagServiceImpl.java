package top.alidao.service.impl;

import org.springframework.stereotype.Service;
import top.alidao.dal.dao.TagMapper;
import top.alidao.dal.pojo.CategoryV;
import top.alidao.dal.pojo.TagV;
import top.alidao.entity.Message;
import top.alidao.entity.Page;
import top.alidao.entity.Result;
import top.alidao.entity.Tag;
import top.alidao.request.TagRequest;
import top.alidao.service.TagService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 */
@Service
public class TagServiceImpl implements TagService {
    @Resource
    private TagMapper tagMapper;
    @Override
    public Result<List<TagV>> getTag(TagRequest request) {
        List<TagV> tagVList=tagMapper.selectTag(request);
        Page page=new Page();
        Result<List<TagV>> result=new Result<>(tagVList,page);
        return result;
    }

    @Override
    public Message addTag(Tag tag) {
        Message message=new Message();
        tagMapper.addTag(tag);
        return message;
    }

    @Override
    public Message updateTag(Tag tag) {
        Message message=new Message();
        tagMapper.updateTag(tag);
        return message;
    }

    @Override
    public Message deleteTag(Tag tag) {
        Message message=new Message();
        tagMapper.deleteTag(tag);
        tagMapper.deleteRelation(tag.getId());
        return message;
    }
}
