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
 * @date 2020-04-13 02:33:06
 */
@Data
@TableName("tm_sales")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "会员库")
public class TmSales extends Model<TmSales> {
private static final long serialVersionUID = 1L;

    /**
     * 销售代表
     */
    @TableId
    @ApiModelProperty(value="销售代表")
    private String salesId;
    /**
     * 会员id
     */
    @ApiModelProperty(value="会员id")
    private String memberId;
    /**
     * 员工id
     */
    @ApiModelProperty(value="员工id")
    private String employeeId;
    /**
     * 员工姓名
     */
    @ApiModelProperty(value="员工姓名")
    private String name;
    /**
     * 员工电话
     */
    @ApiModelProperty(value="员工电话")
    private String phone;
    /**
     * 门店id
     */
    @ApiModelProperty(value="门店id")
    private String storeId;
    /**
     * 状态
     */
    @ApiModelProperty(value="状态")
    private String status;
    /**
     * 字段1
     */
    @ApiModelProperty(value="字段1")
    private String udf1;
    /**
     * 字段2
     */
    @ApiModelProperty(value="字段2")
    private String udf2;
    /**
     * 字段3
     */
    @ApiModelProperty(value="字段3")
    private String udf3;
    /**
     * 字段4
     */
    @ApiModelProperty(value="字段4")
    private String udf4;
    /**
     * 字段5
     */
    @ApiModelProperty(value="字段5")
    private String udf5;
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
