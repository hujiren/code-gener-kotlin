package com.baomidou.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 计件方式
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CountWay对象", description="计件方式")
public class CountWay extends Model<CountWay> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "代码")
    private String wayCode;

    @ApiModelProperty(value = "中文名称")
    private String nameCn;

    @ApiModelProperty(value = "英文名称")
    private String nameEn;

    @ApiModelProperty(value = "计件方式  1按单件  2按多件")
    private Boolean way;

    @ApiModelProperty(value = "单件上进位")
    private Boolean pieceUpperCarry;

    @ApiModelProperty(value = "合计上进位")
    private Boolean totalUpperCarry;

    @ApiModelProperty(value = "小货进位重")
    private BigDecimal smallCargoCarry;

    @ApiModelProperty(value = "大货进位重")
    private BigDecimal bigCargoCarry;

    @ApiModelProperty(value = "计泡代码")
    private String bulkyCode;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
