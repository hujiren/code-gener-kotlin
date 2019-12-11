package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.StorePo;
import com.apl.wms.wh.vo.StoreListVo;
import com.apl.wms.wh.vo.StoreInfoVo;
import com.apl.wms.wh.dto.StoreKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 网店铺 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface StoreService extends IService<StorePo> {

        /**
         * @Desc: 添加一个StorePo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(StorePo store);


        /**
         * @Desc: 根据id 更新一个StorePo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(StorePo store);


        /**
         * @Desc: 根据id 查找一个StorePo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 StorePo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<StoreInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 StorePo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<StoreListVo>>getList(PageDto pageDto, StoreKeyDto keyDto);

}
