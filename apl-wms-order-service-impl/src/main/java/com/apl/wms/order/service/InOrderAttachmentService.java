package com.apl.wms.order.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.order.po.InOrderAttachmentPo;
import com.apl.wms.order.vo.InOrderAttachmentListVo;
import com.apl.wms.order.vo.InOrderAttachmentInfoVo;
import com.apl.wms.order.dto.InOrderAttachmentKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 入库订单其他信息 service接口
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
public interface InOrderAttachmentService extends IService<InOrderAttachmentPo> {

        /**
         * @Desc: 添加一个InOrderAttachmentPo实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Integer> add(InOrderAttachmentPo inOrderAttachment);


        /**
         * @Desc: 根据id 更新一个InOrderAttachmentPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Boolean> updById(InOrderAttachmentPo inOrderAttachment);


        /**
         * @Desc: 根据id 查找一个InOrderAttachmentPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 InOrderAttachmentPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<InOrderAttachmentInfoVo> selectById(Long id);


        /**
         * @Desc: 分页查找 InOrderAttachmentPo 列表
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Page<InOrderAttachmentListVo>>getList(PageDto pageDto, InOrderAttachmentKeyDto keyDto);

}
