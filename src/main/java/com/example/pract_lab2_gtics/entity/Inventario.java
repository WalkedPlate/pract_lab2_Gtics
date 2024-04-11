package com.example.pract_lab2_gtics.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "inventario")

public class Inventario {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idinventario", nullable = false)
    private int idInventario;
    @Column(name = "nombre", nullable = true)
    private String nombre;
    @Column(name = "idtipo", nullable = false)
    private int idTipo;
    @Column(name = "numeroserie", nullable = false)
    private String numeroSerie;
    @Column(name = "idsede", nullable = false)
    private int idSede;
    @Column(name = "idmarca", nullable = false)
    private int idMarca;
    @Column(name = "estado", nullable = true)
    private String estado;


}
