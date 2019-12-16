package com.apl.wms.order.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;

/**
 * <p>
 * 入库订单操作 查询参数
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="入库订单操作 查询参数", description="入库订单操作 查询参数")
public class InOrderOperatiorKeyDto implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(name = "keyword", value = "关键词")
    private String keyword;

    public String getKeyword() {
        if (keyword != null && keyword.trim().equals(""))
            keyword = null;

        return keyword;
    }
}
