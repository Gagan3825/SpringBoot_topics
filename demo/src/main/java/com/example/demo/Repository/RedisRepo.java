package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.RedisLearn.RedisProduct;

public interface RedisRepo extends MongoRepository<RedisProduct,String> {
    
}
