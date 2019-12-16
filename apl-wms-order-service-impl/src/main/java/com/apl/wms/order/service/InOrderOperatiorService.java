package com.apl.wms.order.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.order.po.InOrderOperatiorPo;
import com.apl.wms.order.vo.InOrderOperatiorListVo;
import com.apl.wms.order.vo.InOrderOperatiorInfoVo;
import com.apl.wms.order.dto.InOrderOperatiorKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 入库订单操作 service接口
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
public interface InOrderOperatiorService extends IService<InOrderOperatiorPo> {

        /**
         * @Desc: 添加一个InOrderOperatiorPo实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Integer> add(InOrderOperatiorPo inOrderOperatior);


        /**
         * @Desc: 根据id 更新一个InOrderOperatiorPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Boolean> updById(InOrderOperatiorPo inOrderOperatior);


        /**
         * @Desc: 根据id 查找一个InOrderOperatiorPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 InOrderOperatiorPo 实体
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<InOrderOperatiorInfoVo> selectById(Long id);


        /**
         * @Desc: 分页查找 InOrderOperatiorPo 列表
         * @author cy
         * @since 2019-12-16
         */
        ResultUtils<Page<InOrderOperatiorListVo>>getList(PageDto pageDto, InOrderOperatiorKeyDto keyDto);

}
