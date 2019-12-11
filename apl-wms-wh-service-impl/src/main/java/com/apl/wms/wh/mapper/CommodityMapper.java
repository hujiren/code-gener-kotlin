package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.CommodityPo;
import com.apl.wms.wh.vo.CommodityListVo;
import com.apl.wms.wh.vo.CommodityInfoVo;
import com.apl.wms.wh.dto.CommodityKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 商品 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface CommodityMapper extends BaseMapper<CommodityPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public CommodityInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<CommodityListVo> getList(Page page, @Param("kd") CommodityKeyDto keyDto);

}
