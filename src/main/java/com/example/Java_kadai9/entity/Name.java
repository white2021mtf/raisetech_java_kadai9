package com.example.Java_kadai9.entity;

public class Name {
    private  int id;
    private String name;


    /**
     * コンストラクタ
     */
    public Name(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * ゲッター
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}