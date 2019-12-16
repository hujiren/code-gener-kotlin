package com.apl.wms.order.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Min;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 入库订单 持久化对象
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("in_order")
@ApiModel(value="入库订单 持久化对象", description="入库订单 持久化对象")
public class InOrderPo extends Model<InOrderPo> {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "orderType" , value = "订单的类型" , required = true)
    private Boolean orderType;

    @ApiModelProperty(name = "orderNo" , value = "入库订单号" , required = true)
    @NotEmpty(message = "入库订单号不能为空")
    private String orderNo;

    @ApiModelProperty(name = "customerId" , value = "客户id" , required = true)
    @NotNull(message = "客户id不能为空")
    @Min(value = 0 , message = "客户id不不合法")
    private Long customerId;

    @ApiModelProperty(name = "customerName" , value = "客户名称" , required = true)
    @NotEmpty(message = "客户名称不能为空")
    private String customerName;

    @ApiModelProperty(name = "goodsFrom" , value = "货物渠道来源 1临时入库    2供应商发货    3库存" , required = true)
    private Boolean goodsFrom;

    @ApiModelProperty(name = "supplierId" , value = "供应商id" , required = true)
    @NotNull(message = "供应商id不能为空")
    @Min(value = 0 , message = "供应商id不合法")
    private Integer supplierId;

    @ApiModelProperty(name = "startWhId" , value = "起运地仓库id" , required = true)
    @NotNull(message = "起运地仓库id不能为空")
    @Min(value = 0 , message = "起运地仓库id不合法")
    private Integer startWhId;

    @ApiModelProperty(name = "destWhId" , value = "目的地仓库" , required = true)
    @NotNull(message = "目的地仓库不能为空")
    @Min(value = 0 , message = "目的地仓库不合法")
    private Integer destWhId;

    @ApiModelProperty(name = "startWhOperator" , value = "起运地仓库操作  1临时入库    2上架    3中转" , required = true)
    @NotNull(message = "起运地仓库操作  1临时入库    2上架    3中转不能为空")
    @Min(value = 0 , message = "起运地仓库操作  1临时入库    2上架    3中转不合法")
    private Integer startWhOperator;

    @ApiModelProperty(name = "destWhOperator" , value = "目的地仓库操作  1临时入库   2上架   3入电商仓库   4私人地址" , required = true)
    @NotNull(message = "目的地仓库操作  1临时入库   2上架   3入电商仓库   4私人地址不能为空")
    @Min(value = 0 , message = "目的地仓库操作  1临时入库   2上架   3入电商仓库   4私人地址不合法")
    private Integer destWhOperator;

    @ApiModelProperty(name = "sendParties" , value = "发货方：1=供应商;  2=自己发货" , required = true)
    private Boolean sendParties;

    @ApiModelProperty(name = "inWhWay" , value = "到货方式： 1=物流发货  2=上门收货   3=自送货" , required = true)
    private Boolean inWhWay;

    @ApiModelProperty(name = "orderStatus" , value = "订单状态： 1新建   2供应商发货中    3起运仓已入库   3仓库操作中    4转运中    5目的仓已入库    6目的仓操作中   7完成" , required = true)
    private Boolean orderStatus;

    @ApiModelProperty(name = "descr" , value = "订单描述" , required = true)
    @NotEmpty(message = "订单描述不能为空")
    private String descr;

    @ApiModelProperty(name = "mainId" , value = "订单中转，指定一个汇总主单号id" , required = true)
    @NotNull(message = "订单中转，指定一个汇总主单号id不能为空")
    @Min(value = 0 , message = "订单中转，指定一个汇总主单号id不不合法")
    private Long mainId;

    @ApiModelProperty(name = "crTime" , value = "订单创建时间" , required = true)
    private Timestamp crTime;

    @ApiModelProperty(name = "upTime" , value = "订单更新时间" , required = true)
    private Timestamp upTime;


    private static final long serialVersionUID=1L;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
