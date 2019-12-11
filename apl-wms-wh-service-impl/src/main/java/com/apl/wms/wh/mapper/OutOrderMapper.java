package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.OutOrderPo;
import com.apl.wms.wh.vo.OutOrderListVo;
import com.apl.wms.wh.vo.OutOrderInfoVo;
import com.apl.wms.wh.dto.OutOrderKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface OutOrderMapper extends BaseMapper<OutOrderPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public OutOrderInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<OutOrderListVo> getList(Page page, @Param("kd") OutOrderKeyDto keyDto);

}
