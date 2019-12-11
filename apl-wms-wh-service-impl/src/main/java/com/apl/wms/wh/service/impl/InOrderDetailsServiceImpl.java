package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.InOrderDetailsMapper;
import com.apl.wms.wh.service.InOrderDetailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.InOrderDetailsPo;
import com.apl.wms.wh.vo.InOrderDetailsListVo;
import com.apl.wms.wh.vo.InOrderDetailsInfoVo;
import com.apl.wms.wh.dto.InOrderDetailsKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 入库订单其他信息 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Service
@Slf4j
public class InOrderDetailsServiceImpl extends ServiceImpl<InOrderDetailsMapper, InOrderDetailsPo> implements InOrderDetailsService {

    //状态code枚举
    /*enum InOrderDetailsServiceCode {

        ;

        private String code;
        private String msg;

        InOrderDetailsServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(InOrderDetailsPo inOrderDetails){

        Integer flag = baseMapper.insert(inOrderDetails);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , inOrderDetails.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(InOrderDetailsPo inOrderDetails){

        Integer flag = baseMapper.updateById(inOrderDetails);
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
    public ResultUtils<InOrderDetailsInfoVo> selectById(Integer id){

        InOrderDetailsInfoVo inOrderDetailsInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, inOrderDetailsInfoVo);
    }


    @Override
    public ResultUtils<Page<InOrderDetailsListVo>> getList(PageDto pageDto, InOrderDetailsKeyDto keyDto){

        Page<InOrderDetailsListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<InOrderDetailsListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
