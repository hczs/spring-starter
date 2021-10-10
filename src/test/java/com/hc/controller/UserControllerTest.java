package com.hc.controller;

import com.hc.BaseTest;
import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertTrue;

/**
 * @author ：hc
 * @date ：Created in 2021/10/10 17:54
 * @modified ：
 */
public class UserControllerTest extends BaseTest {

    @Test
    public void listUsersTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/user/list"));
        assertTrue("[/user/list]查询所有用户测试", true);
    }
}
