package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.StorageCommodityPo;
import com.apl.wms.wh.vo.StorageCommodityListVo;
import com.apl.wms.wh.dto.StorageCommodityKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 库位储存商品数量 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface StorageCommodityService extends IService<StorageCommodityPo> {

        /**
         * @Desc: 添加一个StorageCommodityPo实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Integer> add(StorageCommodityPo storageCommodity);


        /**
         * @Desc: 根据id 更新一个StorageCommodityPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> updById(StorageCommodityPo storageCommodity);


        /**
         * @Desc: 根据id 查找一个StorageCommodityPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 StorageCommodityPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<StorageCommodityPo> selectById(Long id);


        /**
         * @Desc: 分页查找 StorageCommodityPo 列表
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Page<StorageCommodityListVo>>getList(PageDto pageDto, StorageCommodityKeyDto keyDto);

}
