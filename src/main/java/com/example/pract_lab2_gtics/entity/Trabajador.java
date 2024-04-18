package com.example.pract_lab2_gtics.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "trabajadores")


public class Trabajador {

    @Id
    @Column(name="dni",nullable = false)
    private String dni;

    @Column(name="nombres",nullable = false)
    private String nombres;
    @Column(name="apellidos",nullable = false)
    private String apellidos;
    @Column(name="correo",nullable = false)
    private String correo;
    @Column(name="idsede",nullable = false)
    private Integer idSede;
}
