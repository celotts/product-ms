package com.celotts.productms.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping
    public List<String> getAll() {
        return List.of("Taco", "Quesadilla");
    }
}