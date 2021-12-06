package com.wenna.intern.intf.mapper;

import com.wenna.intern.Entity.Movie;
import com.wenna.intern.Entity.Sms;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Mapper
public interface MovieMapper {
    @Select("select * from yike_movie_detail where id = #{id}")
    public Movie loadById(@Param("id") int id);

    @Insert("insert into yike_movie_detail(`Name`, `Type`, `Cover`, `Status`, `Desc`, `TuiDesc`, `TuiImages`, `TuiVideos`, `ShowData`, " +
            "`Regions`, `DirectorId`, `DirectorName`, `ActorIds`, `ActorNames`, `TuiScore`, `DoubanScore`, " +
            "`LinkType`, `JumpLink`, `CollectTimes`, `ReviewTime, `AddTime`)" +
            "values(#{name},#{type},#{cover}, #{status}, #{description}, #{tuiDesc}," +
            "#{tuiImages}, #{tuiVideos}, #{showData}, #{regions}, #{directorId}, #{directorName}, #{actorIds}" +
            "#{actorNames}, #{tuiScore}, #{doubanScore}, #{linkType}, #{jumpLink}, #{collectTimes}" +
            "#{reviewTimes}, #{addTime})")
    public void insertMovie(Movie movie);

}
