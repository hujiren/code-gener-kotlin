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
import com.apl.wms.wh.service.WhDetailsService;
import com.apl.wms.wh.po.WhDetailsPo;
import com.apl.wms.wh.vo.WhDetailsListVo;
import com.apl.wms.wh.dto.WhDetailsKeyDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.apl.common.utils.ResultUtils;

import javax.validation.constraints.Min;

/**
 *
 * @author cy
 * @since 2019-12-10
 */
@RestController
@RequestMapping("/wh_details")
@Validated
@Api(value = "仓库详细",tags = "仓库详细")
@Slf4j
public class WhDetailsController {

    @Autowired
    public WhDetailsService whDetailsService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加" , notes = "添加 ")
    public ResultUtils<Integer> add(@Validated WhDetailsPo whDetails) {

        return whDetailsService.add(whDetails);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新" , notes = "更新")
    public ResultUtils<Boolean> updById(@Validated WhDetailsPo whDetailsPo) {

        ApiParamValidate.notEmpty("id", whDetailsPo.getId());

        return whDetailsService.updById(whDetailsPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@Min(value = 1 , message = "id不能小于 1") Long id) {

        return whDetailsService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<WhDetailsPo> getById(@Min(value = 1 , message = "id不能小于 1") Long id) {

        return whDetailsService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<WhDetailsListVo>> getList(PageDto pageDto, @Validated WhDetailsKeyDto keyDto) {

        return whDetailsService.getList(pageDto , keyDto);
    }

}
