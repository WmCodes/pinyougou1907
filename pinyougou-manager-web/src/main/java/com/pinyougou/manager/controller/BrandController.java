package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/7/23
 * @desciption
 */
@RestController
@RequestMapping("brand")
public class BrandController {


    @Reference
    private BrandService brandService;


    @RequestMapping("findOne")
    public List<TbBrand> findOne(){
        return brandService.findOne();
    }
}
