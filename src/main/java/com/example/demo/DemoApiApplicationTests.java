package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.mock.web.MockRequestDispatcher;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class DemoApiApplicationTests {

    @Test
    public void getRequestShouldReturn_ok_200(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/demo"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void postRequestShouldReturn_ok_200(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/demo")
                .content("{\"name\": \"demo\"}"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void putRequestShouldReturn_notAllowed_405(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/api/demo/1")
                .content("{\"name\": \"demo\"}"))
                .andExpect(MockMvcResultMatchers.status().isMethodNotAllowed());
    }

    @Test
    public void deleteRequestShouldReturn_nowAllowed_405(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/demo/1")
                .content("{\"name\": \"demo\"}"))
                .andExpect((MockMvcResultMatchers.status().isMethodNotAllowed()));
    }

    @Test
    public void patchRequestShouldReturn_notAllowed_405(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.patch("/api/demo/1")
                .content("{\"name\": \"demo\"}"))
                .andExpect(MockMvcResultMatchers.status().isMethodNotAllowed());
    }

    @Test
    public void optionsRequestShouldReturn_notAllowed_405(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.options(("/api/demo"))
                .content("{\"name\": \"demo\"}"))
                .andExpect(MockMvcResultMatchers.status().isMethodNotAllowed());
    }

}
