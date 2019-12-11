package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.InOrderOperPo;
import com.apl.wms.wh.vo.InOrderOperListVo;
import com.apl.wms.wh.vo.InOrderOperInfoVo;
import com.apl.wms.wh.dto.InOrderOperKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 入库订单操作 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface InOrderOperService extends IService<InOrderOperPo> {

        /**
         * @Desc: 添加一个InOrderOperPo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(InOrderOperPo inOrderOper);


        /**
         * @Desc: 根据id 更新一个InOrderOperPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(InOrderOperPo inOrderOper);


        /**
         * @Desc: 根据id 查找一个InOrderOperPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 InOrderOperPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<InOrderOperInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 InOrderOperPo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<InOrderOperListVo>>getList(PageDto pageDto, InOrderOperKeyDto keyDto);

}
