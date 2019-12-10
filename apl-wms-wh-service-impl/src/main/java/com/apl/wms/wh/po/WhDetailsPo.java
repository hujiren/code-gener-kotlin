package com.apl.wms.wh.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Min;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 仓库详细
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("wh_details")
@ApiModel(value="WhDetailsPo对象", description="仓库详细")
public class WhDetailsPo extends Model<WhDetailsPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.UUID)
    private Long id;

    @ApiModelProperty(name = "whId" , value = "仓库id" , required = true)
    @Min(value = 0 , message = "仓库id不能小于1")
    private Long whId;

    @ApiModelProperty(name = "contact" , value = "联系人" , required = true)
    @NotEmpty(message = "联系人不能为空")
    private String contact;

    @ApiModelProperty(name = "tel" , value = "座机" , required = true)
    @NotEmpty(message = "座机不能为空")
    private String tel;

    @ApiModelProperty(name = "phone" , value = "手机" , required = true)
    @NotEmpty(message = "手机不能为空")
    private String phone;

    @ApiModelProperty(name = "email" , value = "邮箱" , required = true)
    @NotEmpty(message = "邮箱不能为空")
    private String email;

    @ApiModelProperty(name = "countryCode" , value = "国家简码" , required = true)
    @NotEmpty(message = "国家简码不能为空")
    private String countryCode;

    @ApiModelProperty(name = "state" , value = "州" , required = true)
    @NotEmpty(message = "州不能为空")
    private String state;

    @ApiModelProperty(name = "city" , value = "城市" , required = true)
    @NotEmpty(message = "城市不能为空")
    private String city;

    @ApiModelProperty(name = "zipCode" , value = "邮编" , required = true)
    @NotEmpty(message = "邮编不能为空")
    private String zipCode;

    @ApiModelProperty(name = "street" , value = "街道" , required = true)
    @NotEmpty(message = "街道不能为空")
    private String street;

    @ApiModelProperty(name = "address1" , value = "地址1" , required = true)
    @NotEmpty(message = "地址1不能为空")
    private String address1;

    @ApiModelProperty(name = "address2" , value = "地址2" , required = true)
    @NotEmpty(message = "地址2不能为空")
    private String address2;

    @ApiModelProperty(name = "address3" , value = "地址3" , required = true)
    @NotEmpty(message = "地址3不能为空")
    private String address3;

    @ApiModelProperty(name = "companyName" , value = "公司名称" , required = true)
    @NotEmpty(message = "公司名称不能为空")
    private String companyName;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
