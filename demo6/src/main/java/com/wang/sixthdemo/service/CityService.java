/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/08 13:51
 * ProjectName : springbootlearndemo
 * Description : CityService业务层接口类
 * Version : V1.0
 */
package com.wang.sixthdemo.service;

import com.wang.sixthdemo.domain.City;

import java.util.List;

public interface CityService {

    List<City> findAllCity();

    City findCityById(Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
