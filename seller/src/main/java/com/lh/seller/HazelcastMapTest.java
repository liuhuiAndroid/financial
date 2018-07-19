package com.lh.seller;

import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * Hazelcast 测试
 */
@Component
public class HazelcastMapTest {

    @Autowired
    HazelcastInstance hazelcastInstance;

//    @PostConstruct
    public void put(){
        Map map = hazelcastInstance.getMap("financial");
        map.put("name","financial");
    }
}
