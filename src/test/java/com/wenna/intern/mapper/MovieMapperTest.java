package com.wenna.intern.mapper;

import com.wenna.intern.Entity.Movie;
import com.wenna.intern.intf.mapper.MovieMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class MovieMapperTest {
    @Autowired
    MovieMapper mapper;

    @Test
    public void loadById(){
        Movie movie = mapper.loadById(1);
        System.out.println(movie);
    }

    @Test
    public void testInsert(){
        Movie movie = new Movie();
        movie.setName("欲望之城");
        movie.setType(2);
        movie.setCover("www.google.xlorvnl");
        movie.setStatus(1);
        movie.setDescription("恐怖的电影");
        movie.setRegions("2,4,5");
        System.out.println(movie);
        mapper.insertMovie(movie);
    }
}
