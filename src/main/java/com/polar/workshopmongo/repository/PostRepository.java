package com.polar.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.polar.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    
    // esquema de query methods
    List<Post> findByTitleContainingIgnoreCase(String text);

}
