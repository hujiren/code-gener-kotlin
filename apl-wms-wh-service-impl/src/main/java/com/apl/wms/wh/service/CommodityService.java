package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.CommodityPo;
import com.apl.wms.wh.vo.CommodityListVo;
import com.apl.wms.wh.vo.CommodityInfoVo;
import com.apl.wms.wh.dto.CommodityKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 商品 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface CommodityService extends IService<CommodityPo> {

        /**
         * @Desc: 添加一个CommodityPo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(CommodityPo commodity);


        /**
         * @Desc: 根据id 更新一个CommodityPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(CommodityPo commodity);


        /**
         * @Desc: 根据id 查找一个CommodityPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 CommodityPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<CommodityInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 CommodityPo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<CommodityListVo>>getList(PageDto pageDto, CommodityKeyDto keyDto);

}
