package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.StorageCommodityPo;
import com.apl.wms.wh.vo.StorageCommodityListVo;
import com.apl.wms.wh.dto.StorageCommodityKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 库位储存商品数量 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface StorageCommodityMapper extends BaseMapper<StorageCommodityPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    public StorageCommodityPo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    List<StorageCommodityListVo> getList(Page page, @Param("kd") StorageCommodityKeyDto keyDto);

}
