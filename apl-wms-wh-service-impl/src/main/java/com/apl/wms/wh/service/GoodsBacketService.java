package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.GoodsBacketPo;
import com.apl.wms.wh.vo.GoodsBacketListVo;
import com.apl.wms.wh.dto.GoodsBacketKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 货蓝 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface GoodsBacketService extends IService<GoodsBacketPo> {

        /**
         * @Desc: 添加一个GoodsBacketPo实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Integer> add(GoodsBacketPo goodsBacket);


        /**
         * @Desc: 根据id 更新一个GoodsBacketPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> updById(GoodsBacketPo goodsBacket);


        /**
         * @Desc: 根据id 查找一个GoodsBacketPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 GoodsBacketPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<GoodsBacketPo> selectById(Long id);


        /**
         * @Desc: 分页查找 GoodsBacketPo 列表
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Page<GoodsBacketListVo>>getList(PageDto pageDto, GoodsBacketKeyDto keyDto);

}
