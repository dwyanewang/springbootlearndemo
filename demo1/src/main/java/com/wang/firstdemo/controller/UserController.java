/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/05 11:12
 * ProjectName : springbootlearndemo
 * Description : User控制层
 * Version : V1.0
 */
package com.wang.firstdemo.controller;

import com.wang.firstdemo.domain.User;
import com.wang.firstdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //获取用户列表
    @GetMapping("/users")
    public String getUsers(ModelMap map){
        map.addAttribute("userList",userService.findAll());
        return "userList";
    }

    //显示创建用户表单
    @GetMapping("/create")
    public String createUserForm(ModelMap map){
        map.addAttribute("user",new User());
        map.addAttribute("action","create");
        return "userForm";
    }

    //创建用户
    @PostMapping("/create")
    public String postUser(@ModelAttribute User user){
        userService.add(user);
        return "redirect:/users/users";
    }

    //显示需要修改用户信息
    @GetMapping("/update/{id}")
    public String getUser(@PathVariable Long id,ModelMap map){
        map.addAttribute("user",userService.findById(id));
        map.addAttribute("action","update");
        return "userForm";
    }

    //更新用户
    @PostMapping("/update")
    public String putUser(@ModelAttribute User user){
        userService.update(user);
        return "redirect:/users/users";
    }

    //删除用户
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.delete(id);
        return "redirect:/users/users";
    }
}
