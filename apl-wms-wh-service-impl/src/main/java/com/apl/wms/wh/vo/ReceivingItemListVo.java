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
 * 
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ReceivingItemListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 
    private Long id;



    // 收货记录id
    private Long receivingId;



    // 子单号
    private String subNo;



    // 商品sku
    private String sku;



    // 长
    private BigDecimal length;



    // 宽
    private BigDecimal width;



    // 高
    private BigDecimal height;



    // 体积
    private BigDecimal volume;



    // 毛重
    private BigDecimal gw;






}
