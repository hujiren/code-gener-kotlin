package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.OutOrderCommodityPo;
import com.apl.wms.wh.vo.OutOrderCommodityListVo;
import com.apl.wms.wh.vo.OutOrderCommodityInfoVo;
import com.apl.wms.wh.dto.OutOrderCommodityKeyDto;
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
public interface OutOrderCommodityService extends IService<OutOrderCommodityPo> {

        /**
         * @Desc: 添加一个OutOrderCommodityPo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(OutOrderCommodityPo outOrderCommodity);


        /**
         * @Desc: 根据id 更新一个OutOrderCommodityPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(OutOrderCommodityPo outOrderCommodity);


        /**
         * @Desc: 根据id 查找一个OutOrderCommodityPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 OutOrderCommodityPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<OutOrderCommodityInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 OutOrderCommodityPo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<OutOrderCommodityListVo>>getList(PageDto pageDto, OutOrderCommodityKeyDto keyDto);

}
