package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.WhZonePo;
import com.apl.wms.wh.vo.WhZoneListVo;
import com.apl.wms.wh.dto.WhZoneKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 仓库分区 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface WhZoneService extends IService<WhZonePo> {

        /**
         * @Desc: 添加一个WhZonePo实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Integer> add(WhZonePo whZone);


        /**
         * @Desc: 根据id 更新一个WhZonePo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> updById(WhZonePo whZone);


        /**
         * @Desc: 根据id 查找一个WhZonePo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 WhZonePo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<WhZonePo> selectById(Long id);


        /**
         * @Desc: 分页查找 WhZonePo 列表
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Page<WhZoneListVo>>getList(PageDto pageDto, WhZoneKeyDto keyDto);

}
