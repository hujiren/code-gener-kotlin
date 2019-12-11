package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.CommodityBrandPo;
import com.apl.wms.wh.vo.CommodityBrandListVo;
import com.apl.wms.wh.vo.CommodityBrandInfoVo;
import com.apl.wms.wh.dto.CommodityBrandKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 商品品牌 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface CommodityBrandService extends IService<CommodityBrandPo> {

        /**
         * @Desc: 添加一个CommodityBrandPo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(CommodityBrandPo commodityBrand);


        /**
         * @Desc: 根据id 更新一个CommodityBrandPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(CommodityBrandPo commodityBrand);


        /**
         * @Desc: 根据id 查找一个CommodityBrandPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 CommodityBrandPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<CommodityBrandInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 CommodityBrandPo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<CommodityBrandListVo>>getList(PageDto pageDto, CommodityBrandKeyDto keyDto);

}
