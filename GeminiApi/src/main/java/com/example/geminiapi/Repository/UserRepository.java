package com.example.geminiapi.Repository;

import com.example.geminiapi.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel,String> {
}