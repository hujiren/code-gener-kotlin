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
 * 入库订单服务
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("in_order_service")
@ApiModel(value="InOrderServicePo对象", description="入库订单服务")
public class InOrderServicePo extends Model<InOrderServicePo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "commodityItemId" , value = "订单商品条目id" , required = true)
    @Min(value = 0 , message = "订单商品条目id不能小于1")
    private Long commodityItemId;

    @ApiModelProperty(name = "serviceId" , value = "服务id" , required = true)
    @Min(value = 0 , message = "服务id不能小于0")
    private Integer serviceId;

    @ApiModelProperty(name = "serviceName" , value = "服务名称" , required = true)
    @NotEmpty(message = "服务名称不能为空")
    private String serviceName;

    @ApiModelProperty(name = "serviceRemark" , value = "服务过程中的备注" , required = true)
    @NotEmpty(message = "服务过程中的备注不能为空")
    private String serviceRemark;

    @ApiModelProperty(name = "serviceStatus" , value = "服务状态 1：进行中 2 ：已完成 3：出现问题" , required = true)
    @Min(value = 0 , message = "服务状态 1：进行中 2 ：已完成 3：出现问题不能小于0")
    private Integer serviceStatus;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
