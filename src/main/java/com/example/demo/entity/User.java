package com.example.demo.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class User {
    private Integer id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}
