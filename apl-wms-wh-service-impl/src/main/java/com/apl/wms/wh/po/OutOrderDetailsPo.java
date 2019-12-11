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
import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("out_order_details")
@ApiModel(value="OutOrderDetailsPo对象", description="")
public class OutOrderDetailsPo extends Model<OutOrderDetailsPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.UUID)
    private Integer id;

    @ApiModelProperty(name = "orderId" , value = "出库订单id" , required = true)
    @Min(value = 0 , message = "出库订单id不能小于0")
    private Integer orderId;

    @ApiModelProperty(name = "toDescLogistics" , value = "物流方式" , required = true)
    @NotEmpty(message = "物流方式不能为空")
    private String toDescLogistics;

    @ApiModelProperty(name = "toDescCarrier" , value = "运输线路" , required = true)
    @NotEmpty(message = "运输线路不能为空")
    private String toDescCarrier;

    @ApiModelProperty(name = "destContact" , value = "收件人联系人" , required = true)
    @NotEmpty(message = "收件人联系人不能为空")
    private String destContact;

    @ApiModelProperty(name = "destTel" , value = "收件人联系电话" , required = true)
    @NotEmpty(message = "收件人联系电话不能为空")
    private String destTel;

    @ApiModelProperty(name = "destPhone" , value = "收件人手机号" , required = true)
    @NotEmpty(message = "收件人手机号不能为空")
    private String destPhone;

    @ApiModelProperty(name = "destEmail" , value = "收件人邮箱" , required = true)
    @NotEmpty(message = "收件人邮箱不能为空")
    private String destEmail;

    @ApiModelProperty(name = "destContryCode" , value = "收件人国家简码" , required = true)
    @NotEmpty(message = "收件人国家简码不能为空")
    private String destContryCode;

    @ApiModelProperty(name = "destZipCode" , value = "收件人邮编" , required = true)
    @NotEmpty(message = "收件人邮编不能为空")
    private String destZipCode;

    @ApiModelProperty(name = "destCity" , value = "收件人城市" , required = true)
    @NotEmpty(message = "收件人城市不能为空")
    private String destCity;

    @ApiModelProperty(name = "destCompanyName" , value = "收件人公司名" , required = true)
    @NotEmpty(message = "收件人公司名不能为空")
    private String destCompanyName;

    @ApiModelProperty(name = "destStreet" , value = "收件人街道" , required = true)
    @NotEmpty(message = "收件人街道不能为空")
    private String destStreet;

    @ApiModelProperty(name = "destAddress1" , value = "收件人地址1" , required = true)
    @NotEmpty(message = "收件人地址1不能为空")
    private String destAddress1;

    @ApiModelProperty(name = "destAddress2" , value = "收件人地址2" , required = true)
    @NotEmpty(message = "收件人地址2不能为空")
    private String destAddress2;

    @ApiModelProperty(name = "destAddress3" , value = "收件人地址3" , required = true)
    @NotEmpty(message = "收件人地址3不能为空")
    private String destAddress3;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
