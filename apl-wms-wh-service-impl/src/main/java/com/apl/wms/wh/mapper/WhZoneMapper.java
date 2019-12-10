package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.WhZonePo;
import com.apl.wms.wh.vo.WhZoneListVo;
import com.apl.wms.wh.dto.WhZoneKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 仓库分区 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface WhZoneMapper extends BaseMapper<WhZonePo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    public WhZonePo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    List<WhZoneListVo> getList(Page page, @Param("kd") WhZoneKeyDto keyDto);

}
