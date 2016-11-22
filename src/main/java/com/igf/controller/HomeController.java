package com.igf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by khris on 11-22-16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){
        return "hello";
    }
}
