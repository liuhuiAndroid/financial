package com.lh.manager.configuration;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImplExporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * rpc相关配置
 * https://github.com/briandilley/jsonrpc4j/wiki/JSON-RPC-for-Java-Client-&-Spring-Boot-(Server-example)
 */
@Configuration
public class RpcConfiguration {

    @Bean
    public AutoJsonRpcServiceImplExporter rpcServiceImplExporter(){
        return new AutoJsonRpcServiceImplExporter();
    }

}
