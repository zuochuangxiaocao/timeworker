
package com.time.gateway.service.impl;

import com.time.common.core.constant.Constants;
import com.time.common.core.model.domain.MenuDO;
import com.time.gateway.service.PermissionService;
import com.time.gateway.service.feign.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 鉴权
 * @date 2018/10/25
 * @package com.time.gateway.service.impl
 */
@Slf4j
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private MenuService menuService;
    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    /**
     * 判断请求是否有权限
     *
     * @param request        HttpServletRequest
     * @param authentication 认证信息
     * @return 是否有权限
     */
    @Override
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        Object principal = authentication.getPrincipal();
        List<SimpleGrantedAuthority> grantedAuthorityList = (List<SimpleGrantedAuthority>) authentication.getAuthorities();

        if (principal == null) {
            return false;
        }
        if (grantedAuthorityList == null || grantedAuthorityList.isEmpty()) {
            log.warn("角色列表为空：{}", authentication.getPrincipal());
            return false;
        }

        // 获取角色权限
        List<String> roleKeys = new ArrayList<>();
        for (SimpleGrantedAuthority authority : grantedAuthorityList) {
            if (!Constants.BASE_ROLE.equalsIgnoreCase(authority.getAuthority())
                && !Constants.ROLE_ANONYMOUS.equalsIgnoreCase(authority.getAuthority())) {
                roleKeys.add(authority.getAuthority());
            }
        }
        if (!roleKeys.isEmpty()) {
            List<MenuDO> menus = menuService.findRoleMenu(roleKeys);
            // 权限校验
            for (MenuDO menu : menus) {
                if (StringUtils.isNotBlank(menu.getUrl())
                    && antPathMatcher.match(menu.getUrl(), request.getRequestURI())
                    && request.getMethod().equalsIgnoreCase(menu.getMethod())) {
                    return true;
                }
            }
        }
        return false;
    }
}
