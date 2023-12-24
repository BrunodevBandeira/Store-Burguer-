package com.api.burger.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.api.burger.dto.request.UserRequestDTO;
import com.api.burger.dto.response.UserResponseDTO;
import com.api.burger.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/burguer")
@RequiredArgsConstructor
public class UserController {
    

    private final UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserResponseDTO> findByID(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> register (@RequestBody UserRequestDTO userRequestDTO, UriComponentsBuilder uriBuilder) {
        System.out.println("=> userRequestDTO " + userRequestDTO);
        System.out.println("==> uriBuilder " + uriBuilder);

        UserResponseDTO userResponseDTO = userService.register(userRequestDTO);
        System.out.println("===> userResponseDTO " + userResponseDTO);

        URI uri = uriBuilder.path("/burguer/{id}").buildAndExpand(userResponseDTO.getId()).toUri();
        System.out.println("====> uri " + uri);

        return ResponseEntity.created(uri).body(userResponseDTO);
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<UserResponseDTO> update(@PathVariable(name = "id") Long id, @RequestBody UserRequestDTO userRequestDTO) {
        return ResponseEntity.ok().body(userService.update(id, userRequestDTO));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok().body(userService.delete(id));
    }

}
