
package com.time.common.core.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页模型
 *
 *
 * @date 2018/8/17
 * @package com.time.admin.model.dto
 */
@Data
public class Page implements Serializable {
    /**
     * 总条数
     */
    private int total;

    /**
     * 集合
     */
    private List<?> rows;
}
