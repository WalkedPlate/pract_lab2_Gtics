package com.example.pract_lab2_gtics.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "sedes")

public class Sede {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="idsede",nullable = false)
    private int idSede;

    @Column(name="nombresede",nullable = true)
    private String nombreSede;

    @Column(name="direccion",nullable = true)
    private String direccion;



}
