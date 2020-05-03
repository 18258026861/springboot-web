package com.example.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YZY
 * @date 2020/4/30 - 10:32
 */
@RestController
public class Contreoller {

    @RequestMapping("/YZY")
    public String data(){

        return "YZY";
    }
}
