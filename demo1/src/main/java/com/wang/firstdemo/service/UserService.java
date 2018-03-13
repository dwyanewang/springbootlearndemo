/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/05 11:00
 * ProjectName : springbootlearndemo
 * Description : User业务层接口
 * Version : V1.0
 */
package com.wang.firstdemo.service;

import com.wang.firstdemo.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    List<User> findAll();
    User add(User user);
    User update(User user);
    User delete(Long id);
    User findById(Long id);
}
