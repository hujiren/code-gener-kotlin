package com.apl.wms.order.mapper;

import com.apl.wms.order.po.InOrderPo;
import com.apl.wms.order.vo.InOrderListVo;
import com.apl.wms.order.vo.InOrderInfoVo;
import com.apl.wms.order.dto.InOrderKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 入库订单 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
public interface InOrderMapper extends BaseMapper<InOrderPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-16
     */
    public InOrderInfoVo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-16
     */
    List<InOrderListVo> getList(Page page, @Param("kd") InOrderKeyDto keyDto);



}
