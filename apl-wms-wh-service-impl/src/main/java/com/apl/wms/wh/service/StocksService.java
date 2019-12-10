package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.StocksPo;
import com.apl.wms.wh.vo.StocksListVo;
import com.apl.wms.wh.dto.StocksKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 库存 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface StocksService extends IService<StocksPo> {

        /**
         * @Desc: 添加一个StocksPo实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Integer> add(StocksPo stocks);


        /**
         * @Desc: 根据id 更新一个StocksPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> updById(StocksPo stocks);


        /**
         * @Desc: 根据id 查找一个StocksPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 StocksPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<StocksPo> selectById(Long id);


        /**
         * @Desc: 分页查找 StocksPo 列表
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Page<StocksListVo>>getList(PageDto pageDto, StocksKeyDto keyDto);

}
