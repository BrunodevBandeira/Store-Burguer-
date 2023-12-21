package com.api.burger.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_food")
@Data
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long user_id;

    private String hamburger;

    private String drink;

    private String batata;

    //portions = porções
    private String portions;
    
    //sauces => molhos
    private String sauces;


    // O atributo user representa o usuário a que esse alimento pertence.
    // @JoinColumn(name = "user_id") especifica a coluna na tabela de alimentos que será usada como chave estrangeira para mapear a relação.
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    /*
     * a anotação @CascadeType.ALL na classe User indica que operações de cascata (como salvar, atualizar, excluir) devem ser propagadas para os alimentos associados. Isso significa que, por exemplo, se você salvar um usuário, os alimentos associados também serão salvos automaticamente.
     */



    
}
