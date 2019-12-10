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
 * 库位储存商品数量
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("storage_commodity")
@ApiModel(value="StorageCommodityPo对象", description="库位储存商品数量")
public class StorageCommodityPo extends Model<StorageCommodityPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "storageId" , value = "库位id" , required = true)
    @Min(value = 0 , message = "库位id不能小于1")
    private Long storageId;

    @ApiModelProperty(name = "commodityId" , value = "商品id" , required = true)
    @Min(value = 0 , message = "商品id不能小于1")
    private Long commodityId;

    @ApiModelProperty(name = "stockCount" , value = "当前存放商品的数量" , required = true)
    @Min(value = 0 , message = "当前存放商品的数量不能小于0")
    private Integer stockCount;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
