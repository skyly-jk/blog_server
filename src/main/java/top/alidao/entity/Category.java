package top.alidao.entity;

import lombok.Data;

@Data
public class Category {
    private long id;
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }
}
