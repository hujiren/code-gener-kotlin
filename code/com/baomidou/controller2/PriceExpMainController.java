package com.apl.lms.price.exp.manage.controller;

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
import com.baomidou.service.PriceExpMainService;
import com.apl.lms.price.exp.pojo.po.PriceExpMainPo;
import com.apl.lms.price.exp.pojo.vo.PriceExpMainListVo;
import com.apl.lms.price.exp.pojo.vo.PriceExpMainInfoVo;
import com.apl.lms.price.exp.pojo.dto.PriceExpMainKeyDto;
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
@RequestMapping(value = "/price_exp_main")
@Validated
@Api(value = "",tags = "")
@Slf4j
public class PriceExpMainController {

    @Autowired
    public PriceExpMainService priceExpMainService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加", notes ="")
    public ResultUtils<Long> add(@Validated PriceExpMainPo priceExpMainPo) {
        ApiParamValidate.validate(priceExpMainPo);

        return priceExpMainService.add(priceExpMainPo);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新",  notes ="")
    public ResultUtils<Boolean> updById(@Validated PriceExpMainPo priceExpMainPo) {
        ApiParamValidate.notEmpty("id", priceExpMainPo.getId());
        ApiParamValidate.validate(priceExpMainPo);

        return priceExpMainService.updById(priceExpMainPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Long id) {

        return priceExpMainService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<PriceExpMainInfoVo> selectById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Long id) {

        return priceExpMainService.selectById(id);
    }


    @PostMapping(value = "/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<PriceExpMainListVo>> getList(PageDto pageDto, @Validated PriceExpMainKeyDto keyDto) {

        return priceExpMainService.getList(pageDto , keyDto);
    }

}
