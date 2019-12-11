package com.apl.wms.wh.vo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;

/**
 * <p>
 * 商品
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CommodityListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 商品id
    private Integer id;



    // sku
    private String sku;



    // 商品名称
    private String commodityName;



    // 商品英文名称
    private String commodityNameEn;



    // 客户id
    private Long customerId;



    // 品类一id
    private Integer category1Id;



    // 品类二id
    private Integer category2Id;



    // 品类三d
    private Integer category3Id;



    // 品类四id
    private Integer category4Id;



    // 品类五id
    private Integer category5Id;



    // 品牌id
    private Integer brandId;



    // 销售状态 1:上架 0：下架
    private Integer saleStatus;



    // 审核状态 1：审核中  0：审核不通过
    private Integer reviewStauts;



    // 单位名称
    private String unitName;



    // 单位英文名称
    private String unitNameEn;



    // 平台价格
    private BigDecimal platformPrice;



    // 平台币制
    private String platformCurrency;



    // 长
    private BigDecimal sizeLenght;



    // 宽
    private BigDecimal sizeWidth;



    // 高
    private BigDecimal sizeHeight;



    // 重量
    private BigDecimal weight;



    // 商品url链接
    private String netUrl;



    // 申报价格
    private BigDecimal declarePrice;



    // 申报币制
    private String declareCurrency;



    // 商品的主图
    private String imgUrl;



    // 是否含电 1:含电 0：不含电
    private Integer isCorrespondence;



    // 材质
    private String textureName;



    // 材质英文名称
    private String textureNameEn;



    // 颜色名称
    private String colorName;



    // 颜色英文名称
    private String colorNameEn;



    // 规格
    private String sepcName;



    // 规格英文名称
    private String specNameEn;



    // 用途
    private String useWay;



    // 用途英文名称
    private String useWayEn;






}
