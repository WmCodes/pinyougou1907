package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangmeng
 * @date 2019/7/23
 * @desciption
 */
@Service
public class BranServiceImpl implements BrandService {


    @Autowired
    private TbBrandMapper brandMapper;

    @Override
    public TbBrand findOne() {
        return brandMapper.selectByPrimaryKey(1L);
    }


}
