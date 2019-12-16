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
import com.apl.wms.order.service.InOrderOperatiorService;
import com.apl.wms.order.po.InOrderOperatiorPo;
import com.apl.wms.order.vo.InOrderOperatiorListVo;
import com.apl.wms.order.vo.InOrderOperatiorInfoVo;
import com.apl.wms.order.dto.InOrderOperatiorKeyDto;
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
@RequestMapping("/in_order_operatior")
@Validated
@Api(value = "入库订单操作",tags = "入库订单操作")
@Slf4j
public class InOrderOperatiorController {

    @Autowired
    public InOrderOperatiorService inOrderOperatiorService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加", notes ="")
    public ResultUtils<Integer> add(InOrderOperatiorPo inOrderOperatiorPo) {
        ApiParamValidate.validate(inOrderOperatiorPo);

        return inOrderOperatiorService.add(inOrderOperatiorPo);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新",  notes ="")
    public ResultUtils<Boolean> updById(InOrderOperatiorPo inOrderOperatiorPo) {
        ApiParamValidate.notEmpty("id", inOrderOperatiorPo.getId());
        ApiParamValidate.validate(inOrderOperatiorPo);

        return inOrderOperatiorService.updById(inOrderOperatiorPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Integer id) {

        return inOrderOperatiorService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<InOrderOperatiorInfoVo> selectById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Integer id) {

        return inOrderOperatiorService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<InOrderOperatiorListVo>> getList(PageDto pageDto, @Validated InOrderOperatiorKeyDto keyDto) {

        return inOrderOperatiorService.getList(pageDto , keyDto);
    }

}
