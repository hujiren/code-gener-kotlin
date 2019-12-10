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
 * 库位储存商品数量
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class StorageCommodityListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 库位储存商品数量id
    private Long id;



    // 库位id
    private Long storageId;



    // 商品id
    private Long commodityId;



    // 当前存放商品的数量
    private Integer stockCount;






}
