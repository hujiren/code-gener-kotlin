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
 * 仓库操作员
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WhOperatorListVo implements Serializable {


private static final long serialVersionUID=1L;


    // 仓库操作员id
    private Integer id;



    // 操作员id
    private Integer memberId;



    // 操作员姓名
    private String memberName;



    // 所属的仓库id
    private Integer whId;






}
