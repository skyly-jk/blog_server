package top.alidao.entity;

import lombok.Data;

@Data
public class Message<T> {
    private int status;
    private String errMsg;
    private T data;
}
