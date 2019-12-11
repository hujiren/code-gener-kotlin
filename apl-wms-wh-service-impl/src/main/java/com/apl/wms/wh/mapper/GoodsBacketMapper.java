package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.GoodsBacketPo;
import com.apl.wms.wh.vo.GoodsBacketListVo;
import com.apl.wms.wh.vo.GoodsBacketInfoVo;
import com.apl.wms.wh.dto.GoodsBacketKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 货蓝 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface GoodsBacketMapper extends BaseMapper<GoodsBacketPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public GoodsBacketInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<GoodsBacketListVo> getList(Page page, @Param("kd") GoodsBacketKeyDto keyDto);

}
