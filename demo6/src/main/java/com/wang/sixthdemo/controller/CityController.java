/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/03/08 13:58
 * ProjectName : springbootlearndemo
 * Description : CityController控制层
 * Version : V1.0
 */
package com.wang.sixthdemo.controller;

import com.wang.sixthdemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/api/city/{id}")
    public String findOneCity(@PathVariable("id") Long id,
                              ModelMap map){
        map.addAttribute("city",cityService.findCityById(id));
        return "city";
    }

    @GetMapping("/api/city")
    public String findAllCity(ModelMap map){
        map.addAttribute("cityList",cityService.findAllCity());
        return "cityList";
    }
}
