package com.qiuxinlin.testdynamicdatasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.qiuxinlin.testdynamicdatasource.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: qiuxinlin
 * @Dercription:
 * @Date: 2018/11/28
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.qiuxinlin.testdynamicdatasource.mapper")
public class TestDynamicDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDynamicDatasourceApplication.class, args);
    }
}
