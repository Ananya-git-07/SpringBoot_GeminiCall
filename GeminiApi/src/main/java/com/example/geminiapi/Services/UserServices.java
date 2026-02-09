package com.example.geminiapi.Services;

import com.example.geminiapi.Model.UserModel;
import com.example.geminiapi.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    private final UserRepository repository;

    public UserServices(UserRepository repository) {
        this.repository = repository;
    }

    public UserModel createUser(UserModel user) {
        String response="This is the response from Gemini";
        user.setResponse(response);
        return repository.save(user);
    }

    public UserModel getUser(String id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("No user found"));
    }
}
