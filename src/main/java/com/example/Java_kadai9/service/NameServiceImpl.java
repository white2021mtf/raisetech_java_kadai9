package com.example.Java_kadai9.service;

import com.example.Java_kadai9.mapper.NameMapper;
import com.example.Java_kadai9.entity.Name;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public  class NameServiceImpl implements NameService {
    private final NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @Override
    public List<String> findAll() {
        return nameMapper.findAll();
    }
}
