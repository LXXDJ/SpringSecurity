package com.ohgiraffers.home.user.model.service;

import com.ohgiraffers.home.user.model.dao.UserMapper;
import com.ohgiraffers.home.user.model.dto.SignupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public int regist(SignupDTO signupDTO) {

        signupDTO.setUserPass(passwordEncoder.encode(signupDTO.getUserPass()));

        int result = 0;

        try {
            result = userMapper.regist(signupDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}
