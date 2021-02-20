package com.apl.lms.air.transportation.service;

import com.apl.lms.air.transportation.pojo.po.TransferPo;
import com.apl.lms.air.transportation.pojo.vo.TransferListVo;
import com.apl.lms.air.transportation.pojo.vo.TransferInfoVo;
import com.apl.lib.pojo.dto.PageDto;
import com.apl.lib.utils.ResultUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋, service接口
 * </p>
 *
 * @author hjr
 * @since 2021-02-19
 */
public interface TransferService{

        /**
         * @Desc: 新增转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋,
         * @author hjr
         * @since 2021-02-19
         */
        ResultUtil<Long> add(TransferPo transferPo);


        /**
         * @Desc: 更新转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋,
         * @author hjr
         * @since 2021-02-19
         */
        ResultUtil<Boolean> updById(TransferPo transferPo);


        /**
         * @Desc: 删除转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋,
         * @author hjr
         * @since 2021-02-19
         */
        ResultUtil<Boolean> delById(Long id);


        /**
         * @Desc: 获取详细
         * @author hjr
         * @since 2021-02-19
         */
        ResultUtil<TransferInfoVo> selectById(Long id);


        /**
         * @Desc: 分页查找列表
         * @author hjr
         * @since 2021-02-19
         */
        ResultUtil<Page<TransferListVo>>getList(PageDto pageDto, TransferKeyDto keyDto);

}