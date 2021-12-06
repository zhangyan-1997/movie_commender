package com.wenna.intern.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Getter
@Setter
@ToString
@Component
public class Movie {
    private int id;
    private String name;
    private int type;
    private String cover;
    private int status;
    private String description;
    private String tuiDesc;
    private String tuiImages;
    private String tuiVideos;
    private Date showData;
    private String regions;
    private int directorId;
    private String directorName;
    private String actorIds;
    private String actorNames;
    private float tuiScore;
    private float doubanScore;
    private int linkType;
    private String jumpLink;
    private int collectTimes;
    private int reviewTimes;
    private Date addTime;
    private Date updateTime;
}
