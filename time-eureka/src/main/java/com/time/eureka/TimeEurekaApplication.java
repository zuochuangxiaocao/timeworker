
package com.time.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Time注册中心
 * @date 2018/8/9
 * @package com.time.eureka
 */
@EnableEurekaServer
@SpringBootApplication
public class TimeEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(TimeEurekaApplication.class, args);
    }
}
