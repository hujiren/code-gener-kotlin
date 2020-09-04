package controller;


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
import service.CountryService;
import com.apl.lms.common.pojo.po.po.CountryPo;
import com.apl.lms.common.pojo.po.vo.CountryListVo;
import com.apl.lms.common.pojo.po.vo.CountryInfoVo;
import com.apl.lms.common.pojo.po.dto.CountryKeyDto;
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
@RequestMapping("/country")
@Validated
@Api(value = "国家",tags = "国家")
@Slf4j
public class CountryController {

    @Autowired
    public CountryService countryService;


    @PostMapping(value = "/add")
    @ApiOperation(value =  "添加", notes ="")
    public ResultUtils<Integer> add(CountryPo countryPo) {
        ApiParamValidate.validate(countryPo);

        return countryService.add(countryPo);
    }


    @PostMapping(value = "/upd")
    @ApiOperation(value =  "更新",  notes ="")
    public ResultUtils<Boolean> updById(CountryPo countryPo) {
        ApiParamValidate.notEmpty("id", countryPo.getId());
        ApiParamValidate.validate(countryPo);

        return countryService.updById(countryPo);
    }


    @PostMapping(value = "/del")
    @ApiOperation(value =  "删除" , notes = "删除")
    @ApiImplicitParam(name = "id",value = " id",required = true  , paramType = "query")
    public ResultUtils<Boolean> delById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Long id) {

        return countryService.delById(id);
    }


    @PostMapping(value = "/get")
    @ApiOperation(value =  "获取详细" , notes = "获取详细")
    @ApiImplicitParam(name = "id",value = "id",required = true  , paramType = "query")
    public ResultUtils<CountryInfoVo> selectById(@NotNull(message = "id不能为空") @Min(value = 1 , message = "id不能小于1") Long id) {

        return countryService.selectById(id);
    }


    @PostMapping("/get-list")
    @ApiOperation(value =  "分页查找" , notes = "分页查找")
    public ResultUtils<Page<CountryListVo>> getList(PageDto pageDto, @Validated CountryKeyDto keyDto) {

        return countryService.getList(pageDto , keyDto);
    }

}
