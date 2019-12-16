package com.apl.wms.order.po;

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
 * 入库订单商品明细 持久化对象
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("in_order_commodity_item")
@ApiModel(value="入库订单商品明细 持久化对象", description="入库订单商品明细 持久化对象")
public class InOrderCommodityItemPo extends Model<InOrderCommodityItemPo> {


    @TableId(value = "id", type = IdType.UUID)
    private Long id;

    @ApiModelProperty(name = "splitId" , value = "被拆分的id" , required = true)
    @NotNull(message = "被拆分的id不能为空")
    @Min(value = 0 , message = "被拆分的id不不合法")
    private Long splitId;

    @ApiModelProperty(name = "orderId" , value = "订单的id" , required = true)
    @NotNull(message = "订单的id不能为空")
    @Min(value = 0 , message = "订单的id不不合法")
    private Long orderId;

    @ApiModelProperty(name = "commodityId" , value = "商品id" , required = true)
    @NotNull(message = "商品id不能为空")
    @Min(value = 0 , message = "商品id不不合法")
    private Long commodityId;

    @ApiModelProperty(name = "commoditySepc" , value = "商品规格" , required = true)
    @NotEmpty(message = "商品规格不能为空")
    private String commoditySepc;

    @ApiModelProperty(name = "orderQty" , value = "商品下单数量" , required = true)
    @NotNull(message = "商品下单数量不能为空")
    @Min(value = 0 , message = "商品下单数量不合法")
    private Integer orderQty;

    @ApiModelProperty(name = "orderCtns" , value = "下单箱数" , required = true)
    @NotNull(message = "下单箱数不能为空")
    @Min(value = 0 , message = "下单箱数不合法")
    private Integer orderCtns;

    @ApiModelProperty(name = "doneCtns" , value = "已完结箱数" , required = true)
    @NotNull(message = "已完结箱数不能为空")
    @Min(value = 0 , message = "已完结箱数不合法")
    private Integer doneCtns;

    @ApiModelProperty(name = "descr" , value = "行描述" , required = true)
    @NotEmpty(message = "行描述不能为空")
    private String descr;


    private static final long serialVersionUID=1L;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
