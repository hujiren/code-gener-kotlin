package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.WhShelvesPo;
import com.apl.wms.wh.vo.WhShelvesListVo;
import com.apl.wms.wh.dto.WhShelvesKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 货架 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface WhShelvesMapper extends BaseMapper<WhShelvesPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    public WhShelvesPo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    List<WhShelvesListVo> getList(Page page, @Param("kd") WhShelvesKeyDto keyDto);

}
