package com.example.mybatis.controller;

import com.example.mybatis.mapper.CityMapper;
import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ${DESCRIPTION}
 *
 * @author 272420251
 * @create 2019-11-26-12:37
 */
@RestController
@Api(value = "v1", description = "第一个版本描述")
@RequestMapping("v1")
public class DemoController {
    @Autowired
    private SqlSessionTemplate template;
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUserList")
    @ApiOperation(value = "获取用户数")
    public int getUserList() {
        int cityCount = cityMapper.getCityCount();
        Object getCityCount = template.selectOne("getCityCount");
        System.out.println(cityCount);
        return cityCount;
    }

    @PostMapping(value = "/addUser")
    @ApiOperation(value = "添加用户")
    public void addUser(@RequestBody User user) {
        int i = userMapper.addUser(user);
        System.out.println(i);
    }

}
