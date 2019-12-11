package com.apl.wms.wh.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;

/**
 * <p>
 * 仓库
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WarehouseInfoVo implements Serializable {


private static final long serialVersionUID=1L;


    // 仓库id
    private Integer id;



    // 仓库代码
    private String whCode;



    // 仓库名称
    private String whName;



    // 仓库英文名称
    private String whNameEn;



    // 仓库状态 1:可用 2：不可用
    private Integer whStatus;



    // 仓库类型 1：保税仓   2普通仓
    private Integer whType;



    // 仓库所在时区
    private String localTimeZone;






}
