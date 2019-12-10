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
 * 货蓝
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("goods_backet")
@ApiModel(value="GoodsBacketPo对象", description="货蓝")
public class GoodsBacketPo extends Model<GoodsBacketPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name = "backetNo" , value = "篮子编号" , required = true)
    @NotEmpty(message = "篮子编号不能为空")
    private String backetNo;

    @ApiModelProperty(name = "desc" , value = "描述" , required = true)
    @NotEmpty(message = "描述不能为空")
    private String desc;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
