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
 * 
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OutOrderCommodityListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 
    private Long id;



    // 订单id
    private Long orderId;



    // 商品id
    private Long commodityId;



    // 商品名称
    private String commodityName;



    // 商品数量
    private Integer commodityQty;






}
