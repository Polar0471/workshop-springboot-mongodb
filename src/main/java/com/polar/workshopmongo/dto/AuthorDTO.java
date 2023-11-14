package com.polar.workshopmongo.dto;

import java.io.Serializable;

import com.polar.workshopmongo.domain.User;

public class AuthorDTO implements Serializable {

    private static final Long serialVersionUID = 1L;
    
    private String id;
    private String name;

    public AuthorDTO() {
    }

    public AuthorDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
