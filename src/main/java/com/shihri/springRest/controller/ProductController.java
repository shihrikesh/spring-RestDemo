package com.shihri.springRest.controller;


import com.shihri.springRest.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class ProductController {

    @GetMapping(value = "/products/{id}", produces = "Application/json")
    public ResponseEntity<Object> getProducts(@PathVariable String id) {

        if (!Objects.equals(id, "1")) throw new ProductNotFoundException();
        return new ResponseEntity<>("Product is " + id, HttpStatus.OK);
    }
}
