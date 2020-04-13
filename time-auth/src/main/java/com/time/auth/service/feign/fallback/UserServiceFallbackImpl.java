
package com.time.auth.service.feign.fallback;

import com.time.auth.service.feign.UserService;
import com.time.common.core.model.domain.RoleDO;
import com.time.common.core.model.domain.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户服务熔断回调
 * @date 2018/10/29
 * @package com.time.auth.service.feign.fallback
 */
@Slf4j
@Service
public class UserServiceFallbackImpl implements UserService {
    @Override
    public UserDO getByUsername(String username) {
        log.error("调用{}异常{}","getByUsername", username);
        return null;
    }

    @Override
    public List<RoleDO> getUserRole(Long id) {
        log.error("调用{}异常{}","getUserRole", id);
        return new ArrayList<>();
    }
}
