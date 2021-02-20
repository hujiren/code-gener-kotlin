package com.baomidou.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋,
 * </p>
 *
 * @author hjr
 * @since 2021-02-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Transfer对象", description="转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋,")
public class Transfer extends Model<Transfer> {

private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "01 2")
    @TableId(value = "id", type = IdType.UUID)
    private Long id;

    @ApiModelProperty(value = "出货批次id   01  2")
    private Long outBatchId;

    @ApiModelProperty(value = "创建时间  01 2")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "服务商   01   2")
    private Long partnerId;

    @ApiModelProperty(value = "袋号    1  2")
    private String bagNo;

    @ApiModelProperty(value = "运输商")
    private String carrier;

    @ApiModelProperty(value = "提单号  1  2")
    private String ladingNo;

    @ApiModelProperty(value = "截补料时间")
    @TableField("cut_Information_time")
    private LocalDateTime cutInformationTime;

    @ApiModelProperty(value = "截单时间 2")
    private LocalDateTime cutOffTime;

    @ApiModelProperty(value = "预计起航时间")
    private LocalDateTime estimateStartTime;

    @ApiModelProperty(value = "实计起航时间")
    private LocalDateTime actualStartTime;

    @ApiModelProperty(value = "预行到达时间")
    private LocalDateTime estimateArriveTime;

    @ApiModelProperty(value = "实际到达时间")
    private LocalDateTime actualArriveTime;

    @ApiModelProperty(value = "总箱数  01")
    private Integer ctns;

    @ApiModelProperty(value = "出货实重合计  01")
    private BigDecimal actualWeight;

    @ApiModelProperty(value = "出货体积合计  01")
    private BigDecimal volume;

    @ApiModelProperty(value = "出货体积重合计 01")
    private BigDecimal volumeWeight;

    @ApiModelProperty(value = "出货计费重合计  01  2")
    private BigDecimal chargeWeight;

    @ApiModelProperty(value = "转运状态 01  2")
    private Boolean transferStatus;

    @ApiModelProperty(value = "备注 1")
    private String remark;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
