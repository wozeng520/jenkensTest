package com.example.mybatis.mapper;

import com.example.mybatis.model.User;
import org.springframework.stereotype.Repository;

/**
 * ${DESCRIPTION}
 *
 * @author 272420251
 * @create 2019-11-26-13:39
 */
@Repository
public interface UserMapper {
    int addUser(User user);
}
