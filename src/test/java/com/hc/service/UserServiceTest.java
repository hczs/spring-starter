package com.hc.service;

import com.hc.BaseTest;
import com.hc.entity.UserDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * @author ：hc
 * @date ：Created in 2021/10/10 18:30
 * @modified ：
 */
public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void listUsersTest() {
        List<UserDO> userDOS = userService.listUsers();
        System.out.println(userDOS);
        assertTrue("[UserService.listUsers]查询所有用户测试", true);
    }
}
