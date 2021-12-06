package com.wenna.intern.enums;

import java.util.ArrayList;
import java.util.List;

public enum MovieRegionEnum {

    ALL(0, "所有分类"),
    China(1, "华语"),
    HK(2, "香港"),
    Taiwan(3, "台湾"),
    Japan(4, "日本"),
    Korea(5, "韩国"),
    India(6, "印度"),
    Tailand(7, "泰国"),
    America(8, "美国"),
    Else(9, "其他");

    private int id;
    private String name;

    MovieRegionEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MovieRegionEnum getById(int id){
        for (MovieRegionEnum movieRegionEnum: MovieRegionEnum.values()){
            if(movieRegionEnum.getId() == id){
                return movieRegionEnum;
            }
        }
        return null;
    }

    public static List<MovieRegionEnum> getAllCatagorys(){
        List<MovieRegionEnum> res = new ArrayList<>();
        for (MovieRegionEnum movieRegionEnum: MovieRegionEnum.values()){
            res.add(movieRegionEnum);
        }
        return res;
    }

    public static String getRegionIdsByType(String regionId){
        String[] split = regionId.split(",");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            MovieRegionEnum movieRegionEnum = getById(Integer.parseInt(split[i]));
            list.add(movieRegionEnum.name);
        }
        String res = list.toString();
        res = res.substring(1, res.length()-1);
        return res;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
