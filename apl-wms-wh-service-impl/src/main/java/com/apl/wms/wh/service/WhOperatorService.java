package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.WhOperatorPo;
import com.apl.wms.wh.vo.WhOperatorListVo;
import com.apl.wms.wh.dto.WhOperatorKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 仓库操作员 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface WhOperatorService extends IService<WhOperatorPo> {

        /**
         * @Desc: 添加一个WhOperatorPo实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Integer> add(WhOperatorPo whOperator);


        /**
         * @Desc: 根据id 更新一个WhOperatorPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> updById(WhOperatorPo whOperator);


        /**
         * @Desc: 根据id 查找一个WhOperatorPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 WhOperatorPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<WhOperatorPo> selectById(Long id);


        /**
         * @Desc: 分页查找 WhOperatorPo 列表
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Page<WhOperatorListVo>>getList(PageDto pageDto, WhOperatorKeyDto keyDto);

}
