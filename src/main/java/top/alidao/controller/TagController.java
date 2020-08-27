package top.alidao.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.alidao.dal.pojo.TagV;
import top.alidao.entity.Tag;
import top.alidao.entity.Message;
import top.alidao.entity.Result;
import top.alidao.request.TagRequest;
import top.alidao.service.TagService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 */
@RestController
@RequestMapping("/tag")
public class TagController {
    @Resource
    private TagService tagService;
    @RequestMapping("getTag")
    public Result<List<TagV>> getTag(@RequestBody(required = false) TagRequest request){
        return tagService.getTag(request);
    }
    @RequestMapping("addTag")
    public Message addTag(@RequestBody(required = false) Tag tag){
        return tagService.addTag(tag);
    }
    @RequestMapping("updateTag")
    public Message updateTag(@RequestBody(required = false)Tag tag){
        return tagService.updateTag(tag);
    }
    @RequestMapping("deleteTag")
    public Message deleteTag(@RequestBody(required = false) Tag tag){
        return tagService.deleteTag(tag);
    }
}
