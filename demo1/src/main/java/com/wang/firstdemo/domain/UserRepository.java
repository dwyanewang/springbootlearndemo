/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/05 10:59
 * ProjectName : springbootlearndemo
 * Description : User持久化层操作接口
 * Version : V1.0
 */
package com.wang.firstdemo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<User,Long> {
}
