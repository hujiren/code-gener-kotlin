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
 * 商品品牌
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("commodity_brand")
@ApiModel(value="CommodityBrandPo对象", description="商品品牌")
public class CommodityBrandPo extends Model<CommodityBrandPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.UUID)
    private Integer id;

    @ApiModelProperty(name = "brandName" , value = "品牌名称" , required = true)
    @NotEmpty(message = "品牌名称不能为空")
    private String brandName;

    @ApiModelProperty(name = "brandNameEn" , value = "品牌的英文名称" , required = true)
    @NotEmpty(message = "品牌的英文名称不能为空")
    private String brandNameEn;

    @ApiModelProperty(name = "catId" , value = "品牌所属的分类" , required = true)
    @Min(value = 0 , message = "品牌所属的分类不能小于0")
    private Integer catId;

    @ApiModelProperty(name = "custId" , value = "品牌所属的客户id" , required = true)
    @Min(value = 0 , message = "品牌所属的客户id不能小于0")
    private Integer custId;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
