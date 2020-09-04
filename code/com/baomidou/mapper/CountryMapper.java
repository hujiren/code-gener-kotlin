package com.baomidou.mapper;

import com.apl.lms.common.pojo.po.CountryPo;
import com.apl.lms.common.pojo.vo.CountryListVo;
import com.apl.lms.common.pojo.vo.CountryInfoVo;
import com.apl.lms.common.pojo.dto.CountryKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 国家 Mapper 接口
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
public interface CountryMapper extends BaseMapper<CountryPo> {

/**
 * @Desc: 根据id 查找详情
 * @Author: ${cfg.author}
 * @Date: 2020-09-04
 */
public CountryInfoVo getById(@Param("id") Long id);

        /**
         * @Desc: 查找列表
         * @Author: ${cfg.author}
         * @Date: 2020-09-04
         */
        List<CountryListVo> getList(Page page, @Param("kd") CountryKeyDto keyDto);


}