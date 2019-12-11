package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.InOrderDetailsPo;
import com.apl.wms.wh.vo.InOrderDetailsListVo;
import com.apl.wms.wh.vo.InOrderDetailsInfoVo;
import com.apl.wms.wh.dto.InOrderDetailsKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 入库订单其他信息 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface InOrderDetailsMapper extends BaseMapper<InOrderDetailsPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public InOrderDetailsInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<InOrderDetailsListVo> getList(Page page, @Param("kd") InOrderDetailsKeyDto keyDto);

}
