package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.InOrderCommodityPo;
import com.apl.wms.wh.vo.InOrderCommodityListVo;
import com.apl.wms.wh.vo.InOrderCommodityInfoVo;
import com.apl.wms.wh.dto.InOrderCommodityKeyDto;
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
 * @since 2019-12-11
 */
public interface InOrderCommodityMapper extends BaseMapper<InOrderCommodityPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public InOrderCommodityInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<InOrderCommodityListVo> getList(Page page, @Param("kd") InOrderCommodityKeyDto keyDto);

}
