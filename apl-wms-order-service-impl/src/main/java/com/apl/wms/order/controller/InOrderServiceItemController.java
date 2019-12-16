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
import com.apl.wms.order.service.InOrderServiceItemService;
import com.apl.wms.order.po.InOrderServiceItemPo;
import com.apl.wms.order.vo.InOrderServiceItemListVo;
import com.apl.wms.order.vo.InOrderServiceItemInfoVo;
import com.apl.wms.order.dto.InOrderServiceItemKeyDto;
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
@RequestMapping("/in_order_service_item")
@Validated
@Api(value = "入库订单服务",tags = "入库订单服务")
@Slf4j
public class InOrderServiceItemController {

    @Autowired
    public InOrderServiceItemService inOrderServiceItemService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加", notes ="")
    public ResultUtils<Integer> add(InOrderServiceItemPo inOrderServiceItemPo) {
        ApiParamValidate.validate(inOrderServiceItemPo);

        return inOrderServiceItemService.add(inOrderServiceItemPo);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新",  notes ="")
    public ResultUtils<Boolean> updById(InOrderServiceItemPo inOrderServiceItemPo) {
        ApiParamValidate.notEmpty("id", inOrderServiceItemPo.getId());
        ApiParamValidate.validate(inOrderServiceItemPo);

        return inOrderServiceItemService.updById(inOrderServiceItemPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Integer id) {

        return inOrderServiceItemService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<InOrderServiceItemInfoVo> selectById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Integer id) {

        return inOrderServiceItemService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<InOrderServiceItemListVo>> getList(PageDto pageDto, @Validated InOrderServiceItemKeyDto keyDto) {

        return inOrderServiceItemService.getList(pageDto , keyDto);
    }

}
