package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.StorageLocationMapper;
import com.apl.wms.wh.service.StorageLocationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.StorageLocationPo;
import com.apl.wms.wh.vo.StorageLocationListVo;
import com.apl.wms.wh.vo.StorageLocationInfoVo;
import com.apl.wms.wh.dto.StorageLocationKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 库位 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Service
@Slf4j
public class StorageLocationServiceImpl extends ServiceImpl<StorageLocationMapper, StorageLocationPo> implements StorageLocationService {

    //状态code枚举
    /*enum StorageLocationServiceCode {

        ;

        private String code;
        private String msg;

        StorageLocationServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(StorageLocationPo storageLocation){

        Integer flag = baseMapper.insert(storageLocation);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , storageLocation.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(StorageLocationPo storageLocation){

        Integer flag = baseMapper.updateById(storageLocation);
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
    public ResultUtils<StorageLocationInfoVo> selectById(Integer id){

        StorageLocationInfoVo storageLocationInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, storageLocationInfoVo);
    }


    @Override
    public ResultUtils<Page<StorageLocationListVo>> getList(PageDto pageDto, StorageLocationKeyDto keyDto){

        Page<StorageLocationListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<StorageLocationListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
