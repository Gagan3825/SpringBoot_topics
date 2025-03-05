package com.example.demo.model.RedisLearn;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.io.Serializable;

@Data
@Document(collection = "product")

public class RedisProduct implements Serializable {
    private static final long serialVersionUID =1L;

    @Id
    public String id;
    public String pName;
    public String price;
}
