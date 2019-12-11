package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.OutOrderDetailsPo;
import com.apl.wms.wh.vo.OutOrderDetailsListVo;
import com.apl.wms.wh.vo.OutOrderDetailsInfoVo;
import com.apl.wms.wh.dto.OutOrderDetailsKeyDto;
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
public interface OutOrderDetailsMapper extends BaseMapper<OutOrderDetailsPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public OutOrderDetailsInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<OutOrderDetailsListVo> getList(Page page, @Param("kd") OutOrderDetailsKeyDto keyDto);

}
