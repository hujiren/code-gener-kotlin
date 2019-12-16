package com.apl.wms.order.po;

import java.math.BigDecimal;
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
 * 入库订单操作 持久化对象
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("in_order_operatior")
@ApiModel(value="入库订单操作 持久化对象", description="入库订单操作 持久化对象")
public class InOrderOperatiorPo extends Model<InOrderOperatiorPo> {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "commodityId" , value = "订单商品条目id" , required = true)
    @NotNull(message = "订单商品条目id不能为空")
    @Min(value = 0 , message = "订单商品条目id不不合法")
    private Long commodityId;

    @ApiModelProperty(name = "serviceId" , value = "服务id" , required = true)
    @NotNull(message = "服务id不能为空")
    @Min(value = 0 , message = "服务id不合法")
    private Integer serviceId;

    @ApiModelProperty(name = "serviceName" , value = "服务名称" , required = true)
    @NotEmpty(message = "服务名称不能为空")
    private String serviceName;

    @ApiModelProperty(name = "qty" , value = "数量" , required = true)
    @NotNull(message = "数量不能为空")
    @Min(value = 0 , message = "数量不合法")
    private Integer qty;

    @ApiModelProperty(name = "wt" , value = "重量" , required = true)
    @NotNull(message = "重量不能为空")
    @Min(value = 0 , message = "重量不合法")
    private BigDecimal wt;

    @ApiModelProperty(name = "operatiorTime" , value = "服务时间" , required = true)
    private Timestamp operatiorTime;

    @ApiModelProperty(name = "operatiorName" , value = "操作员名称" , required = true)
    @NotEmpty(message = "操作员名称不能为空")
    private String operatiorName;

    @ApiModelProperty(name = "operatiorRemark" , value = "服务操作过程中的备注" , required = true)
    @NotEmpty(message = "服务操作过程中的备注不能为空")
    private String operatiorRemark;


    private static final long serialVersionUID=1L;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
