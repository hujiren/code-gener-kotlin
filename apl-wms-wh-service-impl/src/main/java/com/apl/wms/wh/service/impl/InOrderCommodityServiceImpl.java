package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.InOrderCommodityMapper;
import com.apl.wms.wh.service.InOrderCommodityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.InOrderCommodityPo;
import com.apl.wms.wh.vo.InOrderCommodityListVo;
import com.apl.wms.wh.vo.InOrderCommodityInfoVo;
import com.apl.wms.wh.dto.InOrderCommodityKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 入库订单商品明细 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Service
@Slf4j
public class InOrderCommodityServiceImpl extends ServiceImpl<InOrderCommodityMapper, InOrderCommodityPo> implements InOrderCommodityService {

    //状态code枚举
    /*enum InOrderCommodityServiceCode {

        ;

        private String code;
        private String msg;

        InOrderCommodityServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(InOrderCommodityPo inOrderCommodity){

        Integer flag = baseMapper.insert(inOrderCommodity);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , inOrderCommodity.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(InOrderCommodityPo inOrderCommodity){

        Integer flag = baseMapper.updateById(inOrderCommodity);
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
    public ResultUtils<InOrderCommodityInfoVo> selectById(Integer id){

        InOrderCommodityInfoVo inOrderCommodityInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, inOrderCommodityInfoVo);
    }


    @Override
    public ResultUtils<Page<InOrderCommodityListVo>> getList(PageDto pageDto, InOrderCommodityKeyDto keyDto){

        Page<InOrderCommodityListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<InOrderCommodityListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
