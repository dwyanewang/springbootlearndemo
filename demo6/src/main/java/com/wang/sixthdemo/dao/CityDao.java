/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/08 13:48
 * ProjectName : springbootlearndemo
 * Description : CityDao接口类
 * Version : V1.0
 */
package com.wang.sixthdemo.dao;

import com.wang.sixthdemo.domain.City;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CityDao {

    List<City> findAllCity();

    City findById(@Param("id") Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
