package top.alidao.dal.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class PostInfoV {
    private long id;
    private String title;
    private String author;
    private String content;
    private Date createDate;
    private int readCount;
    private String pureText;
    private long categoryId;
    private String categoryName;
    private String tagIDs;
    private String tagNames;
    private int draft;
}
