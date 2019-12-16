package com.apl.wms.order.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.order.po.InOrderCommodityItemPo;
import com.apl.wms.order.vo.InOrderCommodityItemListVo;
import com.apl.wms.order.vo.InOrderCommodityItemInfoVo;
import com.apl.wms.order.dto.InOrderCommodityItemKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 入库订单商品明细 service接口
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
public interface InOrderCommodityItemService extends IService<InOrderCommodityItemPo> {

        /**
         * @Desc: 添加一个InOrderCommodityItemPo实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Integer> add(InOrderCommodityItemPo inOrderCommodityItem);


        /**
         * @Desc: 根据id 更新一个InOrderCommodityItemPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Boolean> updById(InOrderCommodityItemPo inOrderCommodityItem);


        /**
         * @Desc: 根据id 查找一个InOrderCommodityItemPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 InOrderCommodityItemPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<InOrderCommodityItemInfoVo> selectById(Long id);


        /**
         * @Desc: 分页查找 InOrderCommodityItemPo 列表
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Page<InOrderCommodityItemListVo>>getList(PageDto pageDto, InOrderCommodityItemKeyDto keyDto);

}
