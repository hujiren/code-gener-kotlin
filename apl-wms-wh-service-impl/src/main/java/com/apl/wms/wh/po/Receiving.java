package com.apl.wms.wh.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("receiving")
@ApiModel(value="ReceivingPo对象", description="")
public class ReceivingPo extends Model<ReceivingPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "whId" , value = "仓库id" , required = true)
    @Min(value = 0 , message = "仓库id不能小于1")
    private Long whId;

    @ApiModelProperty(name = "receivingTime" , value = "收货时间" , required = true)
    private Timestamp receivingTime;

    @ApiModelProperty(name = "receivingNo" , value = "收货批次号，系统自动生成" , required = true)
    @NotEmpty(message = "收货批次号，系统自动生成不能为空")
    private String receivingNo;

    @ApiModelProperty(name = "carrierNo" , value = "物流单号" , required = true)
    @NotEmpty(message = "物流单号不能为空")
    private String carrierNo;

    @ApiModelProperty(name = "carrier" , value = "物流商" , required = true)
    @NotEmpty(message = "物流商不能为空")
    private String carrier;

    @ApiModelProperty(name = "orderId" , value = "订单id" , required = true)
    @Min(value = 0 , message = "订单id不能小于1")
    private Long orderId;

    @ApiModelProperty(name = "customerId" , value = "客户id" , required = true)
    @Min(value = 0 , message = "客户id不能小于1")
    private Long customerId;

    @ApiModelProperty(name = "supplierId" , value = "供应商id" , required = true)
    @Min(value = 0 , message = "供应商id不能小于1")
    private Long supplierId;

    @ApiModelProperty(name = "ctns" , value = "总箱数" , required = true)
    @Min(value = 0 , message = "总箱数不能小于0")
    private Integer ctns;

    @ApiModelProperty(name = "receivingRemark" , value = "收货备注" , required = true)
    @NotEmpty(message = "收货备注不能为空")
    private String receivingRemark;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
