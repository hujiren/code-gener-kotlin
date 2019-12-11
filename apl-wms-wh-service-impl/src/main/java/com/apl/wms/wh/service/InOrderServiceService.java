package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.InOrderServicePo;
import com.apl.wms.wh.vo.InOrderServiceListVo;
import com.apl.wms.wh.vo.InOrderServiceInfoVo;
import com.apl.wms.wh.dto.InOrderServiceKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 入库订单服务 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface InOrderServiceService extends IService<InOrderServicePo> {

        /**
         * @Desc: 添加一个InOrderServicePo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(InOrderServicePo inOrderService);


        /**
         * @Desc: 根据id 更新一个InOrderServicePo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(InOrderServicePo inOrderService);


        /**
         * @Desc: 根据id 查找一个InOrderServicePo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 InOrderServicePo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<InOrderServiceInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 InOrderServicePo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<InOrderServiceListVo>>getList(PageDto pageDto, InOrderServiceKeyDto keyDto);

}
