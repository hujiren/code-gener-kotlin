package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.InOrderOperMapper;
import com.apl.wms.wh.service.InOrderOperService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.InOrderOperPo;
import com.apl.wms.wh.vo.InOrderOperListVo;
import com.apl.wms.wh.vo.InOrderOperInfoVo;
import com.apl.wms.wh.dto.InOrderOperKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 入库订单操作 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Service
@Slf4j
public class InOrderOperServiceImpl extends ServiceImpl<InOrderOperMapper, InOrderOperPo> implements InOrderOperService {

    //状态code枚举
    /*enum InOrderOperServiceCode {

        ;

        private String code;
        private String msg;

        InOrderOperServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(InOrderOperPo inOrderOper){

        Integer flag = baseMapper.insert(inOrderOper);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , inOrderOper.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(InOrderOperPo inOrderOper){

        Integer flag = baseMapper.updateById(inOrderOper);
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
    public ResultUtils<InOrderOperInfoVo> selectById(Integer id){

        InOrderOperInfoVo inOrderOperInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, inOrderOperInfoVo);
    }


    @Override
    public ResultUtils<Page<InOrderOperListVo>> getList(PageDto pageDto, InOrderOperKeyDto keyDto){

        Page<InOrderOperListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<InOrderOperListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
