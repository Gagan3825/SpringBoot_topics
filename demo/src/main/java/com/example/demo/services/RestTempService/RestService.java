package com.example.demo.services.RestTempService;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.ExternalApiInteg.PostModel;
import com.example.demo.template.RestTemp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RestService {
    private static final String url="https://jsonplaceholder.typicode.com/posts";
    @Autowired
    public RestTemplate restTemp;

    public List<PostModel> getAllPosts(){
      log.info("fetching all post",url);
      ResponseEntity<PostModel[]> res=restTemp.getForEntity(url, PostModel[].class);
      return Arrays.asList(res.getBody());
    }
    public PostModel getPostId(int userId){
        log.info("post details by id");
     return restTemp.getForObject(url + "/" + userId,PostModel.class);
    }
    public String deletebyId(int userId){  
      restTemp.delete(url + "/" + userId);
      return "Delete successfull";
    }
}
