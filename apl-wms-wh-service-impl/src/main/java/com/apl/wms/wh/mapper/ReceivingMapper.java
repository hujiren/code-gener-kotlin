package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.ReceivingPo;
import com.apl.wms.wh.vo.ReceivingListVo;
import com.apl.wms.wh.vo.ReceivingInfoVo;
import com.apl.wms.wh.dto.ReceivingKeyDto;
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
public interface ReceivingMapper extends BaseMapper<ReceivingPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public ReceivingInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<ReceivingListVo> getList(Page page, @Param("kd") ReceivingKeyDto keyDto);

}
