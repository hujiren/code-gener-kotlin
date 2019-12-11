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
import com.apl.wms.wh.service.StorageLocationService;
import com.apl.wms.wh.po.StorageLocationPo;
import com.apl.wms.wh.vo.StorageLocationListVo;
import com.apl.wms.wh.vo.StorageLocationInfoVo;
import com.apl.wms.wh.dto.StorageLocationKeyDto;
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
@RequestMapping("/storage_location")
@Validated
@Api(value = "库位",tags = "库位")
@Slf4j
public class StorageLocationController {

    @Autowired
    public StorageLocationService storageLocationService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加" , notes = "添加 ")
    public ResultUtils<Integer> add(@Validated StorageLocationPo storageLocation) {

        return storageLocationService.add(storageLocation);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新" , notes = "更新")
    public ResultUtils<Boolean> updById(@Validated StorageLocationPo storageLocationPo) {

        ApiParamValidate.notEmpty("id", storageLocationPo.getId());

        return storageLocationService.updById(storageLocationPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@Min(value = 1 , message = "id不能小于 1") Integer id) {

        return storageLocationService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<StorageLocationInfoVo> getById(@Min(value = 1 , message = "id不能小于 1") Integer id) {

        return storageLocationService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<StorageLocationListVo>> getList(PageDto pageDto, @Validated StorageLocationKeyDto keyDto) {

        return storageLocationService.getList(pageDto , keyDto);
    }

}
