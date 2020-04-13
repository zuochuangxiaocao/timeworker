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
@TableName("tm_privilege")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "会员库")
public class TmPrivilege extends Model<TmPrivilege> {
private static final long serialVersionUID = 1L;

    /**
     * 会员权益
     */
    @TableId
    @ApiModelProperty(value="会员权益")
    private String privilegeId;
    /**
     * 会员级别
     */
    @ApiModelProperty(value="会员级别")
    private String level;
    /**
     * 编码
     */
    @ApiModelProperty(value="编码")
    private String code;
    /**
     * 名称
     */
    @ApiModelProperty(value="名称")
    private String name;
    /**
     * 折扣
     */
    @ApiModelProperty(value="折扣")
    private BigDecimal discount;
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
     * 排序
     */
    @ApiModelProperty(value="排序")
    private Integer sort;
    /**
     * 门店ID
     */
    @ApiModelProperty(value="门店ID")
    private String storeId;
    /**
     * 折扣次数
     */
    @ApiModelProperty(value="折扣次数")
    private Integer times;
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
