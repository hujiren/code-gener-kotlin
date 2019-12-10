package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.WhDetailsPo;
import com.apl.wms.wh.vo.WhDetailsListVo;
import com.apl.wms.wh.dto.WhDetailsKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 仓库详细 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface WhDetailsMapper extends BaseMapper<WhDetailsPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    public WhDetailsPo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    List<WhDetailsListVo> getList(Page page, @Param("kd") WhDetailsKeyDto keyDto);

}
