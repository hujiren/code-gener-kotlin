package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.WhShelvesMapper;
import com.apl.wms.wh.service.WhShelvesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.WhShelvesPo;
import com.apl.wms.wh.vo.WhShelvesListVo;
import com.apl.wms.wh.dto.WhShelvesKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 货架 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Service
@Slf4j
public class WhShelvesServiceImpl extends ServiceImpl<WhShelvesMapper, WhShelvesPo> implements WhShelvesService {

    //状态code枚举
    /*enum WhShelvesServiceCode {

        ;

        private String code;
        private String msg;

        WhShelvesServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(WhShelvesPo whShelves){

        Integer flag = baseMapper.insert(whShelves);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , whShelves.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(WhShelvesPo whShelves){

        Integer flag = baseMapper.updateById(whShelves);
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
    public ResultUtils<WhShelvesPo> selectById(Long id){

        WhShelvesPo whShelves = getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, whShelves);
    }


    @Override
    public ResultUtils<Page<WhShelvesListVo>> getList(PageDto pageDto, WhShelvesKeyDto keyDto){

        Page<WhShelvesListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<WhShelvesListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
