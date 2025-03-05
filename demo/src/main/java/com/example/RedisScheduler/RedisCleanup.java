package com.example.RedisScheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RedisCleanup {
    @Autowired
    private CacheManager cacheManager;

    @Scheduled(fixedRate = 3600000)
    public void cleanup(){
        log.info("Clearing Redis cache...");
        cacheManager.getCache("product").clear();
    }
}
