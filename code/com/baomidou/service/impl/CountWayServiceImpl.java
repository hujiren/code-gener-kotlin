package com.apl.lms.common.service.impl;

import com.apl.lib.pojo.dto.PageDto;
import com.apl.lib.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.lib.constants.CommonStatusCode;

import com.baomidou.mapper.CountWayMapper;
import com.baomidou.service.CountWayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.lms.common.pojo.po.CountWayPo;
import com.apl.lms.common.pojo.vo.CountWayListVo;
import com.apl.lms.common.pojo.vo.CountWayInfoVo;
import com.apl.lms.common.pojo.dto.CountWayKeyDto;

import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 计件方式 service实现类
 * </p>
 *
 * @author hjr
 * @since 2020-09-04
 */
@Service
@Slf4j
public class CountWayServiceImpl extends ServiceImpl<CountWayMapper, CountWayPo> implements CountWayService {

    //状态code枚举
    /*enum CountWayServiceCode {

            ;

            private String code;
            private String msg;

            CountWayServiceCode(String code, String msg) {
                 this.code = code;
                 this.msg = msg;
            }
        }*/


    @Override
    public ResultUtils<Long> add(CountWayAddDto countWayAddDto){


        CountWayPo countWayPo = new CountWayPo();
        BeanUtil.copyProperties(countWayAddDto, countWayPo);

        Integer flag = baseMapper.insert(countWayPo);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , countWayPo.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(CountWayUpdDto countWayUpdDto){


        CountWayPo countWayPo = new CountWayPo();
        BeanUtil.copyProperties(countWayUpdDto, countWayPo);

        Integer flag = baseMapper.updateById(countWayPo);
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
    public ResultUtils<CountWayInfoVo> selectById(Long id){

        CountWayInfoVo countWayInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, countWayInfoVo);
    }


    @Override
    public ResultUtils<Page<CountWayListVo>> getList(PageDto pageDto, CountWayKeyDto keyDto){

        Page<CountWayListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<CountWayListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS , page);
    }


}