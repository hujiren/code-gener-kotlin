package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.InOrderOperPo;
import com.apl.wms.wh.vo.InOrderOperListVo;
import com.apl.wms.wh.vo.InOrderOperInfoVo;
import com.apl.wms.wh.dto.InOrderOperKeyDto;
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
 * @since 2019-12-11
 */
public interface InOrderOperMapper extends BaseMapper<InOrderOperPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public InOrderOperInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<InOrderOperListVo> getList(Page page, @Param("kd") InOrderOperKeyDto keyDto);

}
