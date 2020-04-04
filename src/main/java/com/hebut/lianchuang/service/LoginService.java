package com.hebut.lianchuang.service;

import com.hebut.lianchuang.dao.User;
import com.hebut.lianchuang.dao.UserExample;
import com.hebut.lianchuang.dto.Code;
import com.hebut.lianchuang.dto.ResultDTO;
import com.hebut.lianchuang.dto.UserDTO;
import com.hebut.lianchuang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private UserMapper userMapper;

    public ResultDTO<User> verify(UserDTO userDTO) {
        UserExample example = new UserExample();
        example.createCriteria()
                .andUserNameEqualTo(userDTO.getUserName())
                .andPasswordEqualTo(userDTO.getPassword());
        List<User> users = userMapper.selectByExample(example);
        ResultDTO<User> resultDTO = new ResultDTO<>();
        if(users.size()!=0){
            resultDTO.setCode(Code.OK);
            resultDTO.setMessage("登录成功");
            resultDTO.setObject(users.get(0));
        }else{
            resultDTO.setCode(Code.ERROR);
            resultDTO.setMessage("登录失败");
        }

        return resultDTO;
    }
}
