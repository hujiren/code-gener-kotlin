package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.OutOrderDetailsPo;
import com.apl.wms.wh.vo.OutOrderDetailsListVo;
import com.apl.wms.wh.vo.OutOrderDetailsInfoVo;
import com.apl.wms.wh.dto.OutOrderDetailsKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface OutOrderDetailsService extends IService<OutOrderDetailsPo> {

        /**
         * @Desc: 添加一个OutOrderDetailsPo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(OutOrderDetailsPo outOrderDetails);


        /**
         * @Desc: 根据id 更新一个OutOrderDetailsPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(OutOrderDetailsPo outOrderDetails);


        /**
         * @Desc: 根据id 查找一个OutOrderDetailsPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 OutOrderDetailsPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<OutOrderDetailsInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 OutOrderDetailsPo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<OutOrderDetailsListVo>>getList(PageDto pageDto, OutOrderDetailsKeyDto keyDto);

}
