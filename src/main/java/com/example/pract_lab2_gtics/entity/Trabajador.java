package com.example.pract_lab2_gtics.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "trabajador")


public class Trabajador {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="dn1",nullable = false)
    private String dni;
}
