package com.lh.seller.service;

import com.lh.api.ProductRpc;
import com.lh.api.domain.ProductRpcReq;
import com.lh.entity.Product;
import com.lh.entity.enums.ProductStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * 产品相关服务
 */
@Service
public class ProductRpcService {

    private static Logger LOG = LoggerFactory.getLogger(ProductRpcService.class);

    @Autowired
    ProductRpc productRpc;

    /**
     * 查询全部产品
     * @return
     */
    public List<Product> findAll(){
        ProductRpcReq req = new ProductRpcReq();
        List<String> status = new ArrayList<>();
        status.add(ProductStatus.IN_SELL.name());
        Pageable pageable = new PageRequest(0,1000,Sort.Direction.DESC,"rewardRate");
        req.setStatusList(status);
        LOG.info("rpc查询全部产品，请求:{}",req);
        List<Product> result = productRpc.query(req);
        LOG.info("rpc查询全部产品，结果:{}",result);
        return result;
    }

    @PostConstruct
    public void testFindAll(){
        findAll();
    }

}
