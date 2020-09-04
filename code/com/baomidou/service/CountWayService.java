package com.apl.lms.common.service;

import com.apl.lms.common.pojo.po.CountWayPo;
import com.apl.lms.common.pojo.vo.CountWayListVo;
import com.apl.lms.common.pojo.vo.CountWayInfoVo;
import com.apl.lms.common.pojo.dto.CountWayKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.lib.pojo.dto.PageDto;
import com.apl.lib.utils.ResultUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 计件方式 service接口
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
public interface CountWayService extends IService<CountWayPo> {

        /**
         * @Desc: 添加一个CountWayPo实体
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<Long> add(CountWayAddDto countWayAddDto);


        /**
         * @Desc: 根据id 更新一个CountWayPo 实体
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<Boolean> updById(CountWayUpdDto countWayUpdDto);


        /**
         * @Desc: 根据id 查找一个CountWayPo 实体
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 CountWayPo 实体
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<CountWayInfoVo> selectById(Long id);


        /**
         * @Desc: 分页查找 CountWayPo 列表
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<Page<CountWayListVo>>getList(PageDto pageDto, CountWayKeyDto keyDto);

}