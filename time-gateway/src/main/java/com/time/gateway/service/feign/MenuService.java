package com.time.gateway.service.feign;

import com.time.common.core.model.domain.MenuDO;
import com.time.gateway.service.feign.fallback.MenuServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 菜单服务
 * @date 2018/10/29
 * @package com.time.gateway.service.feign
 */
@FeignClient(name = "time-admin", fallback = MenuServiceFallbackImpl.class)
public interface MenuService {
    /**
     * 查询角色菜单
     * @param roleKeys 角色Key
     * @return 菜单列表
     */
    @GetMapping("menu/roleMenu")
    List<MenuDO> findRoleMenu(@RequestParam("roleKeys") List<String> roleKeys);
}
