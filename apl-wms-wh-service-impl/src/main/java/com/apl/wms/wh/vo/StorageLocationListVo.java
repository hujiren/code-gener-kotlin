package com.apl.wms.wh.vo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;

/**
 * <p>
 * 库位
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class StorageLocationListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 库位id
    private Long id;



    // 库位编号（条形码）
    private String storageNo;



    // 长
    private BigDecimal sizeLength;



    // 宽
    private BigDecimal sizeWidth;



    // 高
    private BigDecimal sizeHeight;



    // 承受重量
    private Double supportWeight;



    // 库位描述
    private String descr;



    // 货架id
    private Long shelvesId;






}
