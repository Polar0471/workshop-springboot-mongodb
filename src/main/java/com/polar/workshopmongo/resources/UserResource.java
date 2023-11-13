package com.polar.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.polar.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User paulo = new User("1", "Paulo Cavalcante", "paulo@gmail.com");
        User joel = new User("2", "Joel Bragança", "joel@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(paulo, joel));
        return ResponseEntity.ok().body(list);
    }


}
