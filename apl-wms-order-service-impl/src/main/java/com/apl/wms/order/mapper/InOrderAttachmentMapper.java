package com.apl.wms.order.mapper;

import com.apl.wms.order.po.InOrderAttachmentPo;
import com.apl.wms.order.vo.InOrderAttachmentListVo;
import com.apl.wms.order.vo.InOrderAttachmentInfoVo;
import com.apl.wms.order.dto.InOrderAttachmentKeyDto;
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
 * @since 2019-12-16
 */
public interface InOrderAttachmentMapper extends BaseMapper<InOrderAttachmentPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2019-12-16
     */
    public InOrderAttachmentInfoVo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2019-12-16
     */
    List<InOrderAttachmentListVo> getList(Page page, @Param("kd") InOrderAttachmentKeyDto keyDto);



}
