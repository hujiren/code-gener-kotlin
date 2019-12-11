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
 * 货架
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WhShelvesListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 货架id
    private Integer id;



    // 货架编号
    private String shelvesNo;



    // 货架规格id
    private Integer shelvesSpecId;



    // 仓库区域id
    private Integer whZoneId;



    // 货架所在的排
    private Integer row;



    // 货架所在的列
    private Integer col;



    // 货架描述
    private String descr;






}
