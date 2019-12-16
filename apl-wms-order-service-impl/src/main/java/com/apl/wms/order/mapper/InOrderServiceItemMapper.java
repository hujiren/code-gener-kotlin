package com.apl.wms.order.mapper;

import com.apl.wms.order.po.InOrderServiceItemPo;
import com.apl.wms.order.vo.InOrderServiceItemListVo;
import com.apl.wms.order.vo.InOrderServiceItemInfoVo;
import com.apl.wms.order.dto.InOrderServiceItemKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 入库订单服务 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
public interface InOrderServiceItemMapper extends BaseMapper<InOrderServiceItemPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-16
     */
    public InOrderServiceItemInfoVo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-16
     */
    List<InOrderServiceItemListVo> getList(Page page, @Param("kd") InOrderServiceItemKeyDto keyDto);



}
