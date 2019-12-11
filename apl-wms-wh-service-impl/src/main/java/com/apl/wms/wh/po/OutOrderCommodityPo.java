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
@TableName("out_order_commodity")
@ApiModel(value="OutOrderCommodityPo对象", description="")
public class OutOrderCommodityPo extends Model<OutOrderCommodityPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "orderId" , value = "订单id" , required = true)
    @Min(value = 0 , message = "订单id不能小于1")
    private Long orderId;

    @ApiModelProperty(name = "commodityId" , value = "商品id" , required = true)
    @Min(value = 0 , message = "商品id不能小于1")
    private Long commodityId;

    @ApiModelProperty(name = "commodityName" , value = "商品名称" , required = true)
    @NotEmpty(message = "商品名称不能为空")
    private String commodityName;

    @ApiModelProperty(name = "commodityQty" , value = "商品数量" , required = true)
    @Min(value = 0 , message = "商品数量不能小于0")
    private Integer commodityQty;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
