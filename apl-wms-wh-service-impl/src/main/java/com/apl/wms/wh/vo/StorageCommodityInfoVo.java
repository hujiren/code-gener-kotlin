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
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class StorageCommodityInfoVo implements Serializable {


private static final long serialVersionUID=1L;


    // 库位储存商品数量id
    private Integer id;



    // 库位id
    private Integer storageId;



    // 商品id
    private Integer commodityId;



    // 当前存放商品的数量
    private Integer stockCount;






}
