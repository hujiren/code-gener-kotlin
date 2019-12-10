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
 * 商品种类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CommodityCategoryListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 商品种类id
    private Long id;



    // 商品分类名称
    private String categoryName;



    // 商品分类英文名称
    private String categoryNameEn;



    // 商品分类的父级id
    private Long parentId;



    // 是否为叶子节点
    private Integer isLeaf;



    // 是否为系统自带的分类
    private Integer isSys;



    // 分类所属的客户
    private Long custId;






}
