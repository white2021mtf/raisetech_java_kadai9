package com.example.Java_kadai9.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.lang.model.element.Name;
import java.util.*;
@Mapper
public interface NameMapper {
    @Select("SELECT * FROM names")
    List<Name>findAll();

    @Select("SELECT * FROM names WHERE id = #{id}")
    Optional<Name>findById(int id);
}