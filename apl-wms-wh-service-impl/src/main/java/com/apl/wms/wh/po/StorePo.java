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
 * 网店铺
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("store")
@ApiModel(value="StorePo对象", description="网店铺")
public class StorePo extends Model<StorePo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "storeCode" , value = "店铺编码code" , required = true)
    @NotEmpty(message = "店铺编码code不能为空")
    private String storeCode;

    @ApiModelProperty(name = "storeName" , value = "店铺名称" , required = true)
    @NotEmpty(message = "店铺名称不能为空")
    private String storeName;

    @ApiModelProperty(name = "storeNameEn" , value = "店铺英文名称" , required = true)
    @NotEmpty(message = "店铺英文名称不能为空")
    private String storeNameEn;

    @ApiModelProperty(name = "custId" , value = "店铺所属的客户id" , required = true)
    @Min(value = 0 , message = "店铺所属的客户id不能小于1")
    private Long custId;

    @ApiModelProperty(name = "electricCode" , value = "电商平台代码" , required = true)
    @NotEmpty(message = "电商平台代码不能为空")
    private String electricCode;

    @ApiModelProperty(name = "storeStatus" , value = "店铺状态 1: 可用 0：不可用" , required = true)
    @Min(value = 0 , message = "店铺状态 1: 可用 0：不可用不能小于0")
    private Integer storeStatus;

    @ApiModelProperty(name = "apiConfig" , value = "店铺在电商平台的配置参数" , required = true)
    @NotEmpty(message = "店铺在电商平台的配置参数不能为空")
    private String apiConfig;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
