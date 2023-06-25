package com.shihri.springRest.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
public class ProductControllerTest {

    @Autowired
    MockMvc mockMvc;

    //@Test
    public void testProductControllerExistsOrNot() throws Exception {
       // mockMvc.perform(MockMvcRequestBuilders.get("/prodct")).andExpect()
    }

}