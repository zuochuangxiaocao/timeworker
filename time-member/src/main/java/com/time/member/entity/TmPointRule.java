package com.time.member.entity

-member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 会员库
 *
 * @author sy
 * @date 2020-04-13 02:33:07
 */
@Data
@TableName("tm_point_rule")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "会员库")
public class TmPointRule extends Model<TmPointRule> {
private static final long serialVersionUID = 1L;

    /**
     * 积分规则
     */
    @TableId
    @ApiModelProperty(value="积分规则")
    private String ruleId;
    /**
     * 类型(兑换\抵扣\签到\奖励)
     */
    @ApiModelProperty(value="类型(兑换\抵扣\签到\奖励)")
    private String code;
    /**
     * 名称
     */
    @ApiModelProperty(value="名称")
    private String name;
    /**
     * 金额
     */
    @ApiModelProperty(value="金额")
    private Integer money;
    /**
     * 积分
     */
    @ApiModelProperty(value="积分")
    private Integer point;
    /**
     * 状态(1:有效2:无效)
     */
    @ApiModelProperty(value="状态(1:有效2:无效)")
    private String status;
    /**
     * 权益说明
     */
    @ApiModelProperty(value="权益说明")
    private String memo;
    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人")
    private String createdBy;
    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人")
    private String updatedBy;
    /**
     * 版本
     */
    @ApiModelProperty(value="版本")
    private BigDecimal version;
    /**
     * 是否可用
     */
    @ApiModelProperty(value="是否可用")
    private String isActive;
    /**
     * 创建日期
     */
    @ApiModelProperty(value="创建日期")
    private LocalDateTime createdDate;
    /**
     * 修改日期
     */
    @ApiModelProperty(value="修改日期")
    private LocalDateTime updatedDate;
    /**
     * 业务主体
     */
    @ApiModelProperty(value="业务主体")
    private String mainId;
    /**
     * 数据组织
     */
    @ApiModelProperty(value="数据组织")
    private String dataOrgId;
    }
