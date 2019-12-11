package com.apl.wms.wh.po;

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
 * 入库订单操作
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("in_order_oper")
@ApiModel(value="InOrderOperPo对象", description="入库订单操作")
public class InOrderOperPo extends Model<InOrderOperPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "commodityId" , value = "订单商品条目id" , required = true)
    @Min(value = 0 , message = "订单商品条目id不能小于1")
    private Long commodityId;

    @ApiModelProperty(name = "serviceId" , value = "服务id" , required = true)
    @Min(value = 0 , message = "服务id不能小于0")
    private Integer serviceId;

    @ApiModelProperty(name = "serviceName" , value = "服务名称" , required = true)
    @NotEmpty(message = "服务名称不能为空")
    private String serviceName;

    @ApiModelProperty(name = "wt" , value = "重量" , required = true)
    @Min(value = 0 , message = "重量不能小于0")
    private BigDecimal wt;

    @ApiModelProperty(name = "operatiorTime" , value = "服务时间" , required = true)
    private Timestamp operatiorTime;

    @ApiModelProperty(name = "operatiorName" , value = "操作员名称" , required = true)
    @NotEmpty(message = "操作员名称不能为空")
    private String operatiorName;

    @ApiModelProperty(name = "operatiorRemark" , value = "服务操作过程中的备注" , required = true)
    @NotEmpty(message = "服务操作过程中的备注不能为空")
    private String operatiorRemark;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
