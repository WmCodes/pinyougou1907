package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    public List<TbBrand> findOne() {
        return brandMapper.selectList();
    }

    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbBrand> page = (Page<TbBrand>) brandMapper.selectList();
        return new PageResult(page.getTotal(),page.getResult());
    }


}
