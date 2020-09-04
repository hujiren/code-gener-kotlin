package com.apl.lms.price.exp.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * <p>
 *  持久化对象
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("price_exp_main")
@ApiModel(value=" 持久化对象", description=" 持久化对象")
public class PriceExpMainPo extends Model<PriceExpMainPo> {


    @TableId(value = "id", type = IdType.UUID)
    private Long id;

    @ApiModelProperty(name = "startDate" , value = "起始日期" , required = true)
    private Timestamp startDate;

    @ApiModelProperty(name = "endDate" , value = "截止日期" , required = true)
    private Timestamp endDate;

    @ApiModelProperty(name = "currency" , value = "币制" , required = true)
    @NotEmpty(message = "币制不能为空")
    private String currency;

    @ApiModelProperty(name = "zoneId" , value = "分区表id" , required = true)
    @NotNull(message = "分区表id不能为空")
    @Min(value = 0 , message = "分区表id不不合法")
    private Long zoneId;

    @ApiModelProperty(name = "accountType" , value = "账号类型 1代理账号 2贸易账号 3第三方账号" , required = true)
    @NotNull(message = "账号类型 1代理账号 2贸易账号 3第三方账号不能为空")
    @Min(value = 0 , message = "账号类型 1代理账号 2贸易账号 3第三方账号不合法")
    private Integer accountType;

    @ApiModelProperty(name = "accountNo" , value = "快递账号" , required = true)
    @NotEmpty(message = "快递账号不能为空")
    private String accountNo;

    @ApiModelProperty(name = "mainStatus" , value = "主表状态" , required = true)
    @NotNull(message = "主表状态不能为空")
    @Min(value = 0 , message = "主表状态不合法")
    private Integer mainStatus;

    @ApiModelProperty(name = "specialCommodity" , value = "特殊物品" , required = true)
    @NotEmpty(message = "特殊物品不能为空")
    private String specialCommodity;

    @ApiModelProperty(name = "priceForm" , value = "价格表格式 1横向 2纵向" , required = true)
    @NotNull(message = "价格表格式 1横向 2纵向不能为空")
    @Min(value = 0 , message = "价格表格式 1横向 2纵向不合法")
    private Integer priceForm;

    @ApiModelProperty(name = "startWeight" , value = "起始重" , required = true)
    @NotEmpty(message = "起始重不能为空")
    private String startWeight;

    @ApiModelProperty(name = "endWeight" , value = "截止重" , required = true)
    @NotEmpty(message = "截止重不能为空")
    private String endWeight;

    @ApiModelProperty(name = "pricePublishedId" , value = "公布价id" , required = true)
    @NotNull(message = "公布价id不能为空")
    @Min(value = 0 , message = "公布价id不不合法")
    private Long pricePublishedId;

    @ApiModelProperty(name = "isPublishedPrice" , value = "是否是公布价 1是 2不是" , required = true)
    @NotNull(message = "是否是公布价 1是 2不是不能为空")
    @Min(value = 0 , message = "是否是公布价 1是 2不是不合法")
    private Integer isPublishedPrice;

    @ApiModelProperty(name = "aging" , value = "时效" , required = true)
    @NotEmpty(message = "时效不能为空")
    private String aging;

    @ApiModelProperty(name = "volumeDivisor" , value = "体积除数 " , required = true)
    @NotNull(message = "体积除数 不能为空")
    @Min(value = 0 , message = "体积除数 不合法")
    private Integer volumeDivisor;


    private static final long serialVersionUID=1L;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
