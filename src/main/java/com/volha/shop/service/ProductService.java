package com.volha.shop.service;

import com.volha.shop.model.Product;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *Created by olga on 09.05.2021
 */
public interface ProductService {
    List<Product> getAllProducts(int page, Sort.Direction sort);
}
