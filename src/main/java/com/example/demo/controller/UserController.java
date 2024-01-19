package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.pojo.query.UserQuery;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

//    @GetMapping("/")
//    public String index(){
//        return "index";
//    }
    @GetMapping("/")
    public String index(Model model, UserQuery userQuery){
        List<User> user = userService.listUser();
//        model.addAttribute("page",userPageInfo);
        return "index";
    }
}
