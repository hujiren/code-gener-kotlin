package com.apl.wms.wh.po;

import java.math.BigDecimal;
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
 * 入库订单其他信息
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("in_order_details")
@ApiModel(value="InOrderDetailsPo对象", description="入库订单其他信息")
public class InOrderDetailsPo extends Model<InOrderDetailsPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "order_id", type = IdType.UUID)
    private Long orderId;

    @ApiModelProperty(name = "inCarrier" , value = "入库-物流商" , required = true)
    @NotEmpty(message = "入库-物流商不能为空")
    private String inCarrier;

    @ApiModelProperty(name = "inCarrierNo" , value = "入库-物流单号" , required = true)
    @NotEmpty(message = "入库-物流单号不能为空")
    private String inCarrierNo;

    @ApiModelProperty(name = "inFreight" , value = "入库-运费" , required = true)
    @Min(value = 0 , message = "入库-运费不能小于0")
    private BigDecimal inFreight;

    @ApiModelProperty(name = "inFreightCurrency" , value = "入库-运费币制" , required = true)
    @NotEmpty(message = "入库-运费币制不能为空")
    private String inFreightCurrency;

    @ApiModelProperty(name = "inFreightPay" , value = "入库-运费付款方" , required = true)
    private Boolean inFreightPay;

    @ApiModelProperty(name = "inContact" , value = "入库-联系人" , required = true)
    @NotEmpty(message = "入库-联系人不能为空")
    private String inContact;

    @ApiModelProperty(name = "inPhone" , value = "入库-联系手机" , required = true)
    @NotEmpty(message = "入库-联系手机不能为空")
    private String inPhone;

    @ApiModelProperty(name = "inDoorAddr" , value = "入库-上门收货地址" , required = true)
    @NotEmpty(message = "入库-上门收货地址不能为空")
    private String inDoorAddr;

    @ApiModelProperty(name = "inDoorAppointment" , value = "入库-上门收货预约" , required = true)
    @NotEmpty(message = "入库-上门收货预约不能为空")
    private String inDoorAppointment;

    @ApiModelProperty(name = "inDoorRemark" , value = "入库-上门收货备注" , required = true)
    @NotEmpty(message = "入库-上门收货备注不能为空")
    private String inDoorRemark;

    @ApiModelProperty(name = "toDescLogistics" , value = "到目的地仓库物流方式" , required = true)
    @NotEmpty(message = "到目的地仓库物流方式不能为空")
    private String toDescLogistics;

    @ApiModelProperty(name = "toDescCarrier" , value = "到目的地仓库运输线路" , required = true)
    @NotEmpty(message = "到目的地仓库运输线路不能为空")
    private String toDescCarrier;

    @ApiModelProperty(name = "destContact" , value = "目的地仓库-收件人联系人" , required = true)
    @NotEmpty(message = "目的地仓库-收件人联系人不能为空")
    private String destContact;

    @ApiModelProperty(name = "destTel" , value = "目的地仓库-收件人联系电话" , required = true)
    @NotEmpty(message = "目的地仓库-收件人联系电话不能为空")
    private String destTel;

    @ApiModelProperty(name = "destPhone" , value = "目的地仓库-收件人手机号" , required = true)
    @NotEmpty(message = "目的地仓库-收件人手机号不能为空")
    private String destPhone;

    @ApiModelProperty(name = "destEmail" , value = "目的地仓库-收件人邮箱" , required = true)
    @NotEmpty(message = "目的地仓库-收件人邮箱不能为空")
    private String destEmail;

    @ApiModelProperty(name = "destContryCode" , value = "目的地仓库-国家简码" , required = true)
    @NotEmpty(message = "目的地仓库-国家简码不能为空")
    private String destContryCode;

    @ApiModelProperty(name = "destZipCode" , value = "目的地仓库-邮编" , required = true)
    @NotEmpty(message = "目的地仓库-邮编不能为空")
    private String destZipCode;

    @ApiModelProperty(name = "destCity" , value = "目的地仓库-城市" , required = true)
    @NotEmpty(message = "目的地仓库-城市不能为空")
    private String destCity;

    @ApiModelProperty(name = "destCompanyName" , value = "目的地仓库-公司名" , required = true)
    @NotEmpty(message = "目的地仓库-公司名不能为空")
    private String destCompanyName;

    @ApiModelProperty(name = "destStreet" , value = "目的地仓库-街道" , required = true)
    @NotEmpty(message = "目的地仓库-街道不能为空")
    private String destStreet;

    @ApiModelProperty(name = "destAddress1" , value = "目的地仓库-地址1" , required = true)
    @NotEmpty(message = "目的地仓库-地址1不能为空")
    private String destAddress1;

    @ApiModelProperty(name = "destAddress2" , value = "目的地仓库-地址2" , required = true)
    @NotEmpty(message = "目的地仓库-地址2不能为空")
    private String destAddress2;

    @ApiModelProperty(name = "destAddress3" , value = "目的地仓库-地址3" , required = true)
    @NotEmpty(message = "目的地仓库-地址3不能为空")
    private String destAddress3;



    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }

}
