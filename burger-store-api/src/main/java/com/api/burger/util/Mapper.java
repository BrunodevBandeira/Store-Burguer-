package com.api.burger.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.burger.dto.request.UserRequestDTO;
import com.api.burger.dto.response.UserResponseDTO;
import com.api.burger.entity.User;

@Component
public class Mapper {
    public User toUser(UserRequestDTO userDTO) {
        return User.builder()
                .name(userDTO.getName())
                .cpf(userDTO.getCpf())
                .email(userDTO.getEmail())
                .build();
                
    }

    public UserResponseDTO toUserDTO(User user) {
        return new UserResponseDTO(user);
    }


    public List<UserResponseDTO> toUserDTO(List<User> userList) {
        // toPeopleDTO: Converte uma lista de objetos Person em uma lista de PersonResponseDTO.
        return userList.stream().map(UserResponseDTO::new).collect(Collectors.toList());
    }

    public void updataPersonData(User user, 
    UserRequestDTO userDTO) {
        // updatePersonData: Atualiza os dados de um objeto Person com base nos dados fornecidos em um objeto PersonRequestDTO.
        user.setName(userDTO.getName());
        user.setCpf(userDTO.getCpf());
        user.setEmail(userDTO.getEmail());
        // user.setBirthdate(userDTO.setBirthda());
    }


}
