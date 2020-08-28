package top.alidao.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Post {
    private long id;
    private String title;
    private String author;
    private String content;
    private long categoryID;
    private long[] tagIDs;
    private String pureText;
    private int draft;
}
