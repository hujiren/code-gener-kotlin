package entity;

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
 * 国家
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Country对象", description="国家")
public class Country extends Model<Country> {

private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "国家简码")
    @TableId(value = "country_code", type = IdType.UUID)
    private String countryCode;

    @ApiModelProperty(value = "中文名")
    private String nameCn;

    @ApiModelProperty(value = "英文名")
    private String nameEn;

    @ApiModelProperty(value = "起始邮编")
    private String startZip;

    @ApiModelProperty(value = "截止邮编")
    private String endZip;

    @ApiModelProperty(value = "别名")
    private String aliasName;

    @ApiModelProperty(value = "类型：1国家  2地区")
    private Boolean type;

    @ApiModelProperty(value = "所属国家")
    private String homeCountry;


    @Override
    protected Serializable pkVal() {
        return this.countryCode;
    }

}
