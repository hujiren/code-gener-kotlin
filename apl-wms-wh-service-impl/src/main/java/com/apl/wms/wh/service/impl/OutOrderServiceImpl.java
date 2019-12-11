package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.OutOrderMapper;
import com.apl.wms.wh.service.OutOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.OutOrderPo;
import com.apl.wms.wh.vo.OutOrderListVo;
import com.apl.wms.wh.vo.OutOrderInfoVo;
import com.apl.wms.wh.dto.OutOrderKeyDto;

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
public class OutOrderServiceImpl extends ServiceImpl<OutOrderMapper, OutOrderPo> implements OutOrderService {

    //状态code枚举
    /*enum OutOrderServiceCode {

        ;

        private String code;
        private String msg;

        OutOrderServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(OutOrderPo outOrder){

        Integer flag = baseMapper.insert(outOrder);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , outOrder.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(OutOrderPo outOrder){

        Integer flag = baseMapper.updateById(outOrder);
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
    public ResultUtils<OutOrderInfoVo> selectById(Integer id){

        OutOrderInfoVo outOrderInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, outOrderInfoVo);
    }


    @Override
    public ResultUtils<Page<OutOrderListVo>> getList(PageDto pageDto, OutOrderKeyDto keyDto){

        Page<OutOrderListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<OutOrderListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
