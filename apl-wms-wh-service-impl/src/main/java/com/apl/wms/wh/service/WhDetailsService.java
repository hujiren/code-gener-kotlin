package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.WhDetailsPo;
import com.apl.wms.wh.vo.WhDetailsListVo;
import com.apl.wms.wh.dto.WhDetailsKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 仓库详细 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface WhDetailsService extends IService<WhDetailsPo> {

        /**
         * @Desc: 添加一个WhDetailsPo实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Integer> add(WhDetailsPo whDetails);


        /**
         * @Desc: 根据id 更新一个WhDetailsPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> updById(WhDetailsPo whDetails);


        /**
         * @Desc: 根据id 查找一个WhDetailsPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 WhDetailsPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<WhDetailsPo> selectById(Long id);


        /**
         * @Desc: 分页查找 WhDetailsPo 列表
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Page<WhDetailsListVo>>getList(PageDto pageDto, WhDetailsKeyDto keyDto);

}
