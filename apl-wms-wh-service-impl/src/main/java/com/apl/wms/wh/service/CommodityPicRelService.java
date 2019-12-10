package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.CommodityPicRelPo;
import com.apl.wms.wh.vo.CommodityPicRelListVo;
import com.apl.wms.wh.dto.CommodityPicRelKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 商品图片 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
public interface CommodityPicRelService extends IService<CommodityPicRelPo> {

        /**
         * @Desc: 添加一个CommodityPicRelPo实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Integer> add(CommodityPicRelPo commodityPicRel);


        /**
         * @Desc: 根据id 更新一个CommodityPicRelPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> updById(CommodityPicRelPo commodityPicRel);


        /**
         * @Desc: 根据id 查找一个CommodityPicRelPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 CommodityPicRelPo 实体
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<CommodityPicRelPo> selectById(Long id);


        /**
         * @Desc: 分页查找 CommodityPicRelPo 列表
         * @author cy
         * @since 2019-12-10
         */
        ResultUtils<Page<CommodityPicRelListVo>>getList(PageDto pageDto, CommodityPicRelKeyDto keyDto);

}
