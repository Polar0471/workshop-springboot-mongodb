package com.polar.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polar.workshopmongo.domain.User;
import com.polar.workshopmongo.repository.UserRepository;

@Service
public class UserService {
    
    // instanciando automaticamente um objeto UserRepository
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

}
