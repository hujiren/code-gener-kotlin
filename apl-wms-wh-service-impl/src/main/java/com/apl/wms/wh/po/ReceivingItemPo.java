package com.apl.wms.wh.po;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * 
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("receiving_item")
@ApiModel(value="ReceivingItemPo对象", description="")
public class ReceivingItemPo extends Model<ReceivingItemPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "receivingId" , value = "收货记录id" , required = true)
    @Min(value = 0 , message = "收货记录id不能小于1")
    private Long receivingId;

    @ApiModelProperty(name = "subNo" , value = "子单号" , required = true)
    @NotEmpty(message = "子单号不能为空")
    private String subNo;

    @ApiModelProperty(name = "sku" , value = "商品sku" , required = true)
    @NotEmpty(message = "商品sku不能为空")
    private String sku;

    @ApiModelProperty(name = "length" , value = "长" , required = true)
    @Min(value = 0 , message = "长不能小于0")
    private BigDecimal length;

    @ApiModelProperty(name = "width" , value = "宽" , required = true)
    @Min(value = 0 , message = "宽不能小于0")
    private BigDecimal width;

    @ApiModelProperty(name = "height" , value = "高" , required = true)
    @Min(value = 0 , message = "高不能小于0")
    private BigDecimal height;

    @ApiModelProperty(name = "volume" , value = "体积" , required = true)
    @Min(value = 0 , message = "体积不能小于0")
    private BigDecimal volume;

    @ApiModelProperty(name = "gw" , value = "毛重" , required = true)
    @Min(value = 0 , message = "毛重不能小于0")
    private BigDecimal gw;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
