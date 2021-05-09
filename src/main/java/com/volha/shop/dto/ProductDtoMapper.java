package com.volha.shop.dto;

import com.volha.shop.model.Product;

import java.util.List;
import java.util.stream.Collectors;

/*
 *Created by olga on 09.05.2021
 */
public class ProductDtoMapper {

    private ProductDtoMapper() {
    }

    public static List<ProductDto> mapToProductDtos(List<Product> products){
        return products.stream()
                .map(product -> mapToProductDto(product))
                .collect(Collectors.toList());
    }

    private static ProductDto mapToProductDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
