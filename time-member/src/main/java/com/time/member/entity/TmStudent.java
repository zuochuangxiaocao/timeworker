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
@TableName("tm_student")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "会员库")
public class TmStudent extends Model<TmStudent> {
private static final long serialVersionUID = 1L;

    /**
     * 学员
     */
    @TableId
    @ApiModelProperty(value="学员")
    private String studentId;
    /**
     * 会员id
     */
    @ApiModelProperty(value="会员id")
    private String memberId;
    /**
     * 学校地址
     */
    @ApiModelProperty(value="学校地址")
    private String school;
    /**
     * 鞋码
     */
    @ApiModelProperty(value="鞋码")
    private Integer shoeSize;
    /**
     * 学员水平
     */
    @ApiModelProperty(value="学员水平")
    private String studentPlane;
    /**
     * 学员等级
     */
    @ApiModelProperty(value="学员等级")
    private String studentGrade;
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
