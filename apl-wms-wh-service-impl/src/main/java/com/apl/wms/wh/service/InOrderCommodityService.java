package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.InOrderCommodityPo;
import com.apl.wms.wh.vo.InOrderCommodityListVo;
import com.apl.wms.wh.vo.InOrderCommodityInfoVo;
import com.apl.wms.wh.dto.InOrderCommodityKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 入库订单商品明细 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface InOrderCommodityService extends IService<InOrderCommodityPo> {

        /**
         * @Desc: 添加一个InOrderCommodityPo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(InOrderCommodityPo inOrderCommodity);


        /**
         * @Desc: 根据id 更新一个InOrderCommodityPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(InOrderCommodityPo inOrderCommodity);


        /**
         * @Desc: 根据id 查找一个InOrderCommodityPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 InOrderCommodityPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<InOrderCommodityInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 InOrderCommodityPo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<InOrderCommodityListVo>>getList(PageDto pageDto, InOrderCommodityKeyDto keyDto);

}
