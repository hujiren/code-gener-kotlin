package com.apl.wms.wh.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.wh.mapper.GoodsBacketMapper;
import com.apl.wms.wh.service.GoodsBacketService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.wh.po.GoodsBacketPo;
import com.apl.wms.wh.vo.GoodsBacketListVo;
import com.apl.wms.wh.vo.GoodsBacketInfoVo;
import com.apl.wms.wh.dto.GoodsBacketKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 货蓝 服务实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
@Service
@Slf4j
public class GoodsBacketServiceImpl extends ServiceImpl<GoodsBacketMapper, GoodsBacketPo> implements GoodsBacketService {

    //状态code枚举
    /*enum GoodsBacketServiceCode {

        ;

        private String code;
        private String msg;

        GoodsBacketServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(GoodsBacketPo goodsBacket){

        Integer flag = baseMapper.insert(goodsBacket);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , goodsBacket.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(GoodsBacketPo goodsBacket){

        Integer flag = baseMapper.updateById(goodsBacket);
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
    public ResultUtils<GoodsBacketInfoVo> selectById(Integer id){

        GoodsBacketInfoVo goodsBacketInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, goodsBacketInfoVo);
    }


    @Override
    public ResultUtils<Page<GoodsBacketListVo>> getList(PageDto pageDto, GoodsBacketKeyDto keyDto){

        Page<GoodsBacketListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<GoodsBacketListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }

}
