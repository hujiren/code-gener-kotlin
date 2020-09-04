package com.baomidou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PriceExpMain对象", description="")
public class PriceExpMain extends Model<PriceExpMain> {

private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.UUID)
    private Long id;

    @ApiModelProperty(value = "起始日期")
    private LocalDateTime startDate;

    @ApiModelProperty(value = "截止日期")
    private LocalDateTime endDate;

    @ApiModelProperty(value = "币制")
    private String currency;

    @ApiModelProperty(value = "分区表id")
    private Long zoneId;

    @ApiModelProperty(value = "账号类型 1代理账号 2贸易账号 3第三方账号")
    private Integer accountType;

    @ApiModelProperty(value = "快递账号")
    private String accountNo;

    @ApiModelProperty(value = "主表状态")
    private Integer mainStatus;

    @ApiModelProperty(value = "特殊物品")
    private String specialCommodity;

    @ApiModelProperty(value = "价格表格式 1横向 2纵向")
    private Integer priceForm;

    @ApiModelProperty(value = "起始重")
    private String startWeight;

    @ApiModelProperty(value = "截止重")
    private String endWeight;

    @ApiModelProperty(value = "公布价id")
    private Long pricePublishedId;

    @ApiModelProperty(value = "是否是公布价 1是 2不是")
    private Integer isPublishedPrice;

    @ApiModelProperty(value = "时效")
    private String aging;

    @ApiModelProperty(value = "体积除数 ")
    private Integer volumeDivisor;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
