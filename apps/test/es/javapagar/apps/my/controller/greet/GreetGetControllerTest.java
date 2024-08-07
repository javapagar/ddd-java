package es.javapagar.apps.my.controller.greet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GreetGetController.class)
final class GreetGetControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void callGreetGetController() throws Exception {
        String name = "Javi";
        String expect_greeting = "hello "+ name;
        mockMvc.perform(MockMvcRequestBuilders
                .get("/greet/"+name))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.greeting").value(expect_greeting));;
    }
}