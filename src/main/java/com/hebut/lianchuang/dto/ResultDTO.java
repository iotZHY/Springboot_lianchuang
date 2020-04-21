package com.hebut.lianchuang.dto;

import lombok.Data;

import java.util.List;
@Data
public class ResultDTO<T>{
    private Integer code;
    private String message;
    private List<T> list;
    private T object;
    private Long num;
}
