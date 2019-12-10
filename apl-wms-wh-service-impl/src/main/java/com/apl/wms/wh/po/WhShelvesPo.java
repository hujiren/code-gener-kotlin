package com.apl.wms.wh.po;

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
 * 货架
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("wh_shelves")
@ApiModel(value="WhShelvesPo对象", description="货架")
public class WhShelvesPo extends Model<WhShelvesPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "shelvesNo" , value = "货架编号" , required = true)
    @NotEmpty(message = "货架编号不能为空")
    private String shelvesNo;

    @ApiModelProperty(name = "shelvesSpecId" , value = "货架规格id" , required = true)
    @Min(value = 0 , message = "货架规格id不能小于1")
    private Long shelvesSpecId;

    @ApiModelProperty(name = "whZoneId" , value = "仓库区域id" , required = true)
    @Min(value = 0 , message = "仓库区域id不能小于1")
    private Long whZoneId;

    @ApiModelProperty(name = "row" , value = "货架所在的排" , required = true)
    @Min(value = 0 , message = "货架所在的排不能小于0")
    private Integer row;

    @ApiModelProperty(name = "col" , value = "货架所在的列" , required = true)
    @Min(value = 0 , message = "货架所在的列不能小于0")
    private Integer col;

    @ApiModelProperty(name = "descr" , value = "货架描述" , required = true)
    @NotEmpty(message = "货架描述不能为空")
    private String descr;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
