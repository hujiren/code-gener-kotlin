package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.InOrderPo;
import com.apl.wms.wh.vo.InOrderListVo;
import com.apl.wms.wh.vo.InOrderInfoVo;
import com.apl.wms.wh.dto.InOrderKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 入库订单基本信息 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface InOrderService extends IService<InOrderPo> {

        /**
         * @Desc: 添加一个InOrderPo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(InOrderPo inOrder);


        /**
         * @Desc: 根据id 更新一个InOrderPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(InOrderPo inOrder);


        /**
         * @Desc: 根据id 查找一个InOrderPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 InOrderPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<InOrderInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 InOrderPo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<InOrderListVo>>getList(PageDto pageDto, InOrderKeyDto keyDto);

}
