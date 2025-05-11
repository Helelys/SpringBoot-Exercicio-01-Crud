package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;
    private String descricao;
    private double preco;
}
