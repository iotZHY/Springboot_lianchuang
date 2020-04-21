package com.hebut.lianchuang.controller;

import com.hebut.lianchuang.dto.UserDTO;
import com.hebut.lianchuang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/user/get")
    public Object getUsers(@RequestParam("pagenum") int page,
                           @RequestParam("pagesize") int size,
                           @RequestParam("query") String query
    ){
        if(query != null && query != "")
            return userService.getUserByName(query);
        else
            return userService.getUserPage(page,size);
    }

    @ResponseBody
    @GetMapping("/user/get/{id}")
    public Object getUserById(@PathVariable(name="id") Long id){
        return userService.getUserById(id);
    }


    @ResponseBody
    @PostMapping("/user/add")
    public Object addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }

    @ResponseBody
    @GetMapping("/user/remove/{id}")
    public Object removeUser(@PathVariable(name = "id") long id){
        return userService.removeUser(id);
    }

    @ResponseBody
    @PutMapping("/user/edit/{id}")
    public Object editUser(@RequestBody UserDTO userDTO,
                           @PathVariable(name = "id") Long id){
        userDTO.setId(id);
        return userService.editUser(userDTO);
    }
}
