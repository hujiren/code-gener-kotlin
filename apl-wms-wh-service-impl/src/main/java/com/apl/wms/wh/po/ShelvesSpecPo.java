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
 * 货架规格
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("shelves_spec")
@ApiModel(value="ShelvesSpecPo对象", description="货架规格")
public class ShelvesSpecPo extends Model<ShelvesSpecPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "specNo" , value = "规格编号" , required = true)
    @NotEmpty(message = "规格编号不能为空")
    private String specNo;

    @ApiModelProperty(name = "singleLayersLength" , value = "单层-长" , required = true)
    @Min(value = 0 , message = "单层-长不能小于0")
    private BigDecimal singleLayersLength;

    @ApiModelProperty(name = "singleLayersWidth" , value = "单层-宽" , required = true)
    @Min(value = 0 , message = "单层-宽不能小于0")
    private BigDecimal singleLayersWidth;

    @ApiModelProperty(name = "singleLayersHeight" , value = "单层-高" , required = true)
    @Min(value = 0 , message = "单层-高不能小于0")
    private BigDecimal singleLayersHeight;

    @ApiModelProperty(name = "layersCount" , value = "层数" , required = true)
    @Min(value = 0 , message = "层数不能小于0")
    private Integer layersCount;

    @ApiModelProperty(name = "singleLayerSupportWeight" , value = "每层承受重量" , required = true)
    private Double singleLayerSupportWeight;

    @ApiModelProperty(name = "desc" , value = "描述" , required = true)
    @NotEmpty(message = "描述不能为空")
    private String desc;

    @ApiModelProperty(name = "imgUrl" , value = "货架图片url" , required = true)
    @NotEmpty(message = "货架图片url不能为空")
    private String imgUrl;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
