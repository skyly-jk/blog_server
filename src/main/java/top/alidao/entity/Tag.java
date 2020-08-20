package top.alidao.entity;

import lombok.Data;

/**
 * @description:
 */
@Data
public class Tag {
    private String id;
    private String name;

    public Tag() {
    }

    public Tag(String name) {
        this.name = name;
    }

    public Tag(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
