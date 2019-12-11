package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.InOrderPo;
import com.apl.wms.wh.vo.InOrderListVo;
import com.apl.wms.wh.vo.InOrderInfoVo;
import com.apl.wms.wh.dto.InOrderKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 入库订单基本信息 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface InOrderMapper extends BaseMapper<InOrderPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public InOrderInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<InOrderListVo> getList(Page page, @Param("kd") InOrderKeyDto keyDto);

}
