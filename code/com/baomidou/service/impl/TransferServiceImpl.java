package com.apl.lms.air.transportation.service.impl;

import com.apl.lib.pojo.dto.PageDto;
import com.apl.lib.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.apl.lib.constants.CommonStatusCode;

import com.apl.lms.air.transportation.TransferMapper;
import com.apl.lms.air.transportation.TransferService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.apl.lms.air.transportation.pojo.po.TransferPo;
import com.apl.lms.air.transportation.pojo.vo.TransferListVo;
import com.apl.lms.air.transportation.pojo.vo.TransferInfoVo;
import com.apl.lms.air.transportation.pojo.dto.TransferKeyDto;

import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;


/**
 * <p>
 * 转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋, service实现类
 * </p>
 *
 * @author hjr
 * @since 2021-02-19
 */
@Service
@Slf4j
public class TransferServiceImpl implements TransferService {

    //状态code枚举
    /*enum TransferServiceCode {

            ;

            private String code;
            private String msg;

            TransferServiceCode(String code, String msg) {
                 this.code = code;
                 this.msg = msg;
            }
        }*/

    @Autowired
    TransferDao transferDao;

    @Override
    public ResultUtil<Long> add(TransferAddDto transferAddDto){


        TransferPo transferPo = new TransferPo();
        BeanUtil.copyProperties(transferAddDto, transferPo);

        Integer flag = transferDao.add(transferPo);
        if(flag.equals(1)){
            return ResultUtil.APPRESULT(CommonStatusCode.SAVE_SUCCESS , transferPo.getId());
        }

        return ResultUtil.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    @Override
    public ResultUtil<Boolean> updById(TransferUpdDto transferUpdDto){


        TransferPo transferPo = new TransferPo();
        BeanUtil.copyProperties(transferUpdDto, transferPo);

        Integer flag = transferDao.updById(transferPo);
        if(flag.equals(1)){
            return ResultUtil.APPRESULT(CommonStatusCode.SAVE_SUCCESS , true);
        }

        return ResultUtil.APPRESULT(CommonStatusCode.SAVE_FAIL , false);
    }


    @Override
    public ResultUtil<Boolean> delById(Long id){

        Integer flag = transferDao.delById(id);
        if(flag > 0){
            return ResultUtil.APPRESULT(CommonStatusCode.DEL_SUCCESS , true);
        }

        return ResultUtil.APPRESULT(CommonStatusCode.DEL_FAIL , false);
    }


    @Override
    public ResultUtil<TransferInfoVo> selectById(Long id){

        TransferInfoVo transferInfoVo = transferDao.selectById(id);

        return ResultUtil.APPRESULT(CommonStatusCode.GET_SUCCESS, transferInfoVo);
    }


    @Override
    public ResultUtil<Page<TransferListVo>> getList(PageDto pageDto, TransferKeyDto keyDto){

        Page<TransferListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<TransferListVo> list = transferDao.getList(page , keyDto);
        page.setRecords(list);

        return ResultUtil.APPRESULT(CommonStatusCode.GET_SUCCESS , page);
    }


}