package com.javatechie.spring.mongo.api.repository;

import com.javatechie.spring.mongo.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRespository extends MongoRepository<User, Integer>{

}
