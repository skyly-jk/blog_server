package top.alidao.entity;

import lombok.Data;

@Data
public class Result<T> {
    private T data;
    private Page page;

    public Result(T data, Page page) {
        this.data = data;
        this.page = page;
    }

    public Result(T data) {
        this.data = data;
    }

    public Result() {
    }
}
