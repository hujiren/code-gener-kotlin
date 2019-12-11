package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.StocksPo;
import com.apl.wms.wh.vo.StocksListVo;
import com.apl.wms.wh.vo.StocksInfoVo;
import com.apl.wms.wh.dto.StocksKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 库存 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface StocksMapper extends BaseMapper<StocksPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public StocksInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<StocksListVo> getList(Page page, @Param("kd") StocksKeyDto keyDto);

}
