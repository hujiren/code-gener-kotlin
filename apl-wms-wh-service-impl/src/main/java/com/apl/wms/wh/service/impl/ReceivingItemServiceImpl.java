package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.ReceivingItemMapper;
import com.apl.wms.wh.service.ReceivingItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.ReceivingItemPo;
import com.apl.wms.wh.vo.ReceivingItemListVo;
import com.apl.wms.wh.vo.ReceivingItemInfoVo;
import com.apl.wms.wh.dto.ReceivingItemKeyDto;

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
public class ReceivingItemServiceImpl extends ServiceImpl<ReceivingItemMapper, ReceivingItemPo> implements ReceivingItemService {

    //状态code枚举
    /*enum ReceivingItemServiceCode {

        ;

        private String code;
        private String msg;

        ReceivingItemServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(ReceivingItemPo receivingItem){

        Integer flag = baseMapper.insert(receivingItem);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , receivingItem.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(ReceivingItemPo receivingItem){

        Integer flag = baseMapper.updateById(receivingItem);
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
    public ResultUtils<ReceivingItemInfoVo> selectById(Integer id){

        ReceivingItemInfoVo receivingItemInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, receivingItemInfoVo);
    }


    @Override
    public ResultUtils<Page<ReceivingItemListVo>> getList(PageDto pageDto, ReceivingItemKeyDto keyDto){

        Page<ReceivingItemListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<ReceivingItemListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
