package com.example.demo.services;

import com.example.demo.Repository.MongoRepo;
import com.example.demo.model.mongoUser.Productlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MongoServices {
    @Autowired
    public MongoRepo mongoRepo;

    public List<Productlist> getProductDetails(){
        return mongoRepo.findAll();
    }
    public Productlist getProductDetailsById(String id){
        return mongoRepo.findById(id).orElse(null);
    }
    public Productlist createProductDetails(Productlist productlist){
        return mongoRepo.save(productlist);
    }

    public String deleteProductDetails(String id){
        if(id!=null){
            mongoRepo.deleteById(id);
            return " Deleted";
        }
        return "user not found";

    }

    public Productlist updateProductDetails(String id, Productlist productlist){
        Optional<Productlist> p=mongoRepo.findById(id);
        if (p.isPresent()){
            Productlist existpro=p.get();

            if(productlist.getName()!=null){
                existpro.setName(productlist.getName());
            }
            if(productlist.getProductprize()>0){
                existpro.setProductprize(productlist.getProductprize());
            }
            return mongoRepo.save(existpro);
        }
        return null;
    }
}
