package com.example.pract_lab2_gtics.repository;


import com.example.pract_lab2_gtics.entity.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario,Integer> {
}
