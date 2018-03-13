/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/06 14:43
 * ProjectName : springbootlearndemo
 * Description :
 * Version : V
 */
package com.wang.thirddemo1.controller;

import com.wang.thirddemo1.domain.User;
import com.wang.thirddemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Page<User> getUserPage(Pageable pageable){
        return userService.findByPage(pageable);
    }

    @PostMapping("/create")
    public User postUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
