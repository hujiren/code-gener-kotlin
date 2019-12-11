package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.OutOrderCommodityMapper;
import com.apl.wms.wh.service.OutOrderCommodityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.OutOrderCommodityPo;
import com.apl.wms.wh.vo.OutOrderCommodityListVo;
import com.apl.wms.wh.vo.OutOrderCommodityInfoVo;
import com.apl.wms.wh.dto.OutOrderCommodityKeyDto;

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
public class OutOrderCommodityServiceImpl extends ServiceImpl<OutOrderCommodityMapper, OutOrderCommodityPo> implements OutOrderCommodityService {

    //状态code枚举
    /*enum OutOrderCommodityServiceCode {

        ;

        private String code;
        private String msg;

        OutOrderCommodityServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(OutOrderCommodityPo outOrderCommodity){

        Integer flag = baseMapper.insert(outOrderCommodity);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , outOrderCommodity.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(OutOrderCommodityPo outOrderCommodity){

        Integer flag = baseMapper.updateById(outOrderCommodity);
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
    public ResultUtils<OutOrderCommodityInfoVo> selectById(Integer id){

        OutOrderCommodityInfoVo outOrderCommodityInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, outOrderCommodityInfoVo);
    }


    @Override
    public ResultUtils<Page<OutOrderCommodityListVo>> getList(PageDto pageDto, OutOrderCommodityKeyDto keyDto){

        Page<OutOrderCommodityListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<OutOrderCommodityListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
