package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.OutOrderCommodityPo;
import com.apl.wms.wh.vo.OutOrderCommodityListVo;
import com.apl.wms.wh.vo.OutOrderCommodityInfoVo;
import com.apl.wms.wh.dto.OutOrderCommodityKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface OutOrderCommodityMapper extends BaseMapper<OutOrderCommodityPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public OutOrderCommodityInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<OutOrderCommodityListVo> getList(Page page, @Param("kd") OutOrderCommodityKeyDto keyDto);

}
