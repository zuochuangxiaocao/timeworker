
package com.time.gateway.service.feign.fallback;

import com.time.common.core.model.domain.MenuDO;
import com.time.gateway.service.feign.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单服务熔断回调
 * @date 2018/10/29
 * @package com.time.gateway.service.feign.fallback
 */
@Slf4j
@Service
public class MenuServiceFallbackImpl implements MenuService {
    /**
     * 查询角色菜单
     *
     * @param roleKeys 角色Key
     * @return 菜单列表
     */
    @Override
    public List<MenuDO> findRoleMenu(List<String> roleKeys) {
        log.error("调用{}异常{}","findRoleMenu",roleKeys);
        return new ArrayList<>();
    }
}
