package com.example.demo.Repository;

import com.example.demo.model.mongoUser.Productlist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepo extends MongoRepository<Productlist,String> {
}
