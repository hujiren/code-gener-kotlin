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
import com.apl.wms.wh.service.GoodsBacketService;
import com.apl.wms.wh.po.GoodsBacketPo;
import com.apl.wms.wh.vo.GoodsBacketListVo;
import com.apl.wms.wh.vo.GoodsBacketInfoVo;
import com.apl.wms.wh.dto.GoodsBacketKeyDto;
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
@RequestMapping("/goods_backet")
@Validated
@Api(value = "货蓝",tags = "货蓝")
@Slf4j
public class GoodsBacketController {

    @Autowired
    public GoodsBacketService goodsBacketService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加" , notes = "添加 ")
    public ResultUtils<Integer> add(@Validated GoodsBacketPo goodsBacket) {

        return goodsBacketService.add(goodsBacket);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新" , notes = "更新")
    public ResultUtils<Boolean> updById(@Validated GoodsBacketPo goodsBacketPo) {

        ApiParamValidate.notEmpty("id", goodsBacketPo.getId());

        return goodsBacketService.updById(goodsBacketPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@Min(value = 1 , message = "id不能小于 1") Integer id) {

        return goodsBacketService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<GoodsBacketInfoVo> getById(@Min(value = 1 , message = "id不能小于 1") Integer id) {

        return goodsBacketService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<GoodsBacketListVo>> getList(PageDto pageDto, @Validated GoodsBacketKeyDto keyDto) {

        return goodsBacketService.getList(pageDto , keyDto);
    }

}
