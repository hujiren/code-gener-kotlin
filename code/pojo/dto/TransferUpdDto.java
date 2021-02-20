package com.apl.lms.air.transportation.pojo.po;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Min;
import com.baomidou.mybatisplus.annotation.TableName;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author hjr
 * @since 2021-02-19
 */
@Data
@TableName("transfer")
@ApiModel(value= "", description= "")
public class TransferUpdDto implements Serializable {

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @ApiModelProperty(name = "outBatchId" , value = "出货批次id   01  2" , required = true)
    @NotNull(message = "出货批次id   01  2不能为空")
    @Min(value = 0 , message = "出货批次id   01  2不不合法")
    private Long outBatchId;

    @ApiModelProperty(name = "createTime" , value = "创建时间  01 2" , required = true)
    private Timestamp createTime;

    @ApiModelProperty(name = "partnerId" , value = "服务商   01   2" , required = true)
    @NotNull(message = "服务商   01   2不能为空")
    @Min(value = 0 , message = "服务商   01   2不不合法")
    private Long partnerId;

    @ApiModelProperty(name = "bagNo" , value = "袋号    1  2" , required = true)
    @NotEmpty(message = "袋号    1  2不能为空")
    private String bagNo;

    @ApiModelProperty(name = "carrier" , value = "运输商" , required = true)
    @NotEmpty(message = "运输商不能为空")
    private String carrier;

    @ApiModelProperty(name = "ladingNo" , value = "提单号  1  2" , required = true)
    @NotEmpty(message = "提单号  1  2不能为空")
    private String ladingNo;

    @ApiModelProperty(name = "cutInformationTime" , value = "截补料时间" , required = true)
    @TableField("cut_Information_time")
    private Timestamp cutInformationTime;

    @ApiModelProperty(name = "cutOffTime" , value = "截单时间 2" , required = true)
    private Timestamp cutOffTime;

    @ApiModelProperty(name = "estimateStartTime" , value = "预计起航时间" , required = true)
    private Timestamp estimateStartTime;

    @ApiModelProperty(name = "actualStartTime" , value = "实计起航时间" , required = true)
    private Timestamp actualStartTime;

    @ApiModelProperty(name = "estimateArriveTime" , value = "预行到达时间" , required = true)
    private Timestamp estimateArriveTime;

    @ApiModelProperty(name = "actualArriveTime" , value = "实际到达时间" , required = true)
    private Timestamp actualArriveTime;

    @ApiModelProperty(name = "ctns" , value = "总箱数  01" , required = true)
    @NotNull(message = "总箱数  01不能为空")
    @Min(value = 0 , message = "总箱数  01不合法")
    private Integer ctns;

    @ApiModelProperty(name = "actualWeight" , value = "出货实重合计  01" , required = true)
    @NotNull(message = "出货实重合计  01不能为空")
    @Min(value = 0 , message = "出货实重合计  01不合法")
    private BigDecimal actualWeight;

    @ApiModelProperty(name = "volume" , value = "出货体积合计  01" , required = true)
    @NotNull(message = "出货体积合计  01不能为空")
    @Min(value = 0 , message = "出货体积合计  01不合法")
    private BigDecimal volume;

    @ApiModelProperty(name = "volumeWeight" , value = "出货体积重合计 01" , required = true)
    @NotNull(message = "出货体积重合计 01不能为空")
    @Min(value = 0 , message = "出货体积重合计 01不合法")
    private BigDecimal volumeWeight;

    @ApiModelProperty(name = "chargeWeight" , value = "出货计费重合计  01  2" , required = true)
    @NotNull(message = "出货计费重合计  01  2不能为空")
    @Min(value = 0 , message = "出货计费重合计  01  2不合法")
    private BigDecimal chargeWeight;

    @ApiModelProperty(name = "transferStatus" , value = "转运状态 01  2" , required = true)
    private Boolean transferStatus;

    @ApiModelProperty(name = "remark" , value = "备注 1" , required = true)
    @NotEmpty(message = "备注 1不能为空")
    private String remark;


    private static final long serialVersionUID=1L;



}
