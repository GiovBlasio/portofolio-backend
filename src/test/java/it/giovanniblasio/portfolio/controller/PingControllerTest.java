package it.giovanniblasio.portfolio.controller;

import it.giovanniblasio.portfolio.controller.PingController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

@WebMvcTest(PingController.class)
public class PingControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGetPing() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/v1/ping");
        ResultMatcher statusMatcher = MockMvcResultMatchers.status().isOk();
        ResultMatcher contentTypeMatcher = MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON);
        ResultMatcher jsonPathMatcher = MockMvcResultMatchers.jsonPath("$.data.timestamp").exists();
        ResultMatcher statusPathMatcher = MockMvcResultMatchers.jsonPath("$.data.status").value("UP");

        mockMvc.perform(requestBuilder)
                .andExpect(statusMatcher)
                .andExpect(contentTypeMatcher)
                .andExpect(jsonPathMatcher)
                .andExpect(statusPathMatcher);
    }
}
