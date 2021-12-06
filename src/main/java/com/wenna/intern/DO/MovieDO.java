package com.wenna.intern.DO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@ToString
public class MovieDO {
    private String name;
    private String type;
    private String cover;
    private String description;
    private String tuiDesc;
    private String tuiImage;
    private String tuiVideo;
    private Date showdate;
    private String region;
    private String directorName;
    private String actorName;
    private float tuiScore;
    private float doubanScore;
    private String linkType;
    private String jumpLink;
    private int collectTimes;
    private int reviewTimes;

    public MovieDO(String name, String type, String cover, String description, String tuiDesc, String tuiImage, String tuiVideo, Date showdate, String region, String directorName, String actorName, float tuiScore, float doubanScore, String linkType, String jumpLink, int collectTimes, int reviewTimes) {
        this.name = name;
        this.type = type;
        this.cover = cover;
        this.description = description;
        this.tuiDesc = tuiDesc;
        this.tuiImage = tuiImage;
        this.tuiVideo = tuiVideo;
        this.showdate = showdate;
        this.region = region;
        this.directorName = directorName;
        this.actorName = actorName;
        this.tuiScore = tuiScore;
        this.doubanScore = doubanScore;
        this.linkType = linkType;
        this.jumpLink = jumpLink;
        this.collectTimes = collectTimes;
        this.reviewTimes = reviewTimes;
    }
}
