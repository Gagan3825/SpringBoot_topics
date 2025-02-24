package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    List<User> li=new ArrayList<>();

    @GetMapping
    public List<User> getDetail(){
        return li;
    }

    @GetMapping("/{id}")
    public User get(@PathVariable int id){
        for (User u:li){
            if(u.getId()==id){
                return u;
            }
        }
        return null;

    }
    @PostMapping
    public String Useradd(@RequestBody User user){
        li.add(user);
        return "User added successfully";
    }

    @PutMapping("/{id}")
    public String updateUser(@RequestBody User user,@PathVariable int id){
        for(User u:li){
            if(u.getId()==id){
                u.setName(user.getName());
                u.setCollegeName(user.getCollegeName());
                return "user uppdated";
            }
        }
        return "user not found";
    }


    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        for(User u:li){
            if(u.getId()==id){
                li.remove(u);
                return "Data deleted";
            }
        }
         return "Not found";
    }


}
