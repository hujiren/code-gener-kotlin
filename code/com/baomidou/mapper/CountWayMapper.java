package com.apl.lms.common.mapper;

import com.apl.lms.common.pojo.po.CountWayPo;
import com.apl.lms.common.pojo.vo.CountWayListVo;
import com.apl.lms.common.pojo.vo.CountWayInfoVo;
import com.apl.lms.common.pojo.dto.CountWayKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 计件方式 Mapper 接口
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
@Repository
public interface CountWayMapper extends BaseMapper<CountWayPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2020-09-04
     */
    public CountWayInfoVo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2020-09-04
     */
    List<CountWayListVo> getList(Page page,@Param("key") CountWayKeyDto keyDto);


        }