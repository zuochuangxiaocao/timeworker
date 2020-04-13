
package com.time.common.core.model.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户角色
 *
 *
 * @date 2018/8/30
 * @package com.time.common.core.model.domain
 */
@Data
public class UserRoleDO implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;
}
