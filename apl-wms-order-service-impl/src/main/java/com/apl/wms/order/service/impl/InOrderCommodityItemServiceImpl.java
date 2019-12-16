package com.apl.wms.order.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.order.mapper.InOrderCommodityItemMapper;
import com.apl.wms.order.service.InOrderCommodityItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.order.po.InOrderCommodityItemPo;
import com.apl.wms.order.vo.InOrderCommodityItemListVo;
import com.apl.wms.order.vo.InOrderCommodityItemInfoVo;
import com.apl.wms.order.dto.InOrderCommodityItemKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 入库订单商品明细 service实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
@Service
@Slf4j
public class InOrderCommodityItemServiceImpl extends ServiceImpl<InOrderCommodityItemMapper, InOrderCommodityItemPo> implements InOrderCommodityItemService {

    //状态code枚举
    /*enum InOrderCommodityItemServiceCode {

        ;

        private String code;
        private String msg;

        InOrderCommodityItemServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(InOrderCommodityItemPo inOrderCommodityItem){


        Integer flag = baseMapper.insert(inOrderCommodityItem);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , inOrderCommodityItem.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(InOrderCommodityItemPo inOrderCommodityItem){


        Integer flag = baseMapper.updateById(inOrderCommodityItem);
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
    public ResultUtils<InOrderCommodityItemInfoVo> selectById(Long id){

        InOrderCommodityItemInfoVo inOrderCommodityItemInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, inOrderCommodityItemInfoVo);
    }


    @Override
    public ResultUtils<Page<InOrderCommodityItemListVo>> getList(PageDto pageDto, InOrderCommodityItemKeyDto keyDto){

        Page<InOrderCommodityItemListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<InOrderCommodityItemListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }


}
