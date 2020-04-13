
package com.time.auth.config.token;

import com.time.common.core.constant.Constants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * 凭证配置
 * @date 2018/10/26
 * @package com.time.auth.config.token
 */
@Configuration
public class TokenConfig {
    /**
     * 生成token 定制化处理
     * @return TokenEnhancer
     */
    @Bean
    public TokenEnhancer tokenEnhancer() {
        return (accessToken, authentication) -> {
            final Map<String, Object> additionalInfo = new HashMap<>(1);
            additionalInfo.put(Constants.LICENSE_NAME, Constants.TIME_LICENSE);
            ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
            return accessToken;
        };
    }

    /**
     * JWT
     * @return JwtAccessTokenConverter
     */
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        TimeJwtAccessTokenConverter jwtAccessTokenConverter = new TimeJwtAccessTokenConverter();
        jwtAccessTokenConverter.setSigningKey(Constants.JWT_SIGN_KEY);
        return jwtAccessTokenConverter;
    }
}
