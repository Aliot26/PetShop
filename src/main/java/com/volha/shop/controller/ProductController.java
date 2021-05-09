package com.volha.shop.controller;

import com.volha.shop.model.Product;
import com.volha.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Sort;

import java.util.List;

/*
 *Created by olga on 07.05.2021
 */
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> products(@RequestParam(required = false) int page, Sort.Direction sort){
        int pageNumber = page >= 0 ? page : 0;
        return productService.getAllProducts(pageNumber, sort);
    }
}
