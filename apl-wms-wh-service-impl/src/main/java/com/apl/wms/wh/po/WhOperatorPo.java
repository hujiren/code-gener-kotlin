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
 * 仓库操作员
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("wh_operator")
@ApiModel(value="WhOperatorPo对象", description="仓库操作员")
public class WhOperatorPo extends Model<WhOperatorPo> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(name = "memberId" , value = "操作员id" , required = true)
    @Min(value = 0 , message = "操作员id不能小于1")
    private Long memberId;

    @ApiModelProperty(name = "memberName" , value = "操作员姓名" , required = true)
    @NotEmpty(message = "操作员姓名不能为空")
    private String memberName;

    @ApiModelProperty(name = "whId" , value = "所属的仓库id" , required = true)
    @Min(value = 0 , message = "所属的仓库id不能小于1")
    private Long whId;

    private Long innerOrgId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
