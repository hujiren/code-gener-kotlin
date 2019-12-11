package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.CommodityBrandMapper;
import com.apl.wms.wh.service.CommodityBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.CommodityBrandPo;
import com.apl.wms.wh.vo.CommodityBrandListVo;
import com.apl.wms.wh.vo.CommodityBrandInfoVo;
import com.apl.wms.wh.dto.CommodityBrandKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 商品品牌 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Service
@Slf4j
public class CommodityBrandServiceImpl extends ServiceImpl<CommodityBrandMapper, CommodityBrandPo> implements CommodityBrandService {

    //状态code枚举
    /*enum CommodityBrandServiceCode {

        ;

        private String code;
        private String msg;

        CommodityBrandServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(CommodityBrandPo commodityBrand){

        Integer flag = baseMapper.insert(commodityBrand);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , commodityBrand.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(CommodityBrandPo commodityBrand){

        Integer flag = baseMapper.updateById(commodityBrand);
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
    public ResultUtils<CommodityBrandInfoVo> selectById(Integer id){

        CommodityBrandInfoVo commodityBrandInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, commodityBrandInfoVo);
    }


    @Override
    public ResultUtils<Page<CommodityBrandListVo>> getList(PageDto pageDto, CommodityBrandKeyDto keyDto){

        Page<CommodityBrandListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<CommodityBrandListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
