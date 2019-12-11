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
 * 入库订单其他信息
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class InOrderDetailsInfoVo implements Serializable {


private static final long serialVersionUID=1L;


    // 订单id
    private Long orderId;



    // 入库-物流商
    private String inCarrier;



    // 入库-物流单号
    private String inCarrierNo;



    // 入库-运费
    private BigDecimal inFreight;



    // 入库-运费币制
    private String inFreightCurrency;



    // 入库-运费付款方
    private Boolean inFreightPay;



    // 入库-联系人
    private String inContact;



    // 入库-联系手机
    private String inPhone;



    // 入库-上门收货地址
    private String inDoorAddr;



    // 入库-上门收货预约
    private String inDoorAppointment;



    // 入库-上门收货备注
    private String inDoorRemark;



    // 到目的地仓库物流方式
    private String toDescLogistics;



    // 到目的地仓库运输线路
    private String toDescCarrier;



    // 目的地仓库-收件人联系人
    private String destContact;



    // 目的地仓库-收件人联系电话
    private String destTel;



    // 目的地仓库-收件人手机号
    private String destPhone;



    // 目的地仓库-收件人邮箱
    private String destEmail;



    // 目的地仓库-国家简码
    private String destContryCode;



    // 目的地仓库-邮编
    private String destZipCode;



    // 目的地仓库-城市
    private String destCity;



    // 目的地仓库-公司名
    private String destCompanyName;



    // 目的地仓库-街道
    private String destStreet;



    // 目的地仓库-地址1
    private String destAddress1;



    // 目的地仓库-地址2
    private String destAddress2;



    // 目的地仓库-地址3
    private String destAddress3;






}
