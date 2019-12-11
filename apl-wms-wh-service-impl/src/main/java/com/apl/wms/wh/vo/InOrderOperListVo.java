package com.apl.wms.wh.vo;

import java.math.BigDecimal;
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
 * 入库订单操作
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class InOrderOperListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 
    private Long id;



    // 订单商品条目id
    private Long commodityId;



    // 服务id
    private Integer serviceId;



    // 服务名称
    private String serviceName;



    // 重量
    private BigDecimal wt;



    // 服务时间
    private LocalDateTime operatiorTime;



    // 操作员名称
    private String operatiorName;



    // 服务操作过程中的备注
    private String operatiorRemark;






}
