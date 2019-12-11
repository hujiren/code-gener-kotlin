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
import com.apl.wms.wh.service.WhOperatorService;
import com.apl.wms.wh.po.WhOperatorPo;
import com.apl.wms.wh.vo.WhOperatorListVo;
import com.apl.wms.wh.vo.WhOperatorInfoVo;
import com.apl.wms.wh.dto.WhOperatorKeyDto;
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
@RequestMapping("/wh_operator")
@Validated
@Api(value = "仓库操作员",tags = "仓库操作员")
@Slf4j
public class WhOperatorController {

    @Autowired
    public WhOperatorService whOperatorService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加" , notes = "添加 ")
    public ResultUtils<Integer> add(@Validated WhOperatorPo whOperator) {

        return whOperatorService.add(whOperator);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新" , notes = "更新")
    public ResultUtils<Boolean> updById(@Validated WhOperatorPo whOperatorPo) {

        ApiParamValidate.notEmpty("id", whOperatorPo.getId());

        return whOperatorService.updById(whOperatorPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@Min(value = 1 , message = "id不能小于 1") Integer id) {

        return whOperatorService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<WhOperatorInfoVo> getById(@Min(value = 1 , message = "id不能小于 1") Integer id) {

        return whOperatorService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<WhOperatorListVo>> getList(PageDto pageDto, @Validated WhOperatorKeyDto keyDto) {

        return whOperatorService.getList(pageDto , keyDto);
    }

}
