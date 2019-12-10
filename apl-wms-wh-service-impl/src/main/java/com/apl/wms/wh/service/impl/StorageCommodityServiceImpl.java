package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.StorageCommodityMapper;
import com.apl.wms.wh.service.StorageCommodityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.StorageCommodityPo;
import com.apl.wms.wh.vo.StorageCommodityListVo;
import com.apl.wms.wh.dto.StorageCommodityKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 库位储存商品数量 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Service
@Slf4j
public class StorageCommodityServiceImpl extends ServiceImpl<StorageCommodityMapper, StorageCommodityPo> implements StorageCommodityService {

    //状态code枚举
    /*enum StorageCommodityServiceCode {

        ;

        private String code;
        private String msg;

        StorageCommodityServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(StorageCommodityPo storageCommodity){

        Integer flag = baseMapper.insert(storageCommodity);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , storageCommodity.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(StorageCommodityPo storageCommodity){

        Integer flag = baseMapper.updateById(storageCommodity);
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
    public ResultUtils<StorageCommodityPo> selectById(Long id){

        StorageCommodityPo storageCommodity = getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, storageCommodity);
    }


    @Override
    public ResultUtils<Page<StorageCommodityListVo>> getList(PageDto pageDto, StorageCommodityKeyDto keyDto){

        Page<StorageCommodityListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<StorageCommodityListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
