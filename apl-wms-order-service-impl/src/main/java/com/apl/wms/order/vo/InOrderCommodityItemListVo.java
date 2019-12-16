package com.apl.wms.order.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;

/**
 * <p>
 * 入库订单商品明细
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class InOrderCommodityItemListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 
    private Long id;



    // 被拆分的id
    private Long splitId;



    // 订单的id
    private Long orderId;



    // 商品id
    private Long commodityId;



    // 商品规格
    private String commoditySepc;



    // 商品下单数量
    private Integer orderQty;



    // 下单箱数
    private Integer orderCtns;



    // 已完结箱数
    private Integer doneCtns;



    // 行描述
    private String descr;






}
