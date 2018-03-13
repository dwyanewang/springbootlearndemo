/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/08 10:18
 * ProjectName : springbootlearndemo
 * Description : City业务逻辑接口
 * Version : V1.0
 */
package com.wang.fifth.service;

import com.wang.fifth.domain.City;

import java.util.List;

public interface CityService {
    //获取城市信息列表
    List<City> findAllCity();

    //根据ID查询城市信息
    City findCityById(Long id);

    //新增城市信息
    Long saveCity(City city);

    //更新城市信息
    Long updateCity(City city);

    //删除城市信息
    Long deleteCity(Long id);
}
