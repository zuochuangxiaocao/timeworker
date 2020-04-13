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
@TableName("tm_point_log")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "会员库")
public class TmPointLog extends Model<TmPointLog> {
private static final long serialVersionUID = 1L;

    /**
     * 积分日志
     */
    @TableId
    @ApiModelProperty(value="积分日志")
    private String logId;
    /**
     * 类型
     */
    @ApiModelProperty(value="类型")
    private String catagory;
    /**
     * 会员id
     */
    @ApiModelProperty(value="会员id")
    private String memberId;
    /**
     * 初始积分
     */
    @ApiModelProperty(value="初始积分")
    private Integer nowPoint;
    /**
     * 本次操作积分(+入-出)
     */
    @ApiModelProperty(value="本次操作积分(+入-出)")
    private String point;
    /**
     * 新积分
     */
    @ApiModelProperty(value="新积分")
    private Integer newPoint;
    /**
     * 订单号
     */
    @ApiModelProperty(value="订单号")
    private String orderNo;
    /**
     * 记录生成ip
     */
    @ApiModelProperty(value="记录生成ip")
    private String operatorIp;
    /**
     * 操作人
     */
    @ApiModelProperty(value="操作人")
    private String operator;
    /**
     * 备注
     */
    @ApiModelProperty(value="备注")
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
