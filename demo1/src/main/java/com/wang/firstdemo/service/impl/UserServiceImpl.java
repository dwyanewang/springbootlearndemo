/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/05 11:02
 * ProjectName : springbootlearndemo
 * Description : User业务层接口实现
 * Version : V1.0
 */
package com.wang.firstdemo.service.impl;

import com.wang.firstdemo.domain.User;
import com.wang.firstdemo.domain.UserRepository;
import com.wang.firstdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User add(User user) {
        logger.info("新增用户："+user.toString());
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        logger.info("更新用户："+user.toString());
        return userRepository.save(user);
    }

    @Override
    public User delete(Long id) {
        User user = userRepository.findOne(id);
        userRepository.delete(user);
        logger.info("删除用户："+user.toString());
        return user;
    }

    @Override
    public User findById(Long id) {
        logger.info("获取用户ID："+id);
        return userRepository.findOne(id);
    }
}
