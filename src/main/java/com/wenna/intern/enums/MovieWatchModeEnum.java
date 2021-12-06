package com.wenna.intern.enums;

import com.wenna.intern.constant.SmsConstant;

public enum MovieWatchModeEnum {
    ALL(0, "不限形式"),
    CanWatch(1, "可跳转观看"),
    CanBT(2, "有下载链接"),
    NoDownLoad(3, "仅推荐");

    private int id;
    private String name;

    MovieWatchModeEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MovieWatchModeEnum getById(int id){
        for (MovieWatchModeEnum movieWatchModeEnum: MovieWatchModeEnum.values()) {
            if (movieWatchModeEnum.getId() == id){
                return movieWatchModeEnum;
            }
        }
        return null;
    }

    public static String getWatchMode(int id){
        MovieWatchModeEnum movieWatchModeEnum = getById(id);
        return movieWatchModeEnum.name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
