package com.example.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YZY
 * @date 2020/4/30 - 10:32
 */
@Controller
public class Contreoller {

    @RequestMapping("/YZY")
    @ResponseBody
    public String data(){
        return "YZY";
    }

    @RequestMapping("/login")
    public String login(String username,String password,Model model) {
        if (username.length() != 0 && "1".equals(password)) {
            return "redirect:/main.html";
        }else{
            model.addAttribute("message","登录失败");
            return "index";
        }
    }

}
