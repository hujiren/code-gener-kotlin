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
 * 入库订单基本信息
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class InOrderListVo implements Serializable {


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



    // 货物渠道来源 1:供应商发货 2：仓库货架 3：临时存放区
    private Boolean goodsFrom;



    // 供应商id
    private Integer supId;



    // 起运地仓库id
    private Integer startWhId;



    // 目的地仓库
    private Integer destWhId;



    // 起运地仓库操作 【如果渠道来源于仓库 或者 临时入库单，（入库 / 上架）】【供应商（入库 中转 上架）】
    private String startWhOperator;



    // 目的地仓库操作（入库 /上架/fbi仓库/私人仓库）
    private String destWhOperator;



    // 发货方：1=供应商;  2=自己发货
    private Boolean sendParties;



    // 到货方式： 1=物流发货  2=上门收货   3=自送货
    private Boolean inWhWay;



    // 自配送详情
    private String transportDetails;



    // 订单状态
    private Integer orderStatus;



    // 订单描述
    private String descr;



    // 订单中转，指定一个汇总主单号id
    private Long mainId;



    // 订单创建时间
    private LocalDateTime crTime;



    // 订单更新时间
    private LocalDateTime upTime;






}
