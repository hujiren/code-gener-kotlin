package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.WarehousePo;
import com.apl.wms.wh.vo.WarehouseListVo;
import com.apl.wms.wh.dto.WarehouseKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 仓库 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface WarehouseService extends IService<WarehousePo> {

        /**
         * @Desc: 添加一个WarehousePo实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Integer> add(WarehousePo warehouse);


        /**
         * @Desc: 根据id 更新一个WarehousePo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> updById(WarehousePo warehouse);


        /**
         * @Desc: 根据id 查找一个WarehousePo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 WarehousePo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<WarehousePo> selectById(Long id);


        /**
         * @Desc: 分页查找 WarehousePo 列表
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Page<WarehouseListVo>>getList(PageDto pageDto, WarehouseKeyDto keyDto);

}
