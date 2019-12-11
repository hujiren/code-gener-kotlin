package com.apl.wms.wh.controller;


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
import com.apl.wms.wh.service.InOrderCommodityService;
import com.apl.wms.wh.po.InOrderCommodityPo;
import com.apl.wms.wh.vo.InOrderCommodityListVo;
import com.apl.wms.wh.vo.InOrderCommodityInfoVo;
import com.apl.wms.wh.dto.InOrderCommodityKeyDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.apl.common.utils.ResultUtils;
import com.apl.common.validate.ApiParamValidate;
import javax.validation.constraints.Min;

/**
 *
 * @author cy
 * @since 2019-12-11
 */
@RestController
@RequestMapping("/in_order_commodity")
@Validated
@Api(value = "入库订单商品明细",tags = "入库订单商品明细")
@Slf4j
public class InOrderCommodityController {

    @Autowired
    public InOrderCommodityService inOrderCommodityService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加" , notes = "添加 ")
    public ResultUtils<Integer> add(@Validated InOrderCommodityPo inOrderCommodity) {

        return inOrderCommodityService.add(inOrderCommodity);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新" , notes = "更新")
    public ResultUtils<Boolean> updById(@Validated InOrderCommodityPo inOrderCommodityPo) {

        ApiParamValidate.notEmpty("id", inOrderCommodityPo.getId());

        return inOrderCommodityService.updById(inOrderCommodityPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@Min(value = 1 , message = "id不能小于 1") Integer id) {

        return inOrderCommodityService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<InOrderCommodityInfoVo> getById(@Min(value = 1 , message = "id不能小于 1") Integer id) {

        return inOrderCommodityService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<InOrderCommodityListVo>> getList(PageDto pageDto, @Validated InOrderCommodityKeyDto keyDto) {

        return inOrderCommodityService.getList(pageDto , keyDto);
    }

}
