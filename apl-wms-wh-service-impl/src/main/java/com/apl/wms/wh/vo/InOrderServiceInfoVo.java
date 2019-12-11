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
 * 入库订单服务
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class InOrderServiceInfoVo implements Serializable {


private static final long serialVersionUID=1L;


    // 
    private Long id;



    // 订单商品条目id
    private Long commodityItemId;



    // 服务id
    private Integer serviceId;



    // 服务名称
    private String serviceName;



    // 服务过程中的备注
    private String serviceRemark;



    // 服务状态 1：进行中 2 ：已完成 3：出现问题
    private Integer serviceStatus;






}
