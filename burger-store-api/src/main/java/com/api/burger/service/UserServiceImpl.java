package com.api.burger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.api.burger.dto.request.UserRequestDTO;
import com.api.burger.dto.response.UserResponseDTO;
import com.api.burger.entity.User;
import com.api.burger.repository.UserRepository;
import com.api.burger.util.Mapper;

import lombok.RequiredArgsConstructor;

@Service
@Primary
// @RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    private Mapper mapper; 

    public UserServiceImpl(UserRepository userRepository, Mapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }
    
 
    @Override
    public UserResponseDTO register(UserRequestDTO userRequest) {
        // TODO Auto-generated method stub
        User user = mapper.toUser(userRequest);
        return mapper.toUserDTO(userRepository.save(user));
        
    }


    @Override
    public UserResponseDTO findById(Long id) {
        return mapper.toUserDTO(returnUser(id));
    }

    @Override
    public List<UserResponseDTO> findAll() {
        // TODO Auto-generated method stub
        return mapper.toUserDTO(userRepository.findAll());
    }


    @Override
    public UserResponseDTO update(Long id, UserRequestDTO userRequest) {
        // TODO Auto-generated method stub
        User user = returnUser(id);
        mapper.updataPersonData(user, userRequest);
        return mapper.toUserDTO(userRepository.save(user));
    }

    @Override
    public String delete(Long id) {
        // TODO Auto-generated method stub
        userRepository.deleteById(id);
        return "Usuário deletado, ID => " + id;
    }


    private User returnUser(Long id) {
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("Pessoa não encontrada"));
    }


}
