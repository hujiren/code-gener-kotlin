package com.apl.lms.common.pojo.po;

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
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 计件方式 更新对象
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("count_way")
@ApiModel(value="计件方式 更新对象", description="计件方式 更新对象")
public class CountWayPo extends Model<CountWayPo> {


    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(name = "wayCode" , value = "代码" , required = true)
    @NotEmpty(message = "代码不能为空")
    private String wayCode;

    @ApiModelProperty(name = "nameCn" , value = "中文名称" , required = true)
    @NotEmpty(message = "中文名称不能为空")
    private String nameCn;

    @ApiModelProperty(name = "nameEn" , value = "英文名称" , required = true)
    @NotEmpty(message = "英文名称不能为空")
    private String nameEn;

    @ApiModelProperty(name = "way" , value = "计件方式  1按单件  2按多件" , required = true)
    private Boolean way;

    @ApiModelProperty(name = "pieceUpperCarry" , value = "单件上进位" , required = true)
    private Boolean pieceUpperCarry;

    @ApiModelProperty(name = "totalUpperCarry" , value = "合计上进位" , required = true)
    private Boolean totalUpperCarry;

    @ApiModelProperty(name = "smallCargoCarry" , value = "小货进位重" , required = true)
    @NotNull(message = "小货进位重不能为空")
    @Min(value = 0 , message = "小货进位重不合法")
    private BigDecimal smallCargoCarry;

    @ApiModelProperty(name = "bigCargoCarry" , value = "大货进位重" , required = true)
    @NotNull(message = "大货进位重不能为空")
    @Min(value = 0 , message = "大货进位重不合法")
    private BigDecimal bigCargoCarry;

    @ApiModelProperty(name = "bulkyCode" , value = "计泡代码" , required = true)
    @NotEmpty(message = "计泡代码不能为空")
    private String bulkyCode;

    private static final long serialVersionUID=1L;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
