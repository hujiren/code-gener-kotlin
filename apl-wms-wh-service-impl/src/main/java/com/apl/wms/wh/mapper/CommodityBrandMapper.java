package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.CommodityBrandPo;
import com.apl.wms.wh.vo.CommodityBrandListVo;
import com.apl.wms.wh.dto.CommodityBrandKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 商品品牌 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface CommodityBrandMapper extends BaseMapper<CommodityBrandPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    public CommodityBrandPo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    List<CommodityBrandListVo> getList(Page page, @Param("kd") CommodityBrandKeyDto keyDto);

}
