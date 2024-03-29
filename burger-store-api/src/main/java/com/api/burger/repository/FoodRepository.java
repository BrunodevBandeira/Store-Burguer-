package com.api.burger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.burger.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
