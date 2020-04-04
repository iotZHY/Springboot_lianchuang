package com.hebut.lianchuang.controller;

import com.hebut.lianchuang.dto.UserDTO;
import com.hebut.lianchuang.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Object login(@RequestBody UserDTO userDTO){
        return loginService.verify(userDTO);
    }
}
