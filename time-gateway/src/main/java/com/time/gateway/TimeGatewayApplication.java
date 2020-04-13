
package com.time.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Time网关
 * @date 2018/8/10
 * @package com.time.gateway
 */
@EnableZuulProxy
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class TimeGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeGatewayApplication.class, args);
    }
}
