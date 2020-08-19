package top.alidao.entity;

import lombok.Data;

@Data
public class Page {
    private int currentPage;
    private int onePageCount;
    private int totalPage;
    private int totalCount;
}
