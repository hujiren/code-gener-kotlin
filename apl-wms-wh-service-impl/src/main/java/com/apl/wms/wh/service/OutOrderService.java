package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.OutOrderPo;
import com.apl.wms.wh.vo.OutOrderListVo;
import com.apl.wms.wh.vo.OutOrderInfoVo;
import com.apl.wms.wh.dto.OutOrderKeyDto;
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
public interface OutOrderService extends IService<OutOrderPo> {

        /**
         * @Desc: 添加一个OutOrderPo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(OutOrderPo outOrder);


        /**
         * @Desc: 根据id 更新一个OutOrderPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(OutOrderPo outOrder);


        /**
         * @Desc: 根据id 查找一个OutOrderPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 OutOrderPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<OutOrderInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 OutOrderPo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<OutOrderListVo>>getList(PageDto pageDto, OutOrderKeyDto keyDto);

}
