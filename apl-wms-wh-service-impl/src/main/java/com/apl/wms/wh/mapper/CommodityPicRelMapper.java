package com.apl.wms.wh.mapper;

import com.apl.wms.wh.po.CommodityPicRelPo;
import com.apl.wms.wh.vo.CommodityPicRelListVo;
import com.apl.wms.wh.dto.CommodityPicRelKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 商品图片 Mapper 接口
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface CommodityPicRelMapper extends BaseMapper<CommodityPicRelPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    public CommodityPicRelPo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-10
     */
    List<CommodityPicRelListVo> getList(Page page, @Param("kd") CommodityPicRelKeyDto keyDto);

}
