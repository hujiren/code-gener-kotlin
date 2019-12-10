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
 * 仓库
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("warehouse")
@ApiModel(value="WarehousePo对象", description="仓库")
public class WarehousePo extends Model<WarehousePo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "whCode" , value = "仓库代码" , required = true)
    @NotEmpty(message = "仓库代码不能为空")
    private String whCode;

    @ApiModelProperty(name = "whName" , value = "仓库名称" , required = true)
    @NotEmpty(message = "仓库名称不能为空")
    private String whName;

    @ApiModelProperty(name = "whNameEn" , value = "仓库英文名称" , required = true)
    @NotEmpty(message = "仓库英文名称不能为空")
    private String whNameEn;

    @ApiModelProperty(name = "whStatus" , value = "仓库状态 1:可用 2：不可用" , required = true)
    @Min(value = 0 , message = "仓库状态 1:可用 2：不可用不能小于0")
    private Integer whStatus;

    @ApiModelProperty(name = "whType" , value = "仓库类型 1：保税仓   2普通仓" , required = true)
    @Min(value = 0 , message = "仓库类型 1：保税仓   2普通仓不能小于0")
    private Integer whType;

    @ApiModelProperty(name = "localTimeZone" , value = "仓库所在时区" , required = true)
    @NotEmpty(message = "仓库所在时区不能为空")
    private String localTimeZone;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
