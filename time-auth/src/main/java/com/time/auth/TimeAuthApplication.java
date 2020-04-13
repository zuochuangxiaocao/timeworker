
package com.time.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * auth鉴权模块
 * @date 2018/10/17
 * @package com.time.auth
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class TimeAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeAuthApplication.class, args);
    }
}
