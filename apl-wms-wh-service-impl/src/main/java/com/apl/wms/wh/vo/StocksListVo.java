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
 * 库存
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class StocksListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 库存id
    private Integer id;



    // 仓库id
    private Integer whId;



    // 商品id
    private Integer commodityId;



    // 当前库存
    private Integer stockCount;



    // 冻结的库存
    private Integer stockFreeze;






}
