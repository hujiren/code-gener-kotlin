package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.InOrderDetailsPo;
import com.apl.wms.wh.vo.InOrderDetailsListVo;
import com.apl.wms.wh.vo.InOrderDetailsInfoVo;
import com.apl.wms.wh.dto.InOrderDetailsKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 入库订单其他信息 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface InOrderDetailsService extends IService<InOrderDetailsPo> {

        /**
         * @Desc: 添加一个InOrderDetailsPo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(InOrderDetailsPo inOrderDetails);


        /**
         * @Desc: 根据id 更新一个InOrderDetailsPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(InOrderDetailsPo inOrderDetails);


        /**
         * @Desc: 根据id 查找一个InOrderDetailsPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 InOrderDetailsPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<InOrderDetailsInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 InOrderDetailsPo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<InOrderDetailsListVo>>getList(PageDto pageDto, InOrderDetailsKeyDto keyDto);

}
