package com.apl.lms.air.transportation.service.impl;

import com.apl.lib.pojo.dto.PageDto;
import com.apl.lib.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apl.lib.constants.CommonStatusCode;

import com.apl.lms.air.transportation.TransferMapper;
import com.apl.lms.air.transportation.TransferService;
import com.apl.lms.air.transportation.${table.daoName};
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
    enum TransferServiceCode {

            ;

            private String code;
            private String msg;

            TransferServiceCode(String code, String msg) {
                 this.code = code;
                 this.msg = msg;
            }
        }

    @Autowired
    ${table.daoName} transferDao;


    /**
     * @Desc: 新增转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋,
     * @author hjr
     * @since 2021-02-19
     */
    @Override
    public ResultUtil<Long> add(TransferPo transferPo){


        Integer flag = transferDao.add(transferPo);

        if(flag.equals(1)){
            return ResultUtil.APPRESULT(CommonStatusCode.SAVE_SUCCESS , transferPo.getId());
        }

        return ResultUtil.APPRESULT(CommonStatusCode.SAVE_FAIL , null);
    }


    /**
     * @Desc: 更新转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋,
     * @author hjr
     * @since 2021-02-19
     */
    @Override
    public ResultUtil<Boolean> updById(TransferPo transferPo){


        Integer flag = transferDao.updById(transferPo);
        if(flag.equals(1)){
            return ResultUtil.APPRESULT(CommonStatusCode.SAVE_SUCCESS , true);
        }

        return ResultUtil.APPRESULT(CommonStatusCode.SAVE_FAIL , false);
    }


    /**
     * @Desc: 删除转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋,
     * @author hjr
     * @since 2021-02-19
     */
    @Override
    public ResultUtil<Boolean> delById(Long id){

        Integer flag = transferDao.delById(id);
        if(flag > 0){
            return ResultUtil.APPRESULT(CommonStatusCode.DEL_SUCCESS , true);
        }

        return ResultUtil.APPRESULT(CommonStatusCode.DEL_FAIL , false);
    }


    /**
     * @Desc: 获取详细
     * @author hjr
     * @since 2021-02-19
     */
    @Override
    public ResultUtil<TransferInfoVo> selectById(Long id){

        TransferInfoVo transferInfoVo = transferDao.selectById(id);

        return ResultUtil.APPRESULT(CommonStatusCode.GET_SUCCESS, transferInfoVo);
    }


    /**
     * @Desc: 分页查找 转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋,列表
     * @author hjr
     * @since 2021-02-19
     */
    @Override
    public ResultUtil<Page<TransferListVo>> getList(PageDto pageDto, TransferKeyDto keyDto){

        AdbPageVo<TransferListVo> adbTransferPageVo = transferDao.getList(pageDto , keyDto);

        return ResultUtil.APPRESULT(CommonStatusCode.GET_SUCCESS , page);
    }


}