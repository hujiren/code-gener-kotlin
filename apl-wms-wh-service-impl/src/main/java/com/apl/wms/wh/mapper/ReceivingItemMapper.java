package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.ReceivingItemPo;
import com.apl.wms.wh.vo.ReceivingItemListVo;
import com.apl.wms.wh.vo.ReceivingItemInfoVo;
import com.apl.wms.wh.dto.ReceivingItemKeyDto;
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
public interface ReceivingItemMapper extends BaseMapper<ReceivingItemPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public ReceivingItemInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<ReceivingItemListVo> getList(Page page, @Param("kd") ReceivingItemKeyDto keyDto);

}
