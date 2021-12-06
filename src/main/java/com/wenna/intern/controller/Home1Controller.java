package com.wenna.intern.controller;

import com.wenna.intern.Entity.Sms;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/hello")
public class Home1Controller extends BaseController {
   private static final Logger log =  LoggerFactory.getLogger(Home1Controller.class);


    @GetMapping("")
    public String ShowHome(Model model){
        log.info("hello world");
        List<Sms> smsList = new ArrayList<>();//smsMapper.loadList();
        model.addAttribute("smsList", smsList);
        return "index";
    }
}
