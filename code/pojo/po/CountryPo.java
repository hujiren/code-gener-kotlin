package com.apl.lms.common.pojo.po.po;

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
 * 国家 持久化对象
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("country")
@ApiModel(value="国家 持久化对象", description="国家 持久化对象")
public class CountryPo extends Model<CountryPo> {


    @TableId(value = "country_code", type = IdType.UUID)
    private String countryCode;

    @ApiModelProperty(name = "nameCn" , value = "中文名" , required = true)
    @NotEmpty(message = "中文名不能为空")
    private String nameCn;

    @ApiModelProperty(name = "nameEn" , value = "英文名" , required = true)
    @NotEmpty(message = "英文名不能为空")
    private String nameEn;

    @ApiModelProperty(name = "startZip" , value = "起始邮编" , required = true)
    @NotEmpty(message = "起始邮编不能为空")
    private String startZip;

    @ApiModelProperty(name = "endZip" , value = "截止邮编" , required = true)
    @NotEmpty(message = "截止邮编不能为空")
    private String endZip;

    @ApiModelProperty(name = "aliasName" , value = "别名" , required = true)
    @NotEmpty(message = "别名不能为空")
    private String aliasName;

    @ApiModelProperty(name = "type" , value = "类型：1国家  2地区" , required = true)
    private Boolean type;

    @ApiModelProperty(name = "homeCountry" , value = "所属国家" , required = true)
    @NotEmpty(message = "所属国家不能为空")
    private String homeCountry;

    private static final long serialVersionUID=1L;


    @Override
    protected Serializable pkVal() {
        return this.countryCode;
    }

}
