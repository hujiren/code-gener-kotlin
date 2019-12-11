package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.StorageLocationPo;
import com.apl.wms.wh.vo.StorageLocationListVo;
import com.apl.wms.wh.vo.StorageLocationInfoVo;
import com.apl.wms.wh.dto.StorageLocationKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 库位 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface StorageLocationMapper extends BaseMapper<StorageLocationPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public StorageLocationInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<StorageLocationListVo> getList(Page page, @Param("kd") StorageLocationKeyDto keyDto);

}
