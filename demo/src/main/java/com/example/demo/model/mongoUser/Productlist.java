package com.example.demo.model.mongoUser;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "learnSpring")
public class Productlist {
  @Id
  public String id;
    public String name;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getProductprize() {
    return productprize;
  }

  public void setProductprize(int productprize) {
    this.productprize = productprize;
  }

  public int productprize;

    public Productlist(){};

    public void Productlist(String id, String name, int productprize){
      this.id=id;
      this.name=name;
      this.productprize=productprize;
    }


}
