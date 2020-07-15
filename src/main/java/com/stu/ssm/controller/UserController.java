package com.stu.ssm.controller;

import com.stu.ssm.domain.entity.User;
import com.stu.ssm.service.UserService;
import com.stu.ssm.utils.EntityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")

//这里用了@SessionAttributes，可以直接把model中的user(也就key)放入其中
//这样保证了session中存在user这个对象
@SessionAttributes("/user")
public class UserController {

    @Resource
   UserService userServivce;

    //正常访问login页面
    @PostMapping("/login")
    public EntityUtil<User> login(@RequestBody User user){

        return userServivce.checkLogin(user);
    }
    @PostMapping("/regist")
    public EntityUtil<User> regist(@RequestBody User user){

        return userServivce.Regist(user);
    }
}