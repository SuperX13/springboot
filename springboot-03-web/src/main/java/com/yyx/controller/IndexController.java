package com.yyx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
    //在templates下的所有页面，只能通过controller来跳转
    @RequestMapping("/index")
    public String hello(Model model){
        model.addAttribute("msg","你好");
        return "index";
    }
}
