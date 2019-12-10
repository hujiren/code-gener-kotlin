package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.WhShelvesPo;
import com.apl.wms.wh.vo.WhShelvesListVo;
import com.apl.wms.wh.dto.WhShelvesKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 货架 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface WhShelvesService extends IService<WhShelvesPo> {

        /**
         * @Desc: 添加一个WhShelvesPo实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Integer> add(WhShelvesPo whShelves);


        /**
         * @Desc: 根据id 更新一个WhShelvesPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> updById(WhShelvesPo whShelves);


        /**
         * @Desc: 根据id 查找一个WhShelvesPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 WhShelvesPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<WhShelvesPo> selectById(Long id);


        /**
         * @Desc: 分页查找 WhShelvesPo 列表
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Page<WhShelvesListVo>>getList(PageDto pageDto, WhShelvesKeyDto keyDto);

}
