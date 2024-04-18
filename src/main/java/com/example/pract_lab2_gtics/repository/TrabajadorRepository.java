package com.example.pract_lab2_gtics.repository;

import com.example.pract_lab2_gtics.entity.Trabajador;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajador,Integer> {

    List<Trabajador> findByIdSede(Integer idSede);
    Optional<Trabajador> findByDni(String dni);
    public abstract void deleteByDni(String dni);

}
