package com.apl.wms.order.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.order.mapper.InOrderMapper;
import com.apl.wms.order.service.InOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.order.po.InOrderPo;
import com.apl.wms.order.vo.InOrderListVo;
import com.apl.wms.order.vo.InOrderInfoVo;
import com.apl.wms.order.dto.InOrderKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 入库订单 service实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
@Service
@Slf4j
public class InOrderServiceImpl extends ServiceImpl<InOrderMapper, InOrderPo> implements InOrderService {

    //状态code枚举
    /*enum InOrderServiceCode {

        ;

        private String code;
        private String msg;

        InOrderServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(InOrderPo inOrder){


        Integer flag = baseMapper.insert(inOrder);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , inOrder.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(InOrderPo inOrder){


        Integer flag = baseMapper.updateById(inOrder);
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
    public ResultUtils<InOrderInfoVo> selectById(Long id){

        InOrderInfoVo inOrderInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, inOrderInfoVo);
    }


    @Override
    public ResultUtils<Page<InOrderListVo>> getList(PageDto pageDto, InOrderKeyDto keyDto){

        Page<InOrderListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<InOrderListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }


}
