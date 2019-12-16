package com.apl.wms.order.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.order.po.InOrderPo;
import com.apl.wms.order.vo.InOrderListVo;
import com.apl.wms.order.vo.InOrderInfoVo;
import com.apl.wms.order.dto.InOrderKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 入库订单 service接口
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
public interface InOrderService extends IService<InOrderPo> {

        /**
         * @Desc: 添加一个InOrderPo实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Integer> add(InOrderPo inOrder);


        /**
         * @Desc: 根据id 更新一个InOrderPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Boolean> updById(InOrderPo inOrder);


        /**
         * @Desc: 根据id 查找一个InOrderPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 InOrderPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<InOrderInfoVo> selectById(Long id);


        /**
         * @Desc: 分页查找 InOrderPo 列表
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Page<InOrderListVo>>getList(PageDto pageDto, InOrderKeyDto keyDto);

}
