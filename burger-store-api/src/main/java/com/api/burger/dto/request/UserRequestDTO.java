package com.api.burger.dto.request;

import java.time.LocalDate;


import lombok.Data;

@Data
public class UserRequestDTO {
//REQUEST => Dados que estão sendo enviados
    private String name;
    private String cpf;
    private String email;
    private LocalDate birthdate;

}
