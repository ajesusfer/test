package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloWorldEndpoint() throws Exception {
        mockMvc.perform(get("/api/hello-world"))
                .andExpect(status().isOk())
                .andExpect(content().string("¡Hola Mundo! Bienvenido a la API REST con Spring Boot"));
    }

    @Test
    public void testHelloWorldEndpointReturnsString() throws Exception {
        mockMvc.perform(get("/api/hello-world"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=UTF-8"));
    }

    @Test
    public void testHelloWorldEndpointNotEmpty() throws Exception {
        mockMvc.perform(get("/api/hello-world"))
                .andExpect(status().isOk())
                .andExpect(content().string(org.hamcrest.Matchers.not("")));
    }

}