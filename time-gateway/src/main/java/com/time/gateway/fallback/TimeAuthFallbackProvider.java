
package com.time.gateway.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

/**
 * 授权模块降级回调
 * @date 2018/10/29
 * @package com.time.gateway.fallback
 */
@Component
public class TimeAuthFallbackProvider implements FallbackProvider {
    private static final String SERVICE_NAME = "time-auth";
    private static final String SERVICE_DISABLE = "服务不可用";

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new TimeFallbackResponse(cause, SERVICE_NAME, SERVICE_DISABLE);
    }

    @Override
    public String getRoute() {
        return SERVICE_NAME;
    }
}
