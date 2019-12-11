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
 * 仓库分区
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("wh_zone")
@ApiModel(value="WhZonePo对象", description="仓库分区")
public class WhZonePo extends Model<WhZonePo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(name = "whId" , value = "仓库id" , required = true)
    @Min(value = 0 , message = "仓库id不能小于0")
    private Integer whId;

    @ApiModelProperty(name = "zoneCode" , value = "分区编号code" , required = true)
    @NotEmpty(message = "分区编号code不能为空")
    private String zoneCode;

    @ApiModelProperty(name = "zoneName" , value = "分区名称" , required = true)
    @NotEmpty(message = "分区名称不能为空")
    private String zoneName;

    @ApiModelProperty(name = "zoneType" , value = "分区类型 1：产品区 2：入库区 3：退货区 4：中转区" , required = true)
    @Min(value = 0 , message = "分区类型 1：产品区 2：入库区 3：退货区 4：中转区不能小于0")
    private Integer zoneType;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
