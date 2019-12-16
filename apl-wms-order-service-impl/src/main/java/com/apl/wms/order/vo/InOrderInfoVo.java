package com.apl.wms.order.vo;

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
 * 入库订单 详细实体
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class InOrderInfoVo implements Serializable {


private static final long serialVersionUID=1L;


    // 
    private Long id;



    // 订单的类型
    private Boolean orderType;



    // 入库订单号
    private String orderNo;



    // 客户id
    private Long customerId;



    // 客户名称
    private String customerName;



    // 货物渠道来源 1临时入库    2供应商发货    3库存
    private Boolean goodsFrom;



    // 供应商id
    private Integer supplierId;



    // 起运地仓库id
    private Integer startWhId;



    // 目的地仓库
    private Integer destWhId;



    // 起运地仓库操作  1临时入库    2上架    3中转
    private Integer startWhOperator;



    // 目的地仓库操作  1临时入库   2上架   3入电商仓库   4私人地址
    private Integer destWhOperator;



    // 发货方：1=供应商;  2=自己发货
    private Boolean sendParties;



    // 到货方式： 1=物流发货  2=上门收货   3=自送货
    private Boolean inWhWay;



    // 订单状态： 1新建   2供应商发货中    3起运仓已入库   3仓库操作中    4转运中    5目的仓已入库    6目的仓操作中   7完成
    private Boolean orderStatus;



    // 订单描述
    private String descr;



    // 订单中转，指定一个汇总主单号id
    private Long mainId;



    // 订单创建时间
    private LocalDateTime crTime;



    // 订单更新时间
    private LocalDateTime upTime;






}
