package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.WhOperatorPo;
import com.apl.wms.wh.vo.WhOperatorListVo;
import com.apl.wms.wh.dto.WhOperatorKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 仓库操作员 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface WhOperatorMapper extends BaseMapper<WhOperatorPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    public WhOperatorPo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    List<WhOperatorListVo> getList(Page page, @Param("kd") WhOperatorKeyDto keyDto);

}
