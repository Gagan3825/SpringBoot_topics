package com.example.demo.controller.RediController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RedisLearn.RedisProduct;
import com.example.demo.services.RedisService.RedisServiceIml;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/pro")
public class Rediscontroller {
    @Autowired
    private RedisServiceIml redisServiceIml;

    @GetMapping("/{id}")
    public Optional<RedisProduct> getMethodName(@PathVariable String id) {
        return redisServiceIml.getDetailById(id);
    }
     
    @PostMapping
    public RedisProduct saveProduct(@RequestBody RedisProduct redisProduct) {
        
        
        return redisServiceIml.savRedisProduct(redisProduct);
    }
    
}
