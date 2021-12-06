package com.wenna.intern.controller;

import com.wenna.intern.DO.MovieDO;
import com.wenna.intern.DO.ResponseDO;
import com.wenna.intern.Entity.Movie;
import com.wenna.intern.intf.mapper.MovieMapper;
import com.wenna.intern.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MovieController extends BaseController{
    @Autowired
    private MovieService movieService;

    //查询id
    @RequestMapping(value = "/movie/{id}", method = RequestMethod.GET)
    public ResponseDO MovieDetail(@PathVariable("id") int id) throws Exception {
        MovieDO mo = movieService.getMovieById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("detail", mo);
        return new ResponseDO(true, SUCCESS,SUCCESS_ID,map);
    }
}
