package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.CommodityPicRelMapper;
import com.apl.wms.wh.service.CommodityPicRelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.CommodityPicRelPo;
import com.apl.wms.wh.vo.CommodityPicRelListVo;
import com.apl.wms.wh.dto.CommodityPicRelKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 商品图片 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Service
@Slf4j
public class CommodityPicRelServiceImpl extends ServiceImpl<CommodityPicRelMapper, CommodityPicRelPo> implements CommodityPicRelService {

    //状态code枚举
    /*enum CommodityPicRelServiceCode {

        ;

        private String code;
        private String msg;

        CommodityPicRelServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(CommodityPicRelPo commodityPicRel){

        Integer flag = baseMapper.insert(commodityPicRel);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , commodityPicRel.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(CommodityPicRelPo commodityPicRel){

        Integer flag = baseMapper.updateById(commodityPicRel);
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
    public ResultUtils<CommodityPicRelPo> selectById(Long id){

        CommodityPicRelPo commodityPicRel = getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, commodityPicRel);
    }


    @Override
    public ResultUtils<Page<CommodityPicRelListVo>> getList(PageDto pageDto, CommodityPicRelKeyDto keyDto){

        Page<CommodityPicRelListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<CommodityPicRelListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
