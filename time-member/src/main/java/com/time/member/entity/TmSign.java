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
@TableName("tm_sign")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "会员库")
public class TmSign extends Model<TmSign> {
private static final long serialVersionUID = 1L;

    /**
     * 签到
     */
    @TableId
    @ApiModelProperty(value="签到")
    private String signId;
    /**
     * 会员id
     */
    @ApiModelProperty(value="会员id")
    private String memberId;
    /**
     * 积分
     */
    @ApiModelProperty(value="积分")
    private Integer point;
    /**
     * 签到时间
     */
    @ApiModelProperty(value="签到时间")
    private LocalDateTime signTime;
    /**
     * 连续签到次数
     */
    @ApiModelProperty(value="连续签到次数")
    private Integer signTimes;
    /**
     * 状态
     */
    @ApiModelProperty(value="状态")
    private String status;
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
