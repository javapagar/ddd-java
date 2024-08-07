package es.javapagar.apps.mooc.controller.health_check;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(HealthCheckGetController.class)
final class HealthCheckGetControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHealthCheckGetController() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .get("/health-check")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}