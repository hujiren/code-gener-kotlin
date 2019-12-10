package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.WhDetailsMapper;
import com.apl.wms.wh.service.WhDetailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.WhDetailsPo;
import com.apl.wms.wh.vo.WhDetailsListVo;
import com.apl.wms.wh.dto.WhDetailsKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 仓库详细 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Service
@Slf4j
public class WhDetailsServiceImpl extends ServiceImpl<WhDetailsMapper, WhDetailsPo> implements WhDetailsService {

    //状态code枚举
    /*enum WhDetailsServiceCode {

        ;

        private String code;
        private String msg;

        WhDetailsServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(WhDetailsPo whDetails){

        Integer flag = baseMapper.insert(whDetails);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , whDetails.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(WhDetailsPo whDetails){

        Integer flag = baseMapper.updateById(whDetails);
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
    public ResultUtils<WhDetailsPo> selectById(Long id){

        WhDetailsPo whDetails = getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, whDetails);
    }


    @Override
    public ResultUtils<Page<WhDetailsListVo>> getList(PageDto pageDto, WhDetailsKeyDto keyDto){

        Page<WhDetailsListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<WhDetailsListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
