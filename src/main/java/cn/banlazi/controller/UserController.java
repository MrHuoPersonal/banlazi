package cn.banlazi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public void login(String username,String passwd){


    }
}
