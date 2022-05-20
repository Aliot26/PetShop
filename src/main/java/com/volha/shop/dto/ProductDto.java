package com.volha.shop.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/*
 *Created by olga on 09.05.2021
 */
@Getter
@Builder
public class ProductDto {
    private long id;
    private String name;
    private Integer price;
}
