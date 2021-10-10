package com.hc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hc.entity.UserDO;

import java.util.List;

/**
 * @author ：hc
 * @date ：Created in 2021/10/9 21:22
 * @modified ：
 */
public interface UserMapper extends BaseMapper<UserDO> {

    /**
     * 查询所有用户
     * @return 用户集合
     */
    List<UserDO> listUsers();
}
