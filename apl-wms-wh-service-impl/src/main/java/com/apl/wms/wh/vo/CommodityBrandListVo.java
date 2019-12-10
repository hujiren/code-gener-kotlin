package com.apl.wms.wh.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;

/**
 * <p>
 * 商品品牌
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CommodityBrandListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 商品品牌id
    private Long id;



    // 品牌名称
    private String brandName;



    // 品牌的英文名称
    private String brandNameEn;



    // 品牌所属的分类
    private Long catId;



    // 品牌所属的客户id
    private Long custId;






}
