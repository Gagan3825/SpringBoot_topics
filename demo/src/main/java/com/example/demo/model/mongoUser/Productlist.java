package com.example.demo.model.mongoUser;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "learnSpring")
@Data
public class Productlist {
  @Id
  public String id;
  public String name;
  public int productprize;

}
