/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/07 10:38
 * ProjectName : springbootlearndemo
 * Description :
 * Version : V
 */
package com.wang.fourthdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloWorldController {
    @GetMapping("/")
    public String say(){
        return "hello world!!!";
    }
}
