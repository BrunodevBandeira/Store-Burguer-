package com.api.burger.dto.response;

import java.time.LocalDate;
import com.api.burger.entity.User;
import lombok.Data;

@Data
public class UserResponseDTO {
    // RESPONSE => respostas do banco

    private Long id;
    private String name;
    private String cpf;
    private String email;
    private LocalDate birthdate;

    public UserResponseDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.cpf = user.getCpf();
        this.email = user.getEmail();
        // this.birthdate = user.getBirthdate();
    }

}
