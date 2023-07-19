package com.seesckzimp.demo.controller;

import com.seesckzimp.demo.entities.Departament;
import com.seesckzimp.demo.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @GetMapping
    public List<Product> getObjects() {
        Departament d1 = new Departament(1L, "Tech");
        Departament d2 = new Departament(2L, "Clothing");
        Departament d3 = new Departament(3L, "Sport");

        Product p1 = new Product(1L, "MacBook Pro", 3999.99, d1);
        Product p2 = new Product(2L, "PC Gamer", 5000.0, d1);
        Product p3 = new Product(3L, "long-sleeve shirt", 199.0, d2);
        Product p4 = new Product(4L, "Soccer ball", 100.0, d3);
        Product p5 = new Product(5L, "Charger", 215.50, d1);
        Product p6 = new Product(3L, "T-shirt", 150.0, d2);


        List<Product> list = Arrays.asList(p1, p2, p3, p4, p5, p6);

        return list;

    }
}
