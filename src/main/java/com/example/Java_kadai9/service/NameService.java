package com.example.Java_kadai9.service;
import org.springframework.boot.context.properties.bind.Name;

import java.util.List;

public  interface NameService {
    List<String> findAll();
//    List<Name> findAll();
//    Name findById(int id)throws Exception;
//    void create(String name);
//    void update(int id, String name)throws Exception;
}

