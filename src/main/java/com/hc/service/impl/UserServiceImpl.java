package com.hc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hc.entity.UserDO;
import com.hc.mapper.UserMapper;
import com.hc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：hc
 * @date ：Created in 2021/10/9 21:35
 * @modified ：
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDO> listUsers() {
        return userMapper.listUsers();
    }
}
