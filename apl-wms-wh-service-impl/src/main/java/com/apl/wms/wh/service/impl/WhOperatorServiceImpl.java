package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.WhOperatorMapper;
import com.apl.wms.wh.service.WhOperatorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.WhOperatorPo;
import com.apl.wms.wh.vo.WhOperatorListVo;
import com.apl.wms.wh.dto.WhOperatorKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 仓库操作员 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Service
@Slf4j
public class WhOperatorServiceImpl extends ServiceImpl<WhOperatorMapper, WhOperatorPo> implements WhOperatorService {

    //状态code枚举
    /*enum WhOperatorServiceCode {

        ;

        private String code;
        private String msg;

        WhOperatorServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(WhOperatorPo whOperator){

        Integer flag = baseMapper.insert(whOperator);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , whOperator.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(WhOperatorPo whOperator){

        Integer flag = baseMapper.updateById(whOperator);
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
    public ResultUtils<WhOperatorPo> selectById(Long id){

        WhOperatorPo whOperator = getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, whOperator);
    }


    @Override
    public ResultUtils<Page<WhOperatorListVo>> getList(PageDto pageDto, WhOperatorKeyDto keyDto){

        Page<WhOperatorListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<WhOperatorListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
