package com.yyx.controller;

import com.yyx.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }
    @PostMapping("/login")
    public String index(User user, HttpSession httpSession, Model model){
        if ("admin".equals(user.getUserName()) && "123".equals(user.getPassword())){
            httpSession.setAttribute("user",user);
            //登录成功重定向到首页，防止重复提交表单
            return "redirect:/toIndex";
        }else {
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
    }
    @GetMapping("/toIndex")
    public String indexPage(){
            return "login";
    }
}
