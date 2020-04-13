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
 * @date 2020-04-13 02:33:56
 */
@Data
@TableName("tm_member_contacts")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "会员库")
public class TmMemberContacts extends Model<TmMemberContacts> {
private static final long serialVersionUID = 1L;

    /**
     * 联系人
     */
    @TableId
    @ApiModelProperty(value="联系人")
    private String contactsId;
    /**
     * 帐号ID
     */
    @ApiModelProperty(value="帐号ID")
    private String memberId;
    /**
     * 联系人手机号
     */
    @ApiModelProperty(value="联系人手机号")
    private String contactsPhone;
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
