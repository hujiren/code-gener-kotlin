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
import com.apl.wms.wh.service.WhZoneService;
import com.apl.wms.wh.po.WhZonePo;
import com.apl.wms.wh.vo.WhZoneListVo;
import com.apl.wms.wh.dto.WhZoneKeyDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.apl.common.utils.ResultUtils;

import javax.validation.constraints.Min;

/**
 *
 * @author cy
 * @since 2019-12-10
 */
@RestController
@RequestMapping("/wh_zone")
@Validated
@Api(value = "仓库分区",tags = "仓库分区")
@Slf4j
public class WhZoneController {

    @Autowired
    public WhZoneService whZoneService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加" , notes = "添加 ")
    public ResultUtils<Integer> add(@Validated WhZonePo whZone) {

        return whZoneService.add(whZone);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新" , notes = "更新")
    public ResultUtils<Boolean> updById(@Validated WhZonePo whZonePo) {

        ApiParamValidate.notEmpty("id", whZonePo.getId());

        return whZoneService.updById(whZonePo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@Min(value = 1 , message = "id不能小于 1") Long id) {

        return whZoneService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<WhZonePo> getById(@Min(value = 1 , message = "id不能小于 1") Long id) {

        return whZoneService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<WhZoneListVo>> getList(PageDto pageDto, @Validated WhZoneKeyDto keyDto) {

        return whZoneService.getList(pageDto , keyDto);
    }

}