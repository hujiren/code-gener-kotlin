package com.apl.wms.order.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.order.po.InOrderServiceItemPo;
import com.apl.wms.order.vo.InOrderServiceItemListVo;
import com.apl.wms.order.vo.InOrderServiceItemInfoVo;
import com.apl.wms.order.dto.InOrderServiceItemKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 入库订单服务 service接口
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
public interface InOrderServiceItemService extends IService<InOrderServiceItemPo> {

        /**
         * @Desc: 添加一个InOrderServiceItemPo实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Integer> add(InOrderServiceItemPo inOrderServiceItem);


        /**
         * @Desc: 根据id 更新一个InOrderServiceItemPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Boolean> updById(InOrderServiceItemPo inOrderServiceItem);


        /**
         * @Desc: 根据id 查找一个InOrderServiceItemPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 InOrderServiceItemPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<InOrderServiceItemInfoVo> selectById(Long id);


        /**
         * @Desc: 分页查找 InOrderServiceItemPo 列表
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Page<InOrderServiceItemListVo>>getList(PageDto pageDto, InOrderServiceItemKeyDto keyDto);

}
