package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.ShelvesSpecMapper;
import com.apl.wms.wh.service.ShelvesSpecService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.ShelvesSpecPo;
import com.apl.wms.wh.vo.ShelvesSpecListVo;
import com.apl.wms.wh.dto.ShelvesSpecKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 货架规格 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-10
 */
@Service
@Slf4j
public class ShelvesSpecServiceImpl extends ServiceImpl<ShelvesSpecMapper, ShelvesSpecPo> implements ShelvesSpecService {

    //状态code枚举
    /*enum ShelvesSpecServiceCode {

        ;

        private String code;
        private String msg;

        ShelvesSpecServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(ShelvesSpecPo shelvesSpec){

        Integer flag = baseMapper.insert(shelvesSpec);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , shelvesSpec.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(ShelvesSpecPo shelvesSpec){

        Integer flag = baseMapper.updateById(shelvesSpec);
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
    public ResultUtils<ShelvesSpecPo> selectById(Long id){

        ShelvesSpecPo shelvesSpec = getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, shelvesSpec);
    }


    @Override
    public ResultUtils<Page<ShelvesSpecListVo>> getList(PageDto pageDto, ShelvesSpecKeyDto keyDto){

        Page<ShelvesSpecListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<ShelvesSpecListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
