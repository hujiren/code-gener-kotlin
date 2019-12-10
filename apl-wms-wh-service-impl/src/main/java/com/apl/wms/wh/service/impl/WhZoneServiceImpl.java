package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.WhZoneMapper;
import com.apl.wms.wh.service.WhZoneService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.WhZonePo;
import com.apl.wms.wh.vo.WhZoneListVo;
import com.apl.wms.wh.dto.WhZoneKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 仓库分区 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Service
@Slf4j
public class WhZoneServiceImpl extends ServiceImpl<WhZoneMapper, WhZonePo> implements WhZoneService {

    //状态code枚举
    /*enum WhZoneServiceCode {

        ;

        private String code;
        private String msg;

        WhZoneServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(WhZonePo whZone){

        Integer flag = baseMapper.insert(whZone);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , whZone.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(WhZonePo whZone){

        Integer flag = baseMapper.updateById(whZone);
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
    public ResultUtils<WhZonePo> selectById(Long id){

        WhZonePo whZone = getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, whZone);
    }


    @Override
    public ResultUtils<Page<WhZoneListVo>> getList(PageDto pageDto, WhZoneKeyDto keyDto){

        Page<WhZoneListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<WhZoneListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
