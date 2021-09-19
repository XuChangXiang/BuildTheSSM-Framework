package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
//值是String数组，可以写多个xml配置文件
@ContextConfiguration(locations = {"classpath:springmvc.xml","classpath:spring.xml"})
@WebAppConfiguration
public class WebTest {

    //声明一个模拟请求对象
    private MockMvc mockMvc;

    //需要一个web容器 上下文对象
    @Autowired
    private WebApplicationContext context;

    //前置方法
    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }


    @Test
    public void testLogin() throws Exception {
        MvcResult mvcResult = mockMvc.perform(
                MockMvcRequestBuilders.post("/test")
                        .param("username", "laoxu")
                        .param("password", "123")
        ).andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
    }
}
