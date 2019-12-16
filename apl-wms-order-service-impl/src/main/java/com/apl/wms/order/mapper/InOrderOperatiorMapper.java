package com.apl.wms.order.mapper;

import com.apl.wms.order.po.InOrderOperatiorPo;
import com.apl.wms.order.vo.InOrderOperatiorListVo;
import com.apl.wms.order.vo.InOrderOperatiorInfoVo;
import com.apl.wms.order.dto.InOrderOperatiorKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 入库订单操作 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
public interface InOrderOperatiorMapper extends BaseMapper<InOrderOperatiorPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-16
     */
    public InOrderOperatiorInfoVo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-16
     */
    List<InOrderOperatiorListVo> getList(Page page, @Param("kd") InOrderOperatiorKeyDto keyDto);



}
