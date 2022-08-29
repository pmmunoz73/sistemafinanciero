package com.example.demo.Service;

import com.ciclo3.sistemafinanciero.Model.Empleado;

import java.util.List;

public interface EmpleadoService {
    public List<Empleado> findAll();
    public Empleado findById(long id);
    public void save(Empleado empleado);
    public void deleteById(long id);
}
