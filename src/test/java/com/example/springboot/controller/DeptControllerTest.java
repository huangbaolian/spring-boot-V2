package com.example.springboot.controller;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class DeptControllerTest {
    @Autowired
    private WebApplicationContext wac;
    @Autowired
    private MockMvc mvc;
    private MockHttpSession session;

    @Before
    public void setupMockMvc(){
        mvc = MockMvcBuilders.webAppContextSetup(wac).build(); //初始化MockMvc对象
    }

    @Test
    void getDepartment() throws Exception {

        MvcResult mvcResult= mvc.perform(MockMvcRequestBuilders.get("/getDept/1")
                .param("id","1")
                .accept(MediaType.APPLICATION_JSON)
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        int status=mvcResult.getResponse().getStatus();
        String content=mvcResult.getResponse().getContentAsString();
        System.out.println("++++"+status);
        System.out.println("++++"+content);
    }

    @Test
    void insertDepartment() throws Exception {
        MvcResult mvcResult= mvc.perform(MockMvcRequestBuilders.get("/deptInsert")
                .param("id","5")
                .param("departmentName","Spring")
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        int status=mvcResult.getResponse().getStatus();
        String content=mvcResult.getResponse().getContentAsString();
        System.out.println("++++"+status);
        System.out.println("++++"+content);
    }

    @Test
    void deleteDepartment() throws Exception {
        MvcResult mvcResult= mvc.perform(MockMvcRequestBuilders.get("/deptDelete/8")
                //.param("id","8")
                .accept(MediaType.APPLICATION_JSON)
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        int status=mvcResult.getResponse().getStatus();
        String content=mvcResult.getResponse().getContentAsString();
        System.out.println("++++"+status);
        System.out.println("++++"+content);
    }

    @Test
    void updateDepartment() throws Exception {
        MvcResult mvcResult= mvc.perform(MockMvcRequestBuilders.get("/deptUpdate")
                .param("id","9")
                .param("departmentName","Spring1")
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        int status=mvcResult.getResponse().getStatus();
        String content=mvcResult.getResponse().getContentAsString();
        System.out.println("++++"+status);
        System.out.println("++++"+content);
    }
}