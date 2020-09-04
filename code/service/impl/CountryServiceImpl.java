package service.impl;
import com.apl.lib.pojo.dto.PageDto;
import com.apl.lib.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.lib.constants.CommonStatusCode;

import mapper.CountryMapper;
import service.CountryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.lms.common.pojo.po.po.CountryPo;
import com.apl.lms.common.pojo.po.vo.CountryListVo;
import com.apl.lms.common.pojo.po.vo.CountryInfoVo;
import com.apl.lms.common.pojo.po.dto.CountryKeyDto;

import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 国家 service实现类
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
@Service
@Slf4j
public class CountryServiceImpl extends ServiceImpl<CountryMapper, CountryPo> implements CountryService {

    //状态code枚举
    /*enum CountryServiceCode {

            ;

            private String code;
            private String msg;

            CountryServiceCode(String code, String msg) {
                 this.code = code;
                 this.msg = msg;
            }
        }*/


    @Override
    public ResultUtils<Integer> add(CountryPo country){


        Integer flag = baseMapper.insert(country);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , country.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(CountryPo country){


        Integer flag = baseMapper.updateById(country);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , true);
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , false);
    }


    @Override
    public ResultUtils<Boolean> delById(Long id){

        boolean flag = removeById(id);
        if(flag){
            return ResultUtils.APPRESULT(CommonStatusCode.DEL_SUCCESS , true);
        }

        return ResultUtils.APPRESULT(CommonStatusCode.DEL_FAIL , false);
    }


    @Override
    public ResultUtils<CountryInfoVo> selectById(Long id){

        CountryInfoVo countryInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, countryInfoVo);
    }


    @Override
    public ResultUtils<Page<CountryListVo>> getList(PageDto pageDto, CountryKeyDto keyDto){

        Page<CountryListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<CountryListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS , page);
    }


}