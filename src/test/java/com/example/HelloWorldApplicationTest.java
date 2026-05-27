package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testApplicationStarts() {
        // Si llega aquí sin excepciones, la aplicación inició correctamente
        assert true;
    }

    @Test
    public void testHelloWorldEndpointIntegration() throws Exception {
        mockMvc.perform(get("/api/hello-world"))
                .andExpect(status().isOk())
                .andExpect(content().string("¡Hola Mundo! Bienvenido a la API REST con Spring Boot"));
    }

    @Test
    public void testHelloWorldEndpointStatusCode() throws Exception {
        mockMvc.perform(get("/api/hello-world"))
                .andExpect(status().is(200));
    }

}