
package com.time.admin.model.vo;

import com.time.common.core.model.domain.UserDO;
import lombok.Data;

/**
 *
 * @date 2018/8/30
 * @package com.time.admin.model.vo
 */
@Data
public class UserVO extends UserDO {
    /**
     * 用户密码
     */
    private String newPassword;
}
