package com.ohgiraffers.home.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ohgiraffers.home", annotationClass = Mapper.class)
public class MybatisConfig {
}
