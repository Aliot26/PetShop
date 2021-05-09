package com.volha.shop.service.impl;

import com.volha.shop.model.Product;
import com.volha.shop.repository.ProductRepository;
import com.volha.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *Created by olga on 09.05.2021
 */
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private static final int PAGE_SIZE = 2;
    private final ProductRepository productRepository;


    @Override
    public List<Product> getAllProducts(int page, Sort.Direction sort) {
        return productRepository.findAllProduct(
                PageRequest.of(page, PAGE_SIZE, Sort.by(sort, "id")));
    }
}
