
package com.time.admin.model.dto;

import com.time.common.core.model.domain.UserDO;
import lombok.Data;

import java.util.List;

/**
 * 系统用户信息
 *
 *
 * @date 2018/8/16
 * @package com.time.admin.model.dto
 */
@Data
public class UserInfo extends BaseDTO {
    /**
     * 用户信息
     */
    private UserDO user;

    /**
     * 权限标识集合
     */
    private List<String> permissions;
}
