package top.alidao.request;

import lombok.Data;

@Data
public class PostRequest extends PageRequset{
    private String keyword;
    private long categoryID;
    private long tagID;
}
