package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.StorePo;
import com.apl.wms.wh.vo.StoreListVo;
import com.apl.wms.wh.vo.StoreInfoVo;
import com.apl.wms.wh.dto.StoreKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 网店铺 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface StoreMapper extends BaseMapper<StorePo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    public StoreInfoVo getById(@Param("id") Integer id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-11
     */
    List<StoreListVo> getList(Page page, @Param("kd") StoreKeyDto keyDto);

}
