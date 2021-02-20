package com.apl.lms.air.transportation.mapper;

import com.apl.lms.air.transportation.pojo.po.TransferPo;
import com.apl.lms.air.transportation.pojo.vo.TransferListVo;
import com.apl.lms.air.transportation.pojo.vo.TransferInfoVo;
import com.apl.lms.air.transportation.pojo.dto.TransferKeyDto;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋, Mapper 接口
 * </p>
 *
 * @author hjr
 * @since 2021-02-19
 */
@Repository
public interface TransferMapper extends BaseMapper<TransferPo> {

    /**
     * @Desc: 根据id 查找详情
     * @Author: ${cfg.author}
     * @Date: 2021-02-19
     */
     TransferInfoVo getById(@Param("id") Long id);

    /**
     * @Desc: 查找列表
     * @Author: ${cfg.author}
     * @Date: 2021-02-19
     */
    List<TransferListVo> getList(Page page,@Param("key") TransferKeyDto keyDto);


        }