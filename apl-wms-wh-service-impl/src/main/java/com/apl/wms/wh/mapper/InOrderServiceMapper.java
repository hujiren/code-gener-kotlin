package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.InOrderServicePo;
import com.apl.wms.wh.vo.InOrderServiceListVo;
import com.apl.wms.wh.vo.InOrderServiceInfoVo;
import com.apl.wms.wh.dto.InOrderServiceKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 入库订单服务 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface InOrderServiceMapper extends BaseMapper<InOrderServicePo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public InOrderServiceInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<InOrderServiceListVo> getList(Page page, @Param("kd") InOrderServiceKeyDto keyDto);

}
