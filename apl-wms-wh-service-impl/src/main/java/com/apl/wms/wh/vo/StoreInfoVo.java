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
 * 网店铺
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class StoreInfoVo implements Serializable {


private static final long serialVersionUID=1L;


    // 网店铺id
    private Integer id;



    // 店铺编码code
    private String storeCode;



    // 店铺名称
    private String storeName;



    // 店铺英文名称
    private String storeNameEn;



    // 店铺所属的客户id
    private Integer custId;



    // 电商平台代码
    private String electricCode;



    // 店铺状态 1: 可用 0：不可用
    private Integer storeStatus;



    // 店铺在电商平台的配置参数
    private String apiConfig;






}
