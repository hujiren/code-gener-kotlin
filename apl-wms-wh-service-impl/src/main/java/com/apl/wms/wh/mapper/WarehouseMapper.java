package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.WarehousePo;
import com.apl.wms.wh.vo.WarehouseListVo;
import com.apl.wms.wh.vo.WarehouseInfoVo;
import com.apl.wms.wh.dto.WarehouseKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 仓库 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface WarehouseMapper extends BaseMapper<WarehousePo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public WarehouseInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<WarehouseListVo> getList(Page page, @Param("kd") WarehouseKeyDto keyDto);

}
