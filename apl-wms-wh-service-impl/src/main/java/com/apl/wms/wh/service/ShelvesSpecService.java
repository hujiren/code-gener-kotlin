package com.apl.wms.wh.service;
import com.apl.common.utils.ResultUtils;

import com.apl.wms.wh.po.ShelvesSpecPo;
import com.apl.wms.wh.vo.ShelvesSpecListVo;
import com.apl.wms.wh.vo.ShelvesSpecInfoVo;
import com.apl.wms.wh.dto.ShelvesSpecKeyDto;
import com.baomidou.mybatisplus.extension.service.IService;
import com.apl.common.pojo.dto.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
 * <p>
 * 货架规格 服务类
 * </p>
 *
 * @author cy
 * @since 2019-12-11
 */
public interface ShelvesSpecService extends IService<ShelvesSpecPo> {

        /**
         * @Desc: 添加一个ShelvesSpecPo实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Integer> add(ShelvesSpecPo shelvesSpec);


        /**
         * @Desc: 根据id 更新一个ShelvesSpecPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> updById(ShelvesSpecPo shelvesSpec);


        /**
         * @Desc: 根据id 查找一个ShelvesSpecPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Boolean> delById(Integer id);


        /**
         * @Desc: 根据id 查找一个 ShelvesSpecPo 实体
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<ShelvesSpecInfoVo> selectById(Integer id);


        /**
         * @Desc: 分页查找 ShelvesSpecPo 列表
         * @author cy
         * @since 2019-12-11
         */
        ResultUtils<Page<ShelvesSpecListVo>>getList(PageDto pageDto, ShelvesSpecKeyDto keyDto);

}
