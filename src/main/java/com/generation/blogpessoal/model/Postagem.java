package com.generation.blogpessoal.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "tb_postagens")
public class Postagem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @NotBlank(message = "O atributo título é Obrigatório e não pode utilizar espaços em branco!")
    @Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
    private String titulo;

    @NotNull(message = "O atributo texto é Obrigatório!")
    @Size(min = 10, max = 1000, message = "O atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
    private String texto;


    @UpdateTimestamp
    private LocalDateTime data;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

}
