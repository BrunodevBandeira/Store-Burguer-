package com.api.burger.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "tb_user")
@Data
public class User {
    // (nullable = false) => indicando que ela não pode ter valores nulos 
    // (unique = true) => todos os valores devem ser únicos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cpf", nullable = false,  unique = true)
    private String cpf;

    @Column(name = "email", nullable = false)
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Food> foods;

    /*
     * A propriedade mappedBy = "user" indica que a relação é mapeada pelo campo user na classe Food.
     */

    

    @Column(name = "id", nullable = false, unique = true)
    private LocalDate birthdate;

    @Builder
    public User(Long id, String name, String cpf, String email, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.birthdate = birthdate;
    }

    

}


/*
 * @Setter(AccessLevel.NONE) especifica que nenhum método setter público deve ser gerado para a propriedade id. Isso significa que não será possível modificar o valor da propriedade id diretamente fora da classe. Isso é útil para garantir que a identidade de uma entidade (como um ID) não seja alterada após ter sido atribuída.
 */