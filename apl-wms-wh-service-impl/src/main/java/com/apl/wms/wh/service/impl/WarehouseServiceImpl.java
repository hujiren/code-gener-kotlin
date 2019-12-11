package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.WarehouseMapper;
import com.apl.wms.wh.service.WarehouseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.WarehousePo;
import com.apl.wms.wh.vo.WarehouseListVo;
import com.apl.wms.wh.vo.WarehouseInfoVo;
import com.apl.wms.wh.dto.WarehouseKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 仓库 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Service
@Slf4j
public class WarehouseServiceImpl extends ServiceImpl<WarehouseMapper, WarehousePo> implements WarehouseService {

    //状态code枚举
    /*enum WarehouseServiceCode {

        ;

        private String code;
        private String msg;

        WarehouseServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(WarehousePo warehouse){

        Integer flag = baseMapper.insert(warehouse);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , warehouse.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(WarehousePo warehouse){

        Integer flag = baseMapper.updateById(warehouse);
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
    public ResultUtils<WarehouseInfoVo> selectById(Integer id){

        WarehouseInfoVo warehouseInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, warehouseInfoVo);
    }


    @Override
    public ResultUtils<Page<WarehouseListVo>> getList(PageDto pageDto, WarehouseKeyDto keyDto){

        Page<WarehouseListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<WarehouseListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
