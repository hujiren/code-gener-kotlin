package com.apl.wms.order.service.impl;
import com.apl.common.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.common.constants.CommonStatusCode;

import com.apl.wms.order.mapper.InOrderAttachmentMapper;
import com.apl.wms.order.service.InOrderAttachmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.wms.order.po.InOrderAttachmentPo;
import com.apl.wms.order.vo.InOrderAttachmentListVo;
import com.apl.wms.order.vo.InOrderAttachmentInfoVo;
import com.apl.wms.order.dto.InOrderAttachmentKeyDto;

import java.util.List;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 入库订单其他信息 service实现类
 * </p>
 *
 * @author cy
 * @since 2019-12-16
 */
@Service
@Slf4j
public class InOrderAttachmentServiceImpl extends ServiceImpl<InOrderAttachmentMapper, InOrderAttachmentPo> implements InOrderAttachmentService {

    //状态code枚举
    /*enum InOrderAttachmentServiceCode {

        ;

        private String code;
        private String msg;

        InOrderAttachmentServiceCode(String code, String msg) {
             this.code = code;
             this.msg = msg;
        }
    }*/



    @Override
    public ResultUtils<Integer> add(InOrderAttachmentPo inOrderAttachment){


        Integer flag = baseMapper.insert(inOrderAttachment);
        if(flag.equals(1)){
            return ResultUtils.APPRESULT(CommonStatusCode.SAVE_SUCCESS , inOrderAttachment.getId());
        }

        return ResultUtils.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtils<Boolean> updById(InOrderAttachmentPo inOrderAttachment){


        Integer flag = baseMapper.updateById(inOrderAttachment);
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
    public ResultUtils<InOrderAttachmentInfoVo> selectById(Long id){

        InOrderAttachmentInfoVo inOrderAttachmentInfoVo = baseMapper.getById(id);

        return ResultUtils.APPRESULT(CommonStatusCode.GET_SUCCESS, inOrderAttachmentInfoVo);
    }


    @Override
    public ResultUtils<Page<InOrderAttachmentListVo>> getList(PageDto pageDto, InOrderAttachmentKeyDto keyDto){

        Page<InOrderAttachmentListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<InOrderAttachmentListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtils.SUCCESS(page);
    }


}
