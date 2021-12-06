package com.wenna.intern.controller;

import com.wenna.intern.DO.ResponseDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("")
public class HomeController extends BaseController {
   private static final Logger log =  LoggerFactory.getLogger(HomeController.class);


    @GetMapping("")
    public ResponseDO ShowHome(){
        log.info("hello world");
        Map<String, Object> map = new HashMap<>();
        map.put("user", "Hello");
        map.put("password", "123456");
        return new ResponseDO(true, SUCCESS,SUCCESS_ID,map);
    }
}
