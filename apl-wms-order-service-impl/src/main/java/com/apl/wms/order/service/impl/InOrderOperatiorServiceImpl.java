package com.apl.wms.order.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.order.mapper.InOrderOperatiorMapper;
import com.apl.wms.order.service.InOrderOperatiorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.order.po.InOrderOperatiorPo;
import com.apl.wms.order.vo.InOrderOperatiorListVo;
import com.apl.wms.order.vo.InOrderOperatiorInfoVo;
import com.apl.wms.order.dto.InOrderOperatiorKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 入库订单操作 service实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
@Service
@Slf4j
public class InOrderOperatiorServiceImpl extends ServiceImpl<InOrderOperatiorMapper, InOrderOperatiorPo> implements InOrderOperatiorService {

    //状态code枚举
    /*enum InOrderOperatiorServiceCode {

        ;

        private String code;
        private String msg;

        InOrderOperatiorServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(InOrderOperatiorPo inOrderOperatior){


        Integer flag = baseMapper.insert(inOrderOperatior);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , inOrderOperatior.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(InOrderOperatiorPo inOrderOperatior){


        Integer flag = baseMapper.updateById(inOrderOperatior);
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
    public ResultUtils<InOrderOperatiorInfoVo> selectById(Long id){

        InOrderOperatiorInfoVo inOrderOperatiorInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, inOrderOperatiorInfoVo);
    }


    @Override
    public ResultUtils<Page<InOrderOperatiorListVo>> getList(PageDto pageDto, InOrderOperatiorKeyDto keyDto){

        Page<InOrderOperatiorListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<InOrderOperatiorListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }


}
