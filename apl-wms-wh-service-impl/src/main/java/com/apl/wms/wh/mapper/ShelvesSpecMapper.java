package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.ShelvesSpecPo;
import com.apl.wms.wh.vo.ShelvesSpecListVo;
import com.apl.wms.wh.dto.ShelvesSpecKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 货架规格 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface ShelvesSpecMapper extends BaseMapper<ShelvesSpecPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    public ShelvesSpecPo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    List<ShelvesSpecListVo> getList(Page page, @Param("kd") ShelvesSpecKeyDto keyDto);

}
