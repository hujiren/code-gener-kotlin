package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.CommodityCategoryPo;
import com.apl.wms.wh.vo.CommodityCategoryListVo;
import com.apl.wms.wh.vo.CommodityCategoryInfoVo;
import com.apl.wms.wh.dto.CommodityCategoryKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 商品种类 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface CommodityCategoryMapper extends BaseMapper<CommodityCategoryPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public CommodityCategoryInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<CommodityCategoryListVo> getList(Page page, @Param("kd") CommodityCategoryKeyDto keyDto);

}
