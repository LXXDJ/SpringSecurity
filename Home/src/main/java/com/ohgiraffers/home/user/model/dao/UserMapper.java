package com.ohgiraffers.home.user.model.dao;

import com.ohgiraffers.home.user.model.dto.SignupDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int regist(SignupDTO signupDTO);
}
