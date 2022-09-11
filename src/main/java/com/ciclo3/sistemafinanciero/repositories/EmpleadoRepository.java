package com.ciclo3.sistemafinanciero.repositories;

import com.ciclo3.sistemafinanciero.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {



    //Optional<Empleado> findAllById(Long id);
}
