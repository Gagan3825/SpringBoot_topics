package com.example.demo.controller.ExternalController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ExternalApiInteg.PostModel;
import com.example.demo.services.RestTempService.RestService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/post")
public class ExternalApi {
    @Autowired
    private RestService restService;

    @GetMapping("/posts")
    public List<PostModel> getPosts(){
        return restService.getAllPosts();
    }
    @GetMapping("/posts/{id}")
    public PostModel getMethodName(@PathVariable int id) {
        return restService.getPostId(id);
    }
    @DeleteMapping("/posts/{id}")
    public String deletebyid(@PathVariable int id){
        return restService.deletebyId(id);
    }
    

}
