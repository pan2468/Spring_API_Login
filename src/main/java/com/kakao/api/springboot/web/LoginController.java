package com.kakao.api.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login_success(Model model){

        model.addAttribute("success","로그인 성공!!");
        return "index";
    }

    @GetMapping("/login")
    public String login(){

        return "login/login";
    }

}
