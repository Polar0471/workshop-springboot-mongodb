package com.polar.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.polar.workshopmongo.domain.User;

// MongoRepository<a, b>
// a -> tipo da classe de domínio que ele vai gerenciar
// b -> tipo do 'id' da classe
@Repository
public interface UserRepository extends MongoRepository<User, String> {

    
    
}