package top.alidao.request;

import lombok.Data;

/**
 * 请求的分页信息
 */
@Data
public class PageRequset {
    private int currentPage;
    private int onePageCount;
}
