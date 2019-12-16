package com.apl.wms.order.mapper;

import com.apl.wms.order.po.InOrderCommodityItemPo;
import com.apl.wms.order.vo.InOrderCommodityItemListVo;
import com.apl.wms.order.vo.InOrderCommodityItemInfoVo;
import com.apl.wms.order.dto.InOrderCommodityItemKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 入库订单商品明细 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
public interface InOrderCommodityItemMapper extends BaseMapper<InOrderCommodityItemPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-16
     */
    public InOrderCommodityItemInfoVo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-16
     */
    List<InOrderCommodityItemListVo> getList(Page page, @Param("kd") InOrderCommodityItemKeyDto keyDto);



}
