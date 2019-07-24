package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/7/23
 * @desciption
 */
public interface BrandService {


    List<TbBrand> findOne();

    PageResult findPage(int pageNum,int pageSize);

}
