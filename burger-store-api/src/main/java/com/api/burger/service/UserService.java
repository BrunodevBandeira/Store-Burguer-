package com.api.burger.service;

import java.util.List;

import com.api.burger.dto.request.UserRequestDTO;
import com.api.burger.dto.request.FoodRequestDTO;

import com.api.burger.dto.response.UserResponseDTO;
import com.api.burger.dto.response.FoodResponseDTO;


public interface UserService {
       // RESPONSE => respostas do banco
    //REQUEST => Dados que estão sendo enviados

    // user
    UserResponseDTO findById(Long id);
    List<UserResponseDTO> findAll();
    UserResponseDTO register(UserRequestDTO userRequest);
    UserResponseDTO update(Long id, UserRequestDTO userREquest);
    String delete(Long id);

    // Food
    // FoodResponseDTO findByIdFood(Long id);
    // List<FoodResponseDTO> findAllFood();
    // FoodResponseDTO register(FoodRequestDTO foodREquest);
    // FoodResponseDTO update(Long id, FoodRequestDTO foodREquest);
    // String deleteFood(Long id);

}
