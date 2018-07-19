package com.lh.seller.controller;

import com.lh.api.events.ProductStatusEvent;
import com.lh.entity.Product;
import com.lh.entity.enums.ProductStatus;
import com.lh.seller.service.ProductRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private static Logger LOG = LoggerFactory.getLogger(ProductController.class);
    private static final String MQ_DESTINATION = "Consumer.cache.VirtualTopic.PRODUCT_STATUS";

    @Autowired
    ProductRpcService productRpcService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Product findOne(@PathVariable String id){
        return productRpcService.findOne(id);
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Product> findAll(){
        return productRpcService.findAll();
    }

    @Autowired
    private JmsTemplate jmsTemplate;

    public void changeStatus(String id, ProductStatus status){
        ProductStatusEvent event = new ProductStatusEvent(id,status);
        LOG.info("send message:{}",event);
        jmsTemplate.convertAndSend(MQ_DESTINATION,event);
    }

    /**
     * 测试active-mq
     * @return
     */
    @RequestMapping(value = "/testMq",method = RequestMethod.GET)
    public void testMq(){
        changeStatus("T001",ProductStatus.IN_SELL);
    }

}
