package com.lh.seller.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 签名服务
 */
@Service
public class SignService {

    static Map<String,String> PUBLIC_KEYS = new HashMap<>();
    static {
        PUBLIC_KEYS.put("1000","MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCiqvcJQROuAmoiNQEkY0rlhaBQ\n" +
                "JqcZqdbkvhsHp5irrwvoesFKvoXELLVaS0tPyL8u5I5wfzYgr9OCjKWNZgst5Ctn\n" +
                "1V7JJp+m9xUUA+TyO2SU5Rpr5NRvYH3OZeIgBXMERGbzNZkeoLBWAq7lgQDgf9jG\n" +
                "joGFbS2VpmzuoN5yPwIDAQAB");
    }

    /**
     * 根据授权编号获取公钥
     * @param authId
     * @return
     */
    public String getPublicKey(String authId){
        return PUBLIC_KEYS.get(authId);
    }

}
