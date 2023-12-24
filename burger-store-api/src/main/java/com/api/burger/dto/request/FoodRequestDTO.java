package com.api.burger.dto.request;

import lombok.Data;

@Data
public class FoodRequestDTO {

    private String hamburger;
    private String drink;
    private String batata;
    //portions = porções
    private String portions;
    //sauces => molhos
    private String sauces;
}
