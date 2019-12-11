package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.InOrderServiceMapper;
import com.apl.wms.wh.service.InOrderServiceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.InOrderServicePo;
import com.apl.wms.wh.vo.InOrderServiceListVo;
import com.apl.wms.wh.vo.InOrderServiceInfoVo;
import com.apl.wms.wh.dto.InOrderServiceKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 入库订单服务 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Service
@Slf4j
public class InOrderServiceServiceImpl extends ServiceImpl<InOrderServiceMapper, InOrderServicePo> implements InOrderServiceService {

    //状态code枚举
    /*enum InOrderServiceServiceCode {

        ;

        private String code;
        private String msg;

        InOrderServiceServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(InOrderServicePo inOrderService){

        Integer flag = baseMapper.insert(inOrderService);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , inOrderService.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(InOrderServicePo inOrderService){

        Integer flag = baseMapper.updateById(inOrderService);
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
    public ResultUtils<InOrderServiceInfoVo> selectById(Integer id){

        InOrderServiceInfoVo inOrderServiceInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, inOrderServiceInfoVo);
    }


    @Override
    public ResultUtils<Page<InOrderServiceListVo>> getList(PageDto pageDto, InOrderServiceKeyDto keyDto){

        Page<InOrderServiceListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<InOrderServiceListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
