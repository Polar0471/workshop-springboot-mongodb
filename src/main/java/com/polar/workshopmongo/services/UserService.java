package com.polar.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polar.workshopmongo.domain.User;
import com.polar.workshopmongo.dto.UserDTO;
import com.polar.workshopmongo.repository.UserRepository;
import com.polar.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
    
    // instanciando automaticamente um objeto UserRepository
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insertUser(User obj) {
        return repo.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }

    // vai pegar um dto e instanciar um usuário
    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}
