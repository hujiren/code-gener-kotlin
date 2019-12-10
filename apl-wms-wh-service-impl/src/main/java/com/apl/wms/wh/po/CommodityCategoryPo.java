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
 * 商品种类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("commodity_category")
@ApiModel(value="CommodityCategoryPo对象", description="商品种类")
public class CommodityCategoryPo extends Model<CommodityCategoryPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "categoryName" , value = "商品分类名称" , required = true)
    @NotEmpty(message = "商品分类名称不能为空")
    private String categoryName;

    @ApiModelProperty(name = "categoryNameEn" , value = "商品分类英文名称" , required = true)
    @NotEmpty(message = "商品分类英文名称不能为空")
    private String categoryNameEn;

    @ApiModelProperty(name = "parentId" , value = "商品分类的父级id" , required = true)
    @Min(value = 0 , message = "商品分类的父级id不能小于1")
    private Long parentId;

    @ApiModelProperty(name = "isLeaf" , value = "是否为叶子节点" , required = true)
    @Min(value = 0 , message = "是否为叶子节点不能小于0")
    private Integer isLeaf;

    @ApiModelProperty(name = "isSys" , value = "是否为系统自带的分类" , required = true)
    @Min(value = 0 , message = "是否为系统自带的分类不能小于0")
    private Integer isSys;

    @ApiModelProperty(name = "custId" , value = "分类所属的客户" , required = true)
    @Min(value = 0 , message = "分类所属的客户不能小于1")
    private Long custId;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
