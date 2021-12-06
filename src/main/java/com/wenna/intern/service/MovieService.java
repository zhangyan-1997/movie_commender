package com.wenna.intern.service;

import com.wenna.intern.DO.MovieDO;
import com.wenna.intern.Entity.Movie;
import com.wenna.intern.enums.MovieSortEnum;
import com.wenna.intern.enums.MovieTypeEnum;
import com.wenna.intern.enums.MovieWatchModeEnum;

import java.util.List;

public interface MovieService {
    public void insert(Movie movie);
    public void update(int id);
    public MovieDO getMovieById(int id);
    public List<Movie> loadMovieByPage(MovieSortEnum sort, int regionId, MovieTypeEnum type, MovieWatchModeEnum mode, int movieDate, int page);
}
