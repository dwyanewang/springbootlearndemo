/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/06 14:36
 * ProjectName : springbootlearndemo
 * Description :
 * Version : V
 */
package com.wang.thirddemo1.service;

import com.wang.thirddemo1.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<User> findByPage(Pageable pageable);
    User addUser(User user);
}
