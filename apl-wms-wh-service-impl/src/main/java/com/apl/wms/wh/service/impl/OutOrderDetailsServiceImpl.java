package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.OutOrderDetailsMapper;
import com.apl.wms.wh.service.OutOrderDetailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.OutOrderDetailsPo;
import com.apl.wms.wh.vo.OutOrderDetailsListVo;
import com.apl.wms.wh.vo.OutOrderDetailsInfoVo;
import com.apl.wms.wh.dto.OutOrderDetailsKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Service
@Slf4j
public class OutOrderDetailsServiceImpl extends ServiceImpl<OutOrderDetailsMapper, OutOrderDetailsPo> implements OutOrderDetailsService {

    //状态code枚举
    /*enum OutOrderDetailsServiceCode {

        ;

        private String code;
        private String msg;

        OutOrderDetailsServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(OutOrderDetailsPo outOrderDetails){

        Integer flag = baseMapper.insert(outOrderDetails);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , outOrderDetails.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(OutOrderDetailsPo outOrderDetails){

        Integer flag = baseMapper.updateById(outOrderDetails);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , true);
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , false);
    }


    @Override
    public ResultUtils<Boolean> delById(Integer id){

        boolean flag = removeById(id);
        if(flag){
            return ResultUtils.APPRESULT(CommonStatusCode.DEL_SUCCESS , true);
        }

        return ResultUtils.APPRESULT(CommonStatusCode.DEL_FAIL , false);
    }


    @Override
    public ResultUtils<OutOrderDetailsInfoVo> selectById(Integer id){

        OutOrderDetailsInfoVo outOrderDetailsInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, outOrderDetailsInfoVo);
    }


    @Override
    public ResultUtils<Page<OutOrderDetailsListVo>> getList(PageDto pageDto, OutOrderDetailsKeyDto keyDto){

        Page<OutOrderDetailsListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<OutOrderDetailsListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
