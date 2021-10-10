package com.hc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hc.entity.UserDO;

import java.util.List;

/**
 * @author ：hc
 * @date ：Created in 2021/10/9 21:34
 * @modified ：
 */
public interface UserService extends IService<UserDO> {

    /**
     * 查询所有用户信息
     * @return 用户集合
     */
    List<UserDO> listUsers();
}
