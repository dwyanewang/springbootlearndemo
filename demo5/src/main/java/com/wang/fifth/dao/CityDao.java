/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/08 10:13
 * ProjectName : springbootlearndemo
 * Description : CityDao接口
 * Version : V1.0
 */
package com.wang.fifth.dao;

import com.wang.fifth.domain.City;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CityDao {
    //获取城市信息列表
    List<City> findAllCity();

    //根据ID查询城市信息
    City findById(@Param("id") Long id);

    //保存
    Long saveCity(City city);

    //更新
    Long updateCity(City city);

    //删除
    Long deleteCity(Long id);
}
