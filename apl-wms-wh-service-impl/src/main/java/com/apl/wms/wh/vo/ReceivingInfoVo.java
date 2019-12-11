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
public class ReceivingInfoVo implements Serializable {


private static final long serialVersionUID=1L;


    // 
    private Long id;



    // 仓库id
    private Long whId;



    // 收货时间
    private LocalDateTime receivingTime;



    // 收货批次号，系统自动生成
    private String receivingNo;



    // 物流单号
    private String carrierNo;



    // 物流商
    private String carrier;



    // 订单id
    private Long orderId;



    // 客户id
    private Long customerId;



    // 供应商id
    private Long supplierId;



    // 总箱数
    private Integer ctns;



    // 收货备注
    private String receivingRemark;






}
