package com.api.burger.service;

import java.util.List;

import com.api.burger.dto.request.UserRequestDTO;
import com.api.burger.dto.response.UserResponseDTO;

public interface UserService {
       // RESPONSE => respostas do banco
    //REQUEST => Dados que estão sendo enviados


    UserResponseDTO findById(Long id);

    List<UserResponseDTO> findAll();

    UserResponseDTO register(UserRequestDTO userREquest);

    UserResponseDTO update(Long id, UserRequestDTO userREquest);

    String delete(Long id);
}
