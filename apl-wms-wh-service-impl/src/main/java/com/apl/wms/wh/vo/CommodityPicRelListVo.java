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
 * 商品图片
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CommodityPicRelListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 图片id
    private Long id;



    // 商品id
    private Long communityId;



    // 图片地址
    private String imgUrl;



    // 排序
    private Integer imgSort;






}
