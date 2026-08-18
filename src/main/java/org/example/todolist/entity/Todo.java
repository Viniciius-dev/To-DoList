package org.example.todolist.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "todos")
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private boolean realizado;
    private int prioridade;
}
