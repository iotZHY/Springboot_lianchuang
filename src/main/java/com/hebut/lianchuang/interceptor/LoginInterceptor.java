package com.hebut.lianchuang.interceptor;

import com.hebut.lianchuang.dao.User;
import com.hebut.lianchuang.dao.UserExample;
import com.hebut.lianchuang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 允许客户端携带跨域cookie
        // 当Access-Control-Allow-Credentials设为true的时候，Access-Control-Allow-Origin不能设为星号
        response.setHeader("Access-Control-Allow-Credentials", "true");
        // 允许指定域访问跨域资源
        //response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Origin", "*");// *
        // 允许浏览器发送的请求消息头
        response.setHeader("Access-Control-Allow-Headers", request.getHeader("Access-Control-Request-Headers"));// *
        // 允许浏览器在预检请求成功之后发送的实际请求方法名
        response.setHeader("Access-Control-Allow-Methods", request.getHeader("Access-Control-Request-Method"));
        // 设置响应数据格式
        response.setHeader("Content-Type", "application/json");

        String token = request.getHeader("Authorization");
        if(token!=null){
            UserExample example = new UserExample();
            example.createCriteria().andTokenEqualTo(token);
            List<User> users = userMapper.selectByExample(example);
            if(users.size()==0){
                request.getSession().setAttribute("user",null);
            }else {
                request.getSession().setAttribute("user",users.get(0));
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
