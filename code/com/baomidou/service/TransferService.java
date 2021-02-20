package com.apl.lms.air.transportation.service;

import com.apl.lms.air.transportation.pojo.po.TransferPo;
import com.apl.lms.air.transportation.pojo.vo.TransferListVo;
import com.apl.lms.air.transportation.pojo.vo.TransferInfoVo;
import com.apl.lms.air.transportation.pojo.dto.TransferKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
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
public interface TransferService extends IService<TransferPo> {

        /**
         * @Desc: 新增
         * @author hjr
         * @since 2021-02-19
         */
        ResultUtil<Long> add(TransferAddDto transferAddDto);


        /**
         * @Desc: 更新
         * @author hjr
         * @since 2021-02-19
         */
        ResultUtil<Boolean> updById(TransferUpdDto transferUpdDto);


        /**
         * @Desc: 删除
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
         * @Desc: 分页查找 Transfer列表
         * @author hjr
         * @since 2021-02-19
         */
        ResultUtil<Page<TransferListVo>>getList(PageDto pageDto, TransferKeyDto keyDto);

}