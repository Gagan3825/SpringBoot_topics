package com.example.demo.controller.mongocontroller;

import com.example.demo.model.mongoUser.Productlist;
import com.example.demo.services.MongoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productDetails")
public class ProdutController {
    @Autowired
    private MongoServices mongoServices;
  @GetMapping
    public ResponseEntity<List<Productlist>> getproDetails(){
      List<Productlist> list=mongoServices.getProductDetails();
      return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
  }
  @GetMapping("/{id}")
  public ResponseEntity<Productlist> getprobyid(@PathVariable String id){
    Productlist list=mongoServices.getProductDetailsById(id);
    return (list != null) ? ResponseEntity.ok(list) : ResponseEntity.notFound().build();


  }
  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteByid(@PathVariable String id){
   String res= mongoServices.deleteProductDetails(id);
    return (res != null) ? ResponseEntity.ok(res) : ResponseEntity.notFound().build();
  }

  @PostMapping
    public ResponseEntity<Productlist> create(@RequestBody Productlist pro){
      Productlist createlist=mongoServices.createProductDetails(pro);
      return  new ResponseEntity<>(createlist, HttpStatus.CREATED);
  }
  @PatchMapping("/{id}")
  public ResponseEntity<Productlist> update(@PathVariable String id,@RequestBody Productlist pro){
    Productlist p=mongoServices.updateProductDetails(id,pro);
    return p != null ? ResponseEntity.ok(p) : ResponseEntity.notFound().build();


  }
}
