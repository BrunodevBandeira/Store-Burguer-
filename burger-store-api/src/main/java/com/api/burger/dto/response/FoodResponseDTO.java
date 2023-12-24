package com.api.burger.dto.response;

import com.api.burger.entity.Food;

// RESPONSE => respostas do banco
public class FoodResponseDTO {

    
    private Long user_id;
    private String hamburger;
    private String drink;
    private String batata;
    //portions = porções
    private String portions;
    //sauces => molhos
    private String sauces;

    public FoodResponseDTO(Food food) {
        this.user_id = food.getUser_id();
        this.hamburger = food.getHamburger();
        this.drink = food.getDrink();
        this.batata = food.getBatata();
        this.portions = food.getPortions();
        this.sauces = food.getSauces();
    }
}
