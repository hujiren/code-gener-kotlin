package com.apl.wms.wh.po;

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
 * 入库订单基本信息
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("in_order")
@ApiModel(value="InOrderPo对象", description="入库订单基本信息")
public class InOrderPo extends Model<InOrderPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "orderType" , value = "订单的类型" , required = true)
    private Boolean orderType;

    @ApiModelProperty(name = "orderNo" , value = "入库订单号" , required = true)
    @NotEmpty(message = "入库订单号不能为空")
    private String orderNo;

    @ApiModelProperty(name = "customerId" , value = "客户id" , required = true)
    @Min(value = 0 , message = "客户id不能小于1")
    private Long customerId;

    @ApiModelProperty(name = "customerName" , value = "客户名称" , required = true)
    @NotEmpty(message = "客户名称不能为空")
    private String customerName;

    @ApiModelProperty(name = "goodsFrom" , value = "货物渠道来源 1:供应商发货 2：仓库货架 3：临时存放区" , required = true)
    private Boolean goodsFrom;

    @ApiModelProperty(name = "supId" , value = "供应商id" , required = true)
    @Min(value = 0 , message = "供应商id不能小于0")
    private Integer supId;

    @ApiModelProperty(name = "startWhId" , value = "起运地仓库id" , required = true)
    @Min(value = 0 , message = "起运地仓库id不能小于0")
    private Integer startWhId;

    @ApiModelProperty(name = "destWhId" , value = "目的地仓库" , required = true)
    @Min(value = 0 , message = "目的地仓库不能小于0")
    private Integer destWhId;

    @ApiModelProperty(name = "startWhOperator" , value = "起运地仓库操作 【如果渠道来源于仓库 或者 临时入库单，（入库 / 上架）】【供应商（入库 中转 上架）】" , required = true)
    @NotEmpty(message = "起运地仓库操作 【如果渠道来源于仓库 或者 临时入库单，（入库 / 上架）】【供应商（入库 中转 上架）】不能为空")
    private String startWhOperator;

    @ApiModelProperty(name = "destWhOperator" , value = "目的地仓库操作（入库 /上架/fbi仓库/私人仓库）" , required = true)
    @NotEmpty(message = "目的地仓库操作（入库 /上架/fbi仓库/私人仓库）不能为空")
    private String destWhOperator;

    @ApiModelProperty(name = "sendParties" , value = "发货方：1=供应商;  2=自己发货" , required = true)
    private Boolean sendParties;

    @ApiModelProperty(name = "inWhWay" , value = "到货方式： 1=物流发货  2=上门收货   3=自送货" , required = true)
    private Boolean inWhWay;

    @ApiModelProperty(name = "transportDetails" , value = "自配送详情" , required = true)
    @NotEmpty(message = "自配送详情不能为空")
    private String transportDetails;

    @ApiModelProperty(name = "orderStatus" , value = "订单状态" , required = true)
    @Min(value = 0 , message = "订单状态不能小于0")
    private Integer orderStatus;

    @ApiModelProperty(name = "descr" , value = "订单描述" , required = true)
    @NotEmpty(message = "订单描述不能为空")
    private String descr;

    @ApiModelProperty(name = "mainId" , value = "订单中转，指定一个汇总主单号id" , required = true)
    @Min(value = 0 , message = "订单中转，指定一个汇总主单号id不能小于1")
    private Long mainId;

    @ApiModelProperty(name = "crTime" , value = "订单创建时间" , required = true)
    private Timestamp crTime;

    @ApiModelProperty(name = "upTime" , value = "订单更新时间" , required = true)
    private Timestamp upTime;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
