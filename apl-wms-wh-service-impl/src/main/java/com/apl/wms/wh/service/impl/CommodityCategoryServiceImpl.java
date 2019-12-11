package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.CommodityCategoryMapper;
import com.apl.wms.wh.service.CommodityCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.CommodityCategoryPo;
import com.apl.wms.wh.vo.CommodityCategoryListVo;
import com.apl.wms.wh.vo.CommodityCategoryInfoVo;
import com.apl.wms.wh.dto.CommodityCategoryKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 商品种类 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Service
@Slf4j
public class CommodityCategoryServiceImpl extends ServiceImpl<CommodityCategoryMapper, CommodityCategoryPo> implements CommodityCategoryService {

    //状态code枚举
    /*enum CommodityCategoryServiceCode {

        ;

        private String code;
        private String msg;

        CommodityCategoryServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(CommodityCategoryPo commodityCategory){

        Integer flag = baseMapper.insert(commodityCategory);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , commodityCategory.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(CommodityCategoryPo commodityCategory){

        Integer flag = baseMapper.updateById(commodityCategory);
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
    public ResultUtils<CommodityCategoryInfoVo> selectById(Integer id){

        CommodityCategoryInfoVo commodityCategoryInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, commodityCategoryInfoVo);
    }


    @Override
    public ResultUtils<Page<CommodityCategoryListVo>> getList(PageDto pageDto, CommodityCategoryKeyDto keyDto){

        Page<CommodityCategoryListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<CommodityCategoryListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
