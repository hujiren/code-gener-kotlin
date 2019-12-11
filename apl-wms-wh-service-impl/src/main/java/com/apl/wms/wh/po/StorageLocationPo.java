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
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 库位
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("storage_location")
@ApiModel(value="StorageLocationPo对象", description="库位")
public class StorageLocationPo extends Model<StorageLocationPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(name = "storageNo" , value = "库位编号（条形码）" , required = true)
    @NotEmpty(message = "库位编号（条形码）不能为空")
    private String storageNo;

    @ApiModelProperty(name = "sizeLength" , value = "长" , required = true)
    @Min(value = 0 , message = "长不能小于0")
    private BigDecimal sizeLength;

    @ApiModelProperty(name = "sizeWidth" , value = "宽" , required = true)
    @Min(value = 0 , message = "宽不能小于0")
    private BigDecimal sizeWidth;

    @ApiModelProperty(name = "sizeHeight" , value = "高" , required = true)
    @Min(value = 0 , message = "高不能小于0")
    private BigDecimal sizeHeight;

    @ApiModelProperty(name = "supportWeight" , value = "承受重量" , required = true)
    private Double supportWeight;

    @ApiModelProperty(name = "descr" , value = "库位描述" , required = true)
    @NotEmpty(message = "库位描述不能为空")
    private String descr;

    @ApiModelProperty(name = "shelvesId" , value = "货架id" , required = true)
    @Min(value = 0 , message = "货架id不能小于0")
    private Integer shelvesId;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
