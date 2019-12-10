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
import com.apl.wms.wh.service.CommodityPicRelService;
import com.apl.wms.wh.po.CommodityPicRelPo;
import com.apl.wms.wh.vo.CommodityPicRelListVo;
import com.apl.wms.wh.dto.CommodityPicRelKeyDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.apl.common.utils.ResultUtils;

import javax.validation.constraints.Min;

/**
 *
 * @author cy
 * @since 2019-12-10
 */
@RestController
@RequestMapping("/commodity_pic_rel")
@Validated
@Api(value = "商品图片",tags = "商品图片")
@Slf4j
public class CommodityPicRelController {

    @Autowired
    public CommodityPicRelService commodityPicRelService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加" , notes = "添加 ")
    public ResultUtils<Integer> add(@Validated CommodityPicRelPo commodityPicRel) {

        return commodityPicRelService.add(commodityPicRel);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新" , notes = "更新")
    public ResultUtils<Boolean> updById(@Validated CommodityPicRelPo commodityPicRelPo) {

        ApiParamValidate.notEmpty("id", commodityPicRelPo.getId());

        return commodityPicRelService.updById(commodityPicRelPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@Min(value = 1 , message = "id不能小于 1") Long id) {

        return commodityPicRelService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<CommodityPicRelPo> getById(@Min(value = 1 , message = "id不能小于 1") Long id) {

        return commodityPicRelService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<CommodityPicRelListVo>> getList(PageDto pageDto, @Validated CommodityPicRelKeyDto keyDto) {

        return commodityPicRelService.getList(pageDto , keyDto);
    }

}
