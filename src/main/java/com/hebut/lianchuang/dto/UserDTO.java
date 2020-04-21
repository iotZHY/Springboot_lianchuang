package com.hebut.lianchuang.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    private Long id;
    private String userName;
    private String password;
    private Integer type;
    private String email;
    private Date birthday;
    private String profession;
}
