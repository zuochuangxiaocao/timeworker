package com.time.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * time管理平台
 * @date 2018/8/9
 * @author
 * @package com.time.admin
 */
@MapperScan("com.time.admin.dao")
@EnableEurekaClient
@SpringBootApplication
public class TimeAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(TimeAdminApplication.class, args);
    }
}
