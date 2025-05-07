package com.shihri.springRest.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.awt.*;

@WebMvcTest(controllers = ProductController.class)
@AutoConfigureMockMvc(addFilters = false)
@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testProductControllerExistsOrNot() throws Exception {

        ResultActions resultActions=
                mockMvc
                        .perform(MockMvcRequestBuilders.get("/products/1")
                                .accept(MediaType.APPLICATION_JSON));
        MvcResult mvcResult=
                mockMvc
                .perform(MockMvcRequestBuilders.get("/products/1")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn();
        resultActions.andExpect(MockMvcResultMatchers.status().isOk());

        Assertions.assertEquals(200, mvcResult.getResponse().getStatus());
    }

}