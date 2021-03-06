
package com.time.common.core.model.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色菜单
 *
 *
 * @date 2018/10/16
 * @package com.time.common.core.model.domain
 */
@Data
public class RoleMenuDO implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 菜单ID
     */
    private Long menuId;

    /**
     * 角色ID
     */
    private Long roleId;
}
