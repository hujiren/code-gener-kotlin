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
@TableName("out_order")
@ApiModel(value="OutOrderPo对象", description="")
public class OutOrderPo extends Model<OutOrderPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "customerId" , value = "客户id" , required = true)
    @Min(value = 0 , message = "客户id不能小于1")
    private Long customerId;

    @ApiModelProperty(name = "orderNo" , value = "出库订单号" , required = true)
    @NotEmpty(message = "出库订单号不能为空")
    private String orderNo;

    @ApiModelProperty(name = "orderStatus" , value = "订单状态" , required = true)
    private Boolean orderStatus;

    @ApiModelProperty(name = "orderFrom" , value = "订单来自那  1电商   2手动下单" , required = true)
    private Boolean orderFrom;

    @ApiModelProperty(name = "ecCode" , value = "电商平台代码" , required = true)
    @NotEmpty(message = "电商平台代码不能为空")
    private String ecCode;

    @ApiModelProperty(name = "ecOrderNo" , value = "电商订单号" , required = true)
    @NotEmpty(message = "电商订单号不能为空")
    private String ecOrderNo;

    @ApiModelProperty(name = "sotreId" , value = "店铺id" , required = true)
    @Min(value = 0 , message = "店铺id不能小于0")
    private Integer sotreId;

    @ApiModelProperty(name = "whId" , value = "仓库id" , required = true)
    @Min(value = 0 , message = "仓库id不能小于0")
    private Integer whId;

    @ApiModelProperty(name = "crTime" , value = "订单创建时间" , required = true)
    private Timestamp crTime;

    @ApiModelProperty(name = "upTime" , value = "订单更新时间" , required = true)
    private Timestamp upTime;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
