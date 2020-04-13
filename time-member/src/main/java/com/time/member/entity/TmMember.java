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
@TableName("tm_member")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "会员库")
public class TmMember extends Model<TmMember> {
private static final long serialVersionUID = 1L;

    /**
     * 会员
     */
    @TableId
    @ApiModelProperty(value="会员")
    private String memberId;
    /**
     * 帐号ID
     */
    @ApiModelProperty(value="帐号ID")
    private String accountId;
    /**
     * 名称
     */
    @ApiModelProperty(value="名称")
    private String name;
    /**
     * 头像
     */
    @ApiModelProperty(value="头像")
    private String avatar;
    /**
     * 生日
     */
    @ApiModelProperty(value="生日")
    private LocalDateTime birthday;
    /**
     * 性别(m:男 f:女 s:保密)
     */
    @ApiModelProperty(value="性别(m:男 f:女 s:保密)")
    private String gender;
    /**
     * 证件类型
     */
    @ApiModelProperty(value="证件类型")
    private String idType;
    /**
     * 证件号码
     */
    @ApiModelProperty(value="证件号码")
    private String idNumber;
    /**
     * 省
     */
    @ApiModelProperty(value="省")
    private String province;
    /**
     * 市
     */
    @ApiModelProperty(value="市")
    private String city;
    /**
     * 区
     */
    @ApiModelProperty(value="区")
    private String area;
    /**
     * 详细地址
     */
    @ApiModelProperty(value="详细地址")
    private String address;
    /**
     * 邮箱
     */
    @ApiModelProperty(value="邮箱")
    private String email;
    /**
     * 可用积分
     */
    @ApiModelProperty(value="可用积分")
    private Integer point;
    /**
     * 累计总积分
     */
    @ApiModelProperty(value="累计总积分")
    private Integer totalPoint;
    /**
     * 累计消费积分
     */
    @ApiModelProperty(value="累计消费积分")
    private Integer usedPoint;
    /**
     * 累计消费金额
     */
    @ApiModelProperty(value="累计消费金额")
    private BigDecimal totalMoney;
    /**
     * 会员等级
     */
    @ApiModelProperty(value="会员等级")
    private String grade;
    /**
     * 所属组织机构ID
     */
    @ApiModelProperty(value="所属组织机构ID")
    private String organizationId;
    /**
     * 注册时间
     */
    @ApiModelProperty(value="注册时间")
    private LocalDateTime registerTime;
    /**
     * 顾问
     */
    @ApiModelProperty(value="顾问")
    private String adviser;
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
