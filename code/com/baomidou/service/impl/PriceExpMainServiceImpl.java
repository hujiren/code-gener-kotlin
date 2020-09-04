package com.apl.lms.price.exp.manage.service.impl;

import com.apl.lib.pojo.dto.PageDto;
import com.apl.lib.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.lib.constants.CommonStatusCode;

import com.baomidou.mapper.PriceExpMainMapper;
import com.baomidou.service.PriceExpMainService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.lms.price.exp.pojo.po.PriceExpMainPo;
import com.apl.lms.price.exp.pojo.vo.PriceExpMainListVo;
import com.apl.lms.price.exp.pojo.vo.PriceExpMainInfoVo;
import com.apl.lms.price.exp.pojo.dto.PriceExpMainKeyDto;

import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 *  service实现类
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
@Service
@Slf4j
public class PriceExpMainServiceImpl extends ServiceImpl<PriceExpMainMapper, PriceExpMainPo> implements PriceExpMainService {

    //状态code枚举
    /*enum PriceExpMainServiceCode {

            ;

            private String code;
            private String msg;

            PriceExpMainServiceCode(String code, String msg) {
                 this.code = code;
                 this.msg = msg;
            }
        }*/


    @Override
    public ResultUtils<Long> add(PriceExpMainAddDto priceExpMainAddDto){


        PriceExpMainPo priceExpMainPo = new PriceExpMainPo();
        BeanUtil.copyProperties(priceExpMainAddDto, priceExpMainPo);

        Integer flag = baseMapper.insert(priceExpMainPo);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , priceExpMainPo.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(PriceExpMainUpdDto priceExpMainUpdDto){


        PriceExpMainPo priceExpMainPo = new PriceExpMainPo();
        BeanUtil.copyProperties(priceExpMainUpdDto, priceExpMainPo);

        Integer flag = baseMapper.updateById(priceExpMainPo);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , true);
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , false);
    }


    @Override
    public ResultUtils<Boolean> delById(Long id){

        Integer flag = baseMapper.deleteById(id);
        if(flag > 0){
            return ResultUtils.APPRESULT(CommonStatusCode.DEL_SUCCESS , true);
        }

        return ResultUtils.APPRESULT(CommonStatusCode.DEL_FAIL , false);
    }


    @Override
    public ResultUtils<PriceExpMainInfoVo> selectById(Long id){

        PriceExpMainInfoVo priceExpMainInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, priceExpMainInfoVo);
    }


    @Override
    public ResultUtils<Page<PriceExpMainListVo>> getList(PageDto pageDto, PriceExpMainKeyDto keyDto){

        Page<PriceExpMainListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<PriceExpMainListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS , page);
    }


}