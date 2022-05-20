package com.volha.shop.controller;

import com.volha.shop.dto.ProductDto;
import com.volha.shop.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.volha.shop.dto.ProductDtoMapper.mapToProductDtos;

/*
 *Created by olga on 07.05.2021
 */
@Api("ApiController for Products")
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    @ApiOperation(value = "This will get a list of products")
    public List<ProductDto> products(@RequestParam(required = false) Integer page, Sort.Direction sort){
        int pageNumber = page !=null && page >= 0 ? page : 0;
        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;
        return mapToProductDtos(productService.getAllProducts(pageNumber, sortDirection));
    }

    
}
