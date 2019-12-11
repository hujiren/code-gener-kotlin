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
public class OutOrderDetailsInfoVo implements Serializable {


private static final long serialVersionUID=1L;


    // 
    private Integer id;



    // 出库订单id
    private Integer orderId;



    // 物流方式
    private String toDescLogistics;



    // 运输线路
    private String toDescCarrier;



    // 收件人联系人
    private String destContact;



    // 收件人联系电话
    private String destTel;



    // 收件人手机号
    private String destPhone;



    // 收件人邮箱
    private String destEmail;



    // 收件人国家简码
    private String destContryCode;



    // 收件人邮编
    private String destZipCode;



    // 收件人城市
    private String destCity;



    // 收件人公司名
    private String destCompanyName;



    // 收件人街道
    private String destStreet;



    // 收件人地址1
    private String destAddress1;



    // 收件人地址2
    private String destAddress2;



    // 收件人地址3
    private String destAddress3;






}
