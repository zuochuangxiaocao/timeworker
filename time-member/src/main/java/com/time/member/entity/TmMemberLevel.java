package com.time.member.entity;

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
@TableName("tm_member_level")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "会员库")
public class TmMemberLevel extends Model<TmMemberLevel> {
private static final long serialVersionUID = 1L;

    /**
     * 会员等级
     */
    @TableId
    @ApiModelProperty(value="会员等级")
    private String levelId;
    /**
     * 级别
     */
    @ApiModelProperty(value="级别")
    private String code;
    /**
     * 名称
     */
    @ApiModelProperty(value="名称")
    private String name;
    /**
     * 最低消费
     */
    @ApiModelProperty(value="最低消费")
    private Integer minConsumption;
    /**
     * 最高消费
     */
    @ApiModelProperty(value="最高消费")
    private Integer maxConsumption;
    /**
     * 降级额度
     */
    @ApiModelProperty(value="降级额度")
    private Integer downgradeLimit;
    /**
     * 描述
     */
    @ApiModelProperty(value="描述")
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
