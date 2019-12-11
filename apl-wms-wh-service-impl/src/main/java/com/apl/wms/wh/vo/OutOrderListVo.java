package com.apl.wms.wh.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class OutOrderListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 
    private Long id;



    // 客户id
    private Long customerId;



    // 出库订单号
    private String orderNo;



    // 订单状态
    private Boolean orderStatus;



    // 订单来自那  1电商   2手动下单
    private Boolean orderFrom;



    // 电商平台代码
    private String ecCode;



    // 电商订单号
    private String ecOrderNo;



    // 店铺id
    private Integer sotreId;



    // 仓库id
    private Integer whId;



    // 订单创建时间
    private LocalDateTime crTime;



    // 订单更新时间
    private LocalDateTime upTime;






}
