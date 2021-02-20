package com.apl.lms.air.transportation.dao;

import com.apl.lib.pojo.dto.PageDto;
import lombok.extern.slf4j.Slf4j;

import com.apl.lms.air.transportation.TransferMapper;
import com.apl.lms.air.transportation.pojo.po.TransferPo;
import com.apl.lms.air.transportation.pojo.vo.TransferListVo;
import com.apl.lms.air.transportation.pojo.vo.TransferInfoVo;
import com.apl.lms.air.transportation.pojo.dto.TransferKeyDto;

import java.util.List;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Repository;


/**
 * <p>
 * 转运信息  批次Id大于0 只可修改提单号到实际到达时间, 如果批次id等于0, 则全部可以修改
    	待出货界面点击保存,生成批次id , 才能点击装袋, dao实现类
 * </p>
 *
 * @author hjr
 * @since 2021-02-19
 */
@Repository
@Slf4j
public class TransferDao extends ServiceImpl<TransferMapper, TransferPo> {


    public Long add(TransferAddDto transferAddDto){

        Integer resultInteger = baseMapper.insert(transferPo);

        return resultInteger;
    }


    public Integer updById(TransferUpdDto transferUpdDto){

        Integer resultInteger = baseMapper.updateById(transferPo);

        return resultInteger;
    }


    public Integer delById(Long id){

        Integer resultInteger = baseMapper.deleteById(id);

        return resultInteger;
    }


    public TransferInfoVo selectById(Long id){

        TransferInfoVo transferInfoVo = baseMapper.getById(id);

        return transferInfoVo;
    }


    public Page<TransferListVo> getList(PageDto pageDto, TransferKeyDto keyDto){

        Page<TransferListVo> page = new Page();
        page.setCurrent(pageDto.getPageIndex());
        page.setSize(pageDto.getPageSize());

        List<TransferListVo> list = baseMapper.getList(page , keyDto);
        page.setRecords(list);

        return page;
    }


}