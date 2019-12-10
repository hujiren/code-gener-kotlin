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
import com.apl.wms.wh.service.CommodityCategoryService;
import com.apl.wms.wh.po.CommodityCategoryPo;
import com.apl.wms.wh.vo.CommodityCategoryListVo;
import com.apl.wms.wh.dto.CommodityCategoryKeyDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.apl.common.utils.ResultUtils;

import javax.validation.constraints.Min;

/**
 *
 * @author cy
 * @since 2019-12-10
 */
@RestController
@RequestMapping("/commodity_category")
@Validated
@Api(value = "商品种类",tags = "商品种类")
@Slf4j
public class CommodityCategoryController {

    @Autowired
    public CommodityCategoryService commodityCategoryService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加" , notes = "添加 ")
    public ResultUtils<Integer> add(@Validated CommodityCategoryPo commodityCategory) {

        return commodityCategoryService.add(commodityCategory);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新" , notes = "更新")
    public ResultUtils<Boolean> updById(@Validated CommodityCategoryPo commodityCategoryPo) {

        ApiParamValidate.notEmpty("id", commodityCategoryPo.getId());

        return commodityCategoryService.updById(commodityCategoryPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@Min(value = 1 , message = "id不能小于 1") Long id) {

        return commodityCategoryService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<CommodityCategoryPo> getById(@Min(value = 1 , message = "id不能小于 1") Long id) {

        return commodityCategoryService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<CommodityCategoryListVo>> getList(PageDto pageDto, @Validated CommodityCategoryKeyDto keyDto) {

        return commodityCategoryService.getList(pageDto , keyDto);
    }

}
