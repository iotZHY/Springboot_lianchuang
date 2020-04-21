package com.hebut.lianchuang.service;

import com.github.pagehelper.PageHelper;
import com.hebut.lianchuang.dao.User;
import com.hebut.lianchuang.dao.UserExample;
import com.hebut.lianchuang.dto.Code;
import com.hebut.lianchuang.dto.ResultDTO;
import com.hebut.lianchuang.dto.UserDTO;
import com.hebut.lianchuang.mapper.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired private UserMapper userMapper;

    public ResultDTO<UserDTO> getUserPage(int page,int size){
        PageHelper.startPage(page, size);
        List<User> users = userMapper.selectByExample(new UserExample());
        Long num = userMapper.countByExample(new UserExample());
        ResultDTO<UserDTO> resultDTO = new ResultDTO<>();
        resultDTO = userDTOResultDTO(users);
        resultDTO.setNum(num);
        return resultDTO;

    }

    public ResultDTO<UserDTO> getUserByName(String query) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameLike(query);
        List<User> users = userMapper.selectByExample(example);
        return userDTOResultDTO(users);
    }

    private ResultDTO<UserDTO> userDTOResultDTO(List<User> users){
        ResultDTO<UserDTO> resultDTO = new ResultDTO<>();
        if(users.size()>0){
            List<UserDTO> userDTOS = new ArrayList<>();
            resultDTO.setCode(Code.OK);
            resultDTO.setMessage("获得用户列表成功");
            for(User user:users){
                UserDTO userDTO = new UserDTO();
                BeanUtils.copyProperties(user,userDTO);
                userDTOS.add(userDTO);
            }

            resultDTO.setList(userDTOS);
        }else {
            resultDTO.setCode(Code.ERROR);
            resultDTO.setMessage("获得用户列表失败");
        }
        return resultDTO;
    }

    public ResultDTO<UserDTO> addUser(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(userDTO.getUserName());
        List<User> users = userMapper.selectByExample(example);
        ResultDTO<UserDTO> resultDTO = new ResultDTO<>();
        if(users.size()==0){
            userMapper.insertSelective(user);
            resultDTO.setCode(Code.OK);
        }else{
            resultDTO.setCode(Code.ERROR);
        }
        return resultDTO;
    }

    public ResultDTO<UserDTO> removeUser(long id) {
        ResultDTO<UserDTO> resultDTO = new ResultDTO<>();
        if(userMapper.deleteByPrimaryKey(id)==0){
            resultDTO.setCode(Code.ERROR);
        }else {
            resultDTO.setCode(Code.OK);
        }
        return resultDTO;
    }

    public ResultDTO<UserDTO> getUserById(Long id) {
        ResultDTO<UserDTO> resultDTO = new ResultDTO<>();
        UserDTO userDTO = new UserDTO();
        User user = userMapper.selectByPrimaryKey(id);
        if (user!=null){
            BeanUtils.copyProperties(user,userDTO);
            resultDTO.setObject(userDTO);
            resultDTO.setCode(Code.OK);
        }else {
            resultDTO.setCode(Code.ERROR);
        }
        return resultDTO;
    }

    public ResultDTO<UserDTO> editUser(UserDTO userDTO) {
        ResultDTO<UserDTO> resultDTO = new ResultDTO<>();
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);
        if(userMapper.updateByPrimaryKeySelective(user)==0){
            resultDTO.setCode(Code.ERROR);
        }else{
            resultDTO.setCode(Code.OK);
        }
        return resultDTO;
    }
}
