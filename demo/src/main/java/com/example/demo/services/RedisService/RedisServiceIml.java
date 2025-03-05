package com.example.demo.services.RedisService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.RedisRepo;
import com.example.demo.model.RedisLearn.RedisProduct;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RedisServiceIml {
    
    @Autowired
    private RedisRepo redisRepo;

    @Cacheable(value = "product",key = "#id")
    public Optional<RedisProduct> getDetailById(String id){
        log.info("Data is fetching");
        Optional<RedisProduct> li=redisRepo.findById(id);
        return li;
    }

    public RedisProduct  savRedisProduct(RedisProduct pRedisProduct){
        return redisRepo.save(pRedisProduct);
    }
}
