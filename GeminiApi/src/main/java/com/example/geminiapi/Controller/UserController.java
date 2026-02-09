package com.example.geminiapi.Controller;

import com.example.geminiapi.Model.UserModel;
import com.example.geminiapi.Services.UserServices;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
public class UserController {
    private final UserServices service;
    public UserController(UserServices service){
        this.service = service;
    }
    @PostMapping("/create-user")
    public UserModel createUser(@RequestBody UserModel student){
        return service.createUser(student);
    }
    @GetMapping("/get-user/{id}")
    public UserModel getUser(@PathVariable String id){
        return service.getUser(id);
    }
}
