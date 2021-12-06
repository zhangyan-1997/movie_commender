package com.wenna.intern.enums;

import java.util.ArrayList;
import java.util.List;

public enum MovieTypeEnum {
    XiJu(11, "喜剧"),
    AiQing(21, "爱情"),
    DongZuo(31, "动作"),
    KongBu(41, "恐怖"),
    DongHua(51, "动画"),
    Else(6, "其他");
    private int id;
    private String name;

    MovieTypeEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MovieTypeEnum getById(int id){
        for (MovieTypeEnum movieTypeEnum: MovieTypeEnum.values()){
            if(movieTypeEnum.getId() == id){
                return movieTypeEnum;
            }
        }
        return null;
    }

    public static List<MovieTypeEnum> getAllCatagorys(){
        List<MovieTypeEnum> res = new ArrayList<>();
        for (MovieTypeEnum movieTypeEnum: MovieTypeEnum.values()){
            res.add(movieTypeEnum);
        }
        return res;
    }

    public static String getMovieType(int id){
        MovieTypeEnum movieTypeEnum = getById(id);
        return movieTypeEnum.name;
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
