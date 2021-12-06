package com.wenna.intern.service.impl;

import com.wenna.intern.DO.MovieDO;
import com.wenna.intern.Entity.Movie;
import com.wenna.intern.enums.MovieRegionEnum;
import com.wenna.intern.enums.MovieSortEnum;
import com.wenna.intern.enums.MovieTypeEnum;
import com.wenna.intern.enums.MovieWatchModeEnum;
import com.wenna.intern.intf.mapper.MovieMapper;
import com.wenna.intern.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieMapper movieMapper;

    @Override
    public void insert(Movie movie) {

    }

    @Override
    public void update(int id) {

    }

    @Override
    public MovieDO getMovieById(int id) {
        // 根据电影id查询电影详情
        Movie movie = movieMapper.loadById(id);
        System.out.println(movie.getTuiImages());
        MovieDO res = new MovieDO(movie.getName(),
                MovieTypeEnum.getMovieType(movie.getType()),
                movie.getCover(),
                movie.getDescription(),
                movie.getTuiDesc(),
                movie.getTuiImages(),
                movie.getTuiVideos(),
                movie.getShowData(),
                MovieRegionEnum.getRegionIdsByType(movie.getRegions()),
                movie.getDirectorName(),
                movie.getActorNames(),
                movie.getTuiScore(),
                movie.getDoubanScore(),
                MovieWatchModeEnum.getWatchMode(movie.getLinkType()),
                movie.getJumpLink(),
                movie.getCollectTimes(),
                movie.getReviewTimes());

        return res;
    }

    @Override
    public List<Movie> loadMovieByPage(MovieSortEnum sort, int regionId, MovieTypeEnum type, MovieWatchModeEnum mode, int movieDate, int page) {
        return null;
    }
}
