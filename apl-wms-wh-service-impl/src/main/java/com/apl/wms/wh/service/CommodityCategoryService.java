package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.CommodityCategoryPo;
import com.apl.wms.wh.vo.CommodityCategoryListVo;
import com.apl.wms.wh.dto.CommodityCategoryKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 商品种类 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface CommodityCategoryService extends IService<CommodityCategoryPo> {

        /**
         * @Desc: 添加一个CommodityCategoryPo实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Integer> add(CommodityCategoryPo commodityCategory);


        /**
         * @Desc: 根据id 更新一个CommodityCategoryPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> updById(CommodityCategoryPo commodityCategory);


        /**
         * @Desc: 根据id 查找一个CommodityCategoryPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 CommodityCategoryPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<CommodityCategoryPo> selectById(Long id);


        /**
         * @Desc: 分页查找 CommodityCategoryPo 列表
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Page<CommodityCategoryListVo>>getList(PageDto pageDto, CommodityCategoryKeyDto keyDto);

}
