package com.volha.shop.dto;

import lombok.Builder;
import lombok.Setter;

/*
 *Created by olga on 09.05.2021
 */
@Setter
@Builder
public class ProductDto {
    private Long id;
    private String name;
    private Integer price;
}
