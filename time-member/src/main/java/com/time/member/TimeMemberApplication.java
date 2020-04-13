package com.time.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 会员服务
 *
 *
 * @date 2018/8/10
 * @package com.time.member
 */
@EnableEurekaClient
@SpringBootApplication
public class TimeMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeMemberApplication.class, args);
    }
}
