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
 * 商品图片
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("commodity_pic_rel")
@ApiModel(value="CommodityPicRelPo对象", description="商品图片")
public class CommodityPicRelPo extends Model<CommodityPicRelPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(name = "communityId" , value = "商品id" , required = true)
    @Min(value = 0 , message = "商品id不能小于0")
    private Integer communityId;

    @ApiModelProperty(name = "imgUrl" , value = "图片地址" , required = true)
    @NotEmpty(message = "图片地址不能为空")
    private String imgUrl;

    @ApiModelProperty(name = "imgSort" , value = "排序" , required = true)
    @Min(value = 0 , message = "排序不能小于0")
    private Integer imgSort;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
