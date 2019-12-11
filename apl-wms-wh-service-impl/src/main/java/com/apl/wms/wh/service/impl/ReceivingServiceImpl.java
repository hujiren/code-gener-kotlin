package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.ReceivingMapper;
import com.apl.wms.wh.service.ReceivingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.ReceivingPo;
import com.apl.wms.wh.vo.ReceivingListVo;
import com.apl.wms.wh.vo.ReceivingInfoVo;
import com.apl.wms.wh.dto.ReceivingKeyDto;

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
public class ReceivingServiceImpl extends ServiceImpl<ReceivingMapper, ReceivingPo> implements ReceivingService {

    //状态code枚举
    /*enum ReceivingServiceCode {

        ;

        private String code;
        private String msg;

        ReceivingServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(ReceivingPo receiving){

        Integer flag = baseMapper.insert(receiving);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , receiving.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(ReceivingPo receiving){

        Integer flag = baseMapper.updateById(receiving);
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
    public ResultUtils<ReceivingInfoVo> selectById(Integer id){

        ReceivingInfoVo receivingInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, receivingInfoVo);
    }


    @Override
    public ResultUtils<Page<ReceivingListVo>> getList(PageDto pageDto, ReceivingKeyDto keyDto){

        Page<ReceivingListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<ReceivingListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
