package com.example.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @author 272420251
 * @create 2019-11-26-13:03
 */
@Component
@Mapper
public interface CityMapper {
    int getCityCount();
}
