package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.StorageLocationPo;
import com.apl.wms.wh.vo.StorageLocationListVo;
import com.apl.wms.wh.dto.StorageLocationKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 库位 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface StorageLocationService extends IService<StorageLocationPo> {

        /**
         * @Desc: 添加一个StorageLocationPo实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Integer> add(StorageLocationPo storageLocation);


        /**
         * @Desc: 根据id 更新一个StorageLocationPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> updById(StorageLocationPo storageLocation);


        /**
         * @Desc: 根据id 查找一个StorageLocationPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 StorageLocationPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<StorageLocationPo> selectById(Long id);


        /**
         * @Desc: 分页查找 StorageLocationPo 列表
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Page<StorageLocationListVo>>getList(PageDto pageDto, StorageLocationKeyDto keyDto);

}
