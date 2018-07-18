package com.lh.seller.configuration;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcClientProxyCreator;
import com.lh.api.ProductRpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * rpc 相关配置
 * https://github.com/briandilley/jsonrpc4j/wiki/JSON-RPC-for-Java-Client-&-Spring-Boot-(Client-example)
 */
@Configuration
// 接口需要扫描进来
@ComponentScan(basePackageClasses = {ProductRpc.class})
public class RpcConfiguration {

    private static Logger LOG = LoggerFactory.getLogger(RpcConfiguration.class);

    @Bean
    public AutoJsonRpcClientProxyCreator rpcClientProxyCreator(@Value("${rpc.manager.url}") String url) {
        AutoJsonRpcClientProxyCreator creator = new AutoJsonRpcClientProxyCreator();
        try {
            creator.setBaseUrl(new URL(url));
        } catch (MalformedURLException e) {
            LOG.error("创建rpc服务地址错误");
            e.printStackTrace();
        }
        creator.setScanPackage(ProductRpc.class.getPackage().getName());
        return creator;
    }

}
