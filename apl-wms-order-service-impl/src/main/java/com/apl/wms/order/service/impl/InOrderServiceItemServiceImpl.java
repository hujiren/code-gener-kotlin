package com.apl.wms.order.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.order.mapper.InOrderServiceItemMapper;
import com.apl.wms.order.service.InOrderServiceItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.order.po.InOrderServiceItemPo;
import com.apl.wms.order.vo.InOrderServiceItemListVo;
import com.apl.wms.order.vo.InOrderServiceItemInfoVo;
import com.apl.wms.order.dto.InOrderServiceItemKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 入库订单服务 service实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
@Service
@Slf4j
public class InOrderServiceItemServiceImpl extends ServiceImpl<InOrderServiceItemMapper, InOrderServiceItemPo> implements InOrderServiceItemService {

    //状态code枚举
    /*enum InOrderServiceItemServiceCode {

        ;

        private String code;
        private String msg;

        InOrderServiceItemServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(InOrderServiceItemPo inOrderServiceItem){


        Integer flag = baseMapper.insert(inOrderServiceItem);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , inOrderServiceItem.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(InOrderServiceItemPo inOrderServiceItem){


        Integer flag = baseMapper.updateById(inOrderServiceItem);
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
    public ResultUtils<InOrderServiceItemInfoVo> selectById(Long id){

        InOrderServiceItemInfoVo inOrderServiceItemInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, inOrderServiceItemInfoVo);
    }


    @Override
    public ResultUtils<Page<InOrderServiceItemListVo>> getList(PageDto pageDto, InOrderServiceItemKeyDto keyDto){

        Page<InOrderServiceItemListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<InOrderServiceItemListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }


}
