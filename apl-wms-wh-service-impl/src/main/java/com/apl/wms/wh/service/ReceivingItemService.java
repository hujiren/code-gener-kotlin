package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.ReceivingItemPo;
import com.apl.wms.wh.vo.ReceivingItemListVo;
import com.apl.wms.wh.vo.ReceivingItemInfoVo;
import com.apl.wms.wh.dto.ReceivingItemKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface ReceivingItemService extends IService<ReceivingItemPo> {

        /**
         * @Desc: 添加一个ReceivingItemPo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(ReceivingItemPo receivingItem);


        /**
         * @Desc: 根据id 更新一个ReceivingItemPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(ReceivingItemPo receivingItem);


        /**
         * @Desc: 根据id 查找一个ReceivingItemPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 ReceivingItemPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<ReceivingItemInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 ReceivingItemPo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<ReceivingItemListVo>>getList(PageDto pageDto, ReceivingItemKeyDto keyDto);

}
