package com.apl.lms.price.exp.manage.mapper;

import com.apl.lms.price.exp.pojo.po.PriceExpMainPo;
import com.apl.lms.price.exp.pojo.vo.PriceExpMainListVo;
import com.apl.lms.price.exp.pojo.vo.PriceExpMainInfoVo;
import com.apl.lms.price.exp.pojo.dto.PriceExpMainKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
@Repository
public interface PriceExpMainMapper extends BaseMapper<PriceExpMainPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2020-09-04
     */
    public PriceExpMainInfoVo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2020-09-04
     */
    List<PriceExpMainListVo> getList(Page page,@Param("key") PriceExpMainKeyDto keyDto);


        }