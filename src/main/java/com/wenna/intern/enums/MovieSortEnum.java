package com.wenna.intern.enums;

public enum MovieSortEnum {
    IDDesc(1,"入库时间从新降序"),
    TuiScore(2, "推评分从高到低"),
    CollectTimes(3, "喜欢数从高到低"),
    MovieTime(4, "上映时间从新降序");

    private int id;
    private String name;

    MovieSortEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
