package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.ReceivingPo;
import com.apl.wms.wh.vo.ReceivingListVo;
import com.apl.wms.wh.vo.ReceivingInfoVo;
import com.apl.wms.wh.dto.ReceivingKeyDto;
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
public interface ReceivingService extends IService<ReceivingPo> {

        /**
         * @Desc: 添加一个ReceivingPo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(ReceivingPo receiving);


        /**
         * @Desc: 根据id 更新一个ReceivingPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(ReceivingPo receiving);


        /**
         * @Desc: 根据id 查找一个ReceivingPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 ReceivingPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<ReceivingInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 ReceivingPo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<ReceivingListVo>>getList(PageDto pageDto, ReceivingKeyDto keyDto);

}
