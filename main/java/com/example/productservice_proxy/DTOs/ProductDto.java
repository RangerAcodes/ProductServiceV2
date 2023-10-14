package com.example.productservice_proxy.DTOs;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDto {
    private Long id;
    private String rating;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;

}
