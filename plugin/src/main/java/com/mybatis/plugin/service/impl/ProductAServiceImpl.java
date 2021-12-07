package com.mybatis.plugin.service.impl;

import com.mybatis.plugin.generator.model.ProductA;
import com.mybatis.plugin.generator.mapper.ProductAMapper;
import com.mybatis.plugin.service.IProductAService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yaofeihu
 * @since 2021-12-07
 */
@Service
public class ProductAServiceImpl extends ServiceImpl<ProductAMapper, ProductA> implements IProductAService {

}
