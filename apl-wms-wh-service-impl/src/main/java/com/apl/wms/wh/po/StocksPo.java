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
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 库存
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("stocks")
@ApiModel(value="StocksPo对象", description="库存")
public class StocksPo extends Model<StocksPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "whId" , value = "仓库id" , required = true)
    @Min(value = 0 , message = "仓库id不能小于1")
    private Long whId;

    @ApiModelProperty(name = "commodityId" , value = "商品id" , required = true)
    @Min(value = 0 , message = "商品id不能小于1")
    private Long commodityId;

    @ApiModelProperty(name = "stockCount" , value = "当前库存" , required = true)
    @Min(value = 0 , message = "当前库存不能小于0")
    private Integer stockCount;

    @ApiModelProperty(name = "stockFreeze" , value = "冻结的库存" , required = true)
    @Min(value = 0 , message = "冻结的库存不能小于0")
    private Integer stockFreeze;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
