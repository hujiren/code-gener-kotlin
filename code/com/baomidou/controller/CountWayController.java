package com.apl.lms.common.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.apl.common.pojo.dto.PageDto;
import org.springframework.web.bind.annotation.*;
import com.baomidou.service.CountWayService;
import com.apl.lms.common.pojo.po.CountWayPo;
import com.apl.lms.common.pojo.vo.CountWayListVo;
import com.apl.lms.common.pojo.vo.CountWayInfoVo;
import com.apl.lms.common.pojo.dto.CountWayKeyDto;
import com.apl.lib.pojo.dto.PageDto;
import com.apl.lib.utils.ResultUtils;
import com.apl.lib.validate.ApiParamValidate;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author hjr
 * @since 2020-09-04
 */
@RestController
@RequestMapping(value = "/count_way")
@Validated
@Api(value = "计件方式",tags = "计件方式")
@Slf4j
public class CountWayController {

    @Autowired
    public CountWayService countWayService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加", notes ="")
    public ResultUtils<Long> add(@Validated CountWayAddDto countWayAddDto) {
        ApiParamValidate.validate(countWayAddDto);

        return countWayService.add(countWayAddDto);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新",  notes ="")
    public ResultUtils<Boolean> updById(@Validated CountWayUpdDto countWayUpdDto) {
        ApiParamValidate.notEmpty("id", countWayUpdDto.getId());
        ApiParamValidate.validate(countWayUpdDto);

        return countWayService.updById(countWayUpdDto);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Long id) {

        return countWayService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<CountWayInfoVo> selectById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Long id) {

        return countWayService.selectById(id);
    }


    @PostMapping(value = "/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<CountWayListVo>> getList(PageDto pageDto, @Validated CountWayKeyDto keyDto) {

        return countWayService.getList(pageDto , keyDto);
    }

}
