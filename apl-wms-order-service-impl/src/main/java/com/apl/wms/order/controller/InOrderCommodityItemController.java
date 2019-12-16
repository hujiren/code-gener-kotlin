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
import com.apl.wms.order.service.InOrderCommodityItemService;
import com.apl.wms.order.po.InOrderCommodityItemPo;
import com.apl.wms.order.vo.InOrderCommodityItemListVo;
import com.apl.wms.order.vo.InOrderCommodityItemInfoVo;
import com.apl.wms.order.dto.InOrderCommodityItemKeyDto;
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
@RequestMapping("/in_order_commodity_item")
@Validated
@Api(value = "入库订单商品明细",tags = "入库订单商品明细")
@Slf4j
public class InOrderCommodityItemController {

    @Autowired
    public InOrderCommodityItemService inOrderCommodityItemService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加", notes ="")
    public ResultUtils<Integer> add(InOrderCommodityItemPo inOrderCommodityItemPo) {
        ApiParamValidate.validate(inOrderCommodityItemPo);

        return inOrderCommodityItemService.add(inOrderCommodityItemPo);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新",  notes ="")
    public ResultUtils<Boolean> updById(InOrderCommodityItemPo inOrderCommodityItemPo) {
        ApiParamValidate.notEmpty("id", inOrderCommodityItemPo.getId());
        ApiParamValidate.validate(inOrderCommodityItemPo);

        return inOrderCommodityItemService.updById(inOrderCommodityItemPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Integer id) {

        return inOrderCommodityItemService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<InOrderCommodityItemInfoVo> selectById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Integer id) {

        return inOrderCommodityItemService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<InOrderCommodityItemListVo>> getList(PageDto pageDto, @Validated InOrderCommodityItemKeyDto keyDto) {

        return inOrderCommodityItemService.getList(pageDto , keyDto);
    }

}
