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
 * 入库订单商品明细
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("in_order_commodity")
@ApiModel(value="InOrderCommodityPo对象", description="入库订单商品明细")
public class InOrderCommodityPo extends Model<InOrderCommodityPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.UUID)
    private Long id;

    @ApiModelProperty(name = "splitId" , value = "被拆分的id" , required = true)
    @Min(value = 0 , message = "被拆分的id不能小于1")
    private Long splitId;

    @ApiModelProperty(name = "orderId" , value = "订单的id" , required = true)
    @Min(value = 0 , message = "订单的id不能小于1")
    private Long orderId;

    @ApiModelProperty(name = "commodityId" , value = "商品id" , required = true)
    @Min(value = 0 , message = "商品id不能小于1")
    private Long commodityId;

    @ApiModelProperty(name = "commoditySepc" , value = "商品规格" , required = true)
    @NotEmpty(message = "商品规格不能为空")
    private String commoditySepc;

    @ApiModelProperty(name = "commodityQty" , value = "商品数量" , required = true)
    @Min(value = 0 , message = "商品数量不能小于0")
    private Integer commodityQty;

    @ApiModelProperty(name = "orderCtns" , value = "下单箱数" , required = true)
    @Min(value = 0 , message = "下单箱数不能小于0")
    private Integer orderCtns;

    @ApiModelProperty(name = "doneCtns" , value = "已完结箱数" , required = true)
    @Min(value = 0 , message = "已完结箱数不能小于0")
    private Integer doneCtns;

    @ApiModelProperty(name = "services" , value = "服务项目" , required = true)
    @NotEmpty(message = "服务项目不能为空")
    private String services;

    @ApiModelProperty(name = "descr" , value = "行描述" , required = true)
    @NotEmpty(message = "行描述不能为空")
    private String descr;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
