package com.hc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


/**
 * 基础测试类
 * @author ：hc
 * @date ：Created in 2021/10/10 17:51
 * @modified ：
 */
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class BaseTest {

    protected MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setup() {
        // 每次测接口都要检查状态码是否为200以及打印请求结果
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac)
                .alwaysExpect(MockMvcResultMatchers.status().isOk())
                .alwaysDo(MockMvcResultHandlers.print())
                .build();
    }

}
