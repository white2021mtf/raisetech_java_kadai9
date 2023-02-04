package com.example.Java_kadai9.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameMapper {
    /**
     * Nameを全て取得する
     * @return Nameリスト
     */
    @Select("SELECT name FROM names")
    List<String> findAll();
}
