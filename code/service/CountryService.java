package service;

import com.apl.lms.common.pojo.po.po.CountryPo;
import com.apl.lms.common.pojo.po.vo.CountryListVo;
import com.apl.lms.common.pojo.po.vo.CountryInfoVo;
import com.apl.lms.common.pojo.po.dto.CountryKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.lib.pojo.dto.PageDto;
import com.apl.lib.utils.ResultUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 国家 service接口
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
public interface CountryService extends IService<CountryPo> {

        /**
         * @Desc: 添加一个CountryPo实体
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<Integer> add(CountryPo country);


        /**
         * @Desc: 根据id 更新一个CountryPo 实体
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<Boolean> updById(CountryPo country);


        /**
         * @Desc: 根据id 查找一个CountryPo 实体
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<Boolean> delById(Long id);


        /**
         * @Desc: 根据id 查找一个 CountryPo 实体
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<CountryInfoVo> selectById(Long id);


        /**
         * @Desc: 分页查找 CountryPo 列表
         * @author hjr
         * @since 2020-09-04
         */
        ResultUtils<Page<CountryListVo>>getList(PageDto pageDto, CountryKeyDto keyDto);

}