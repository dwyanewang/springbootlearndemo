/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/05 11:48
 * ProjectName : springbootlearndemo
 * Description : User持久化映射
 * Version : V1.0
 */
package com.wang.seconddemo.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty(message = "姓名不能为空")
    @Size(min = 2,max = 10,message = "姓名必须大于2且小于10字")
    private String name;
    @NotNull(message = "年龄不能为空")
    @Min(value = 0,message = "年龄大于0岁")
    @Max(value = 200,message = "年龄小于200岁")
    private Integer age;
    @NotEmpty(message = "出生日期不能为空")
    private String birthday;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
