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
 * 仓库分区
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WhZoneListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 仓库分区id
    private Long id;



    // 仓库id
    private Long whId;



    // 分区编号code
    private String zoneCode;



    // 分区名称
    private String zoneName;



    // 分区类型 1：产品区 2：入库区 3：退货区 4：中转区
    private Integer zoneType;






}
