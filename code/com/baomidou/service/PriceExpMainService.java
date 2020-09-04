package com.apl.lms.price.exp.manage.service;

import com.apl.lms.price.exp.pojo.po.PriceExpMainPo;
import com.apl.lms.price.exp.pojo.vo.PriceExpMainListVo;
import com.apl.lms.price.exp.pojo.vo.PriceExpMainInfoVo;
import com.apl.lms.price.exp.pojo.dto.PriceExpMainKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.lib.pojo.dto.PageDto;
import com.apl.lib.utils.ResultUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 *  service接口
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
public interface PriceExpMainService extends IService<PriceExpMainPo> {

        /**
         * @Desc: 添加一个PriceExpMainPo实体
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<Long> add(PriceExpMainAddDto priceExpMainAddDto);


        /**
         * @Desc: 根据id 更新一个PriceExpMainPo 实体
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<Boolean> updById(PriceExpMainUpdDto priceExpMainUpdDto);


        /**
         * @Desc: 根据id 查找一个PriceExpMainPo 实体
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 PriceExpMainPo 实体
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<PriceExpMainInfoVo> selectById(Long id);


        /**
         * @Desc: 分页查找 PriceExpMainPo 列表
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<Page<PriceExpMainListVo>>getList(PageDto pageDto, PriceExpMainKeyDto keyDto);

}