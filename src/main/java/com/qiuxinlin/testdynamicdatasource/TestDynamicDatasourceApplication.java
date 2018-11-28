package com.qiuxinlin.testdynamicdatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qiuxinlin.testdynamicdatasource.mapper")
/**
 * @Author: qiuxinlin
 * @Dercription: 
 * @Date: 2018/11/28
 */
public class TestDynamicDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDynamicDatasourceApplication.class, args);
    }
}
