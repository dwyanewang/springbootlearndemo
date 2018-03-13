/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/08 11:00
 * ProjectName : springbootlearndemo
 * Description : City控制层
 * Version : V1.0
 */
package com.wang.fifth.controller;

import com.wang.fifth.domain.City;
import com.wang.fifth.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityRestController {
    @Autowired
    private CityService cityService;

    @GetMapping("/api/city/{id}")
    public City findOneCity(@PathVariable("id") Long id){
        return cityService.findCityById(id);
    }

    @GetMapping("/api/city")
    public List<City> findAllCity(){
        return cityService.findAllCity();
    }

    @PostMapping("/api/city")
    public void createCity(@RequestBody City city){
        cityService.saveCity(city);
    }

    @PutMapping("/api/city")
    public void modifyCity(@RequestBody City city){
        cityService.updateCity(city);
    }

    @DeleteMapping("/api/city/{id}")
    public void modifyCity(@PathVariable("id") Long id){
        cityService.deleteCity(id);
    }
}
