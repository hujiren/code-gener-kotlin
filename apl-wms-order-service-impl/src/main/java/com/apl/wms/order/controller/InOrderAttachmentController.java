package com.apl.wms.order.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.apl.common.pojo.dto.PageDto;
import org.springframework.web.bind.annotation.*;
import com.apl.wms.order.service.InOrderAttachmentService;
import com.apl.wms.order.po.InOrderAttachmentPo;
import com.apl.wms.order.vo.InOrderAttachmentListVo;
import com.apl.wms.order.vo.InOrderAttachmentInfoVo;
import com.apl.wms.order.dto.InOrderAttachmentKeyDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.apl.common.utils.ResultUtils;
import com.apl.common.validate.ApiParamValidate;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author cy
 * @since 2019-12-16
 */
@RestController
@RequestMapping("/in_order_attachment")
@Validated
@Api(value = "入库订单其他信息",tags = "入库订单其他信息")
@Slf4j
public class InOrderAttachmentController {

    @Autowired
    public InOrderAttachmentService inOrderAttachmentService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加", notes ="")
    public ResultUtils<Integer> add(InOrderAttachmentPo inOrderAttachmentPo) {
        ApiParamValidate.validate(inOrderAttachmentPo);

        return inOrderAttachmentService.add(inOrderAttachmentPo);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新",  notes ="")
    public ResultUtils<Boolean> updById(InOrderAttachmentPo inOrderAttachmentPo) {
        ApiParamValidate.notEmpty("id", inOrderAttachmentPo.getId());
        ApiParamValidate.validate(inOrderAttachmentPo);

        return inOrderAttachmentService.updById(inOrderAttachmentPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Integer id) {

        return inOrderAttachmentService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<InOrderAttachmentInfoVo> selectById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Integer id) {

        return inOrderAttachmentService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<InOrderAttachmentListVo>> getList(PageDto pageDto, @Validated InOrderAttachmentKeyDto keyDto) {

        return inOrderAttachmentService.getList(pageDto , keyDto);
    }

}
