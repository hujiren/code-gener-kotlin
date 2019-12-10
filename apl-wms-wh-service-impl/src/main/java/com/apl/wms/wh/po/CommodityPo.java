package com.apl.wms.wh.po;

import java.math.BigDecimal;
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
 * 商品
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("commodity")
@ApiModel(value="CommodityPo对象", description="商品")
public class CommodityPo extends Model<CommodityPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "sku" , value = "sku" , required = true)
    @NotEmpty(message = "sku不能为空")
    private String sku;

    @ApiModelProperty(name = "commodityName" , value = "商品名称" , required = true)
    @NotEmpty(message = "商品名称不能为空")
    private String commodityName;

    @ApiModelProperty(name = "commodityNameEn" , value = "商品英文名称" , required = true)
    @NotEmpty(message = "商品英文名称不能为空")
    private String commodityNameEn;

    @ApiModelProperty(name = "custId" , value = "客户id" , required = true)
    @Min(value = 0 , message = "客户id不能小于1")
    private Long custId;

    @ApiModelProperty(name = "categoryId" , value = "品类id" , required = true)
    @Min(value = 0 , message = "品类id不能小于1")
    private Long categoryId;

    @ApiModelProperty(name = "brandId" , value = "品牌id" , required = true)
    @Min(value = 0 , message = "品牌id不能小于1")
    private Long brandId;

    @ApiModelProperty(name = "saleStatus" , value = "销售状态 1:上架 0：下架" , required = true)
    @Min(value = 0 , message = "销售状态 1:上架 0：下架不能小于0")
    private Integer saleStatus;

    @ApiModelProperty(name = "reviewStauts" , value = "审核状态 1：审核中  0：审核不通过" , required = true)
    @Min(value = 0 , message = "审核状态 1：审核中  0：审核不通过不能小于0")
    private Integer reviewStauts;

    @ApiModelProperty(name = "unitName" , value = "单位名称" , required = true)
    @NotEmpty(message = "单位名称不能为空")
    private String unitName;

    @ApiModelProperty(name = "unitNameEn" , value = "单位英文名称" , required = true)
    @NotEmpty(message = "单位英文名称不能为空")
    private String unitNameEn;

    @ApiModelProperty(name = "platformPrice" , value = "平台价格" , required = true)
    @Min(value = 0 , message = "平台价格不能小于0")
    private BigDecimal platformPrice;

    @ApiModelProperty(name = "platformCurrency" , value = "平台币制" , required = true)
    @NotEmpty(message = "平台币制不能为空")
    private String platformCurrency;

    @ApiModelProperty(name = "sizeLenght" , value = "长" , required = true)
    @Min(value = 0 , message = "长不能小于0")
    private BigDecimal sizeLenght;

    @ApiModelProperty(name = "sizeWidth" , value = "宽" , required = true)
    @Min(value = 0 , message = "宽不能小于0")
    private BigDecimal sizeWidth;

    @ApiModelProperty(name = "sizeHeight" , value = "高" , required = true)
    @Min(value = 0 , message = "高不能小于0")
    private BigDecimal sizeHeight;

    @ApiModelProperty(name = "weight" , value = "重量" , required = true)
    private Double weight;

    @ApiModelProperty(name = "netUrl" , value = "商品url链接" , required = true)
    @NotEmpty(message = "商品url链接不能为空")
    private String netUrl;

    @ApiModelProperty(name = "declarePrice" , value = "申报价格" , required = true)
    @Min(value = 0 , message = "申报价格不能小于0")
    private BigDecimal declarePrice;

    @ApiModelProperty(name = "declareCurrency" , value = "申报币制" , required = true)
    @NotEmpty(message = "申报币制不能为空")
    private String declareCurrency;

    @ApiModelProperty(name = "mainUrl" , value = "商品的主图" , required = true)
    @NotEmpty(message = "商品的主图不能为空")
    private String mainUrl;

    @ApiModelProperty(name = "isCorrespondence" , value = "是否含电 1:含电 0：不含电" , required = true)
    @Min(value = 0 , message = "是否含电 1:含电 0：不含电不能小于0")
    private Integer isCorrespondence;

    @ApiModelProperty(name = "textureName" , value = "材质" , required = true)
    @NotEmpty(message = "材质不能为空")
    private String textureName;

    @ApiModelProperty(name = "textureNameEn" , value = "材质英文名称" , required = true)
    @NotEmpty(message = "材质英文名称不能为空")
    private String textureNameEn;

    @ApiModelProperty(name = "colorName" , value = "颜色名称" , required = true)
    @NotEmpty(message = "颜色名称不能为空")
    private String colorName;

    @ApiModelProperty(name = "colorNameEn" , value = "颜色英文名称" , required = true)
    @NotEmpty(message = "颜色英文名称不能为空")
    private String colorNameEn;

    @ApiModelProperty(name = "sepcName" , value = "规格" , required = true)
    @NotEmpty(message = "规格不能为空")
    private String sepcName;

    @ApiModelProperty(name = "specNameEn" , value = "规格英文名称" , required = true)
    @NotEmpty(message = "规格英文名称不能为空")
    private String specNameEn;

    @ApiModelProperty(name = "useWay" , value = "用途" , required = true)
    @NotEmpty(message = "用途不能为空")
    private String useWay;

    @ApiModelProperty(name = "useWayEn" , value = "用途英文名称" , required = true)
    @NotEmpty(message = "用途英文名称不能为空")
    private String useWayEn;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
