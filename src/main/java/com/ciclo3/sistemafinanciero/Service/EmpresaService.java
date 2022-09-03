package com.example.demo.Service;

import com.ciclo3.sistemafinanciero.Model.Empresa;

import java.util.List;

public interface EmpresaService {
    public List<Empresa> findAll();
    public Empresa findById(long Id);
    public void save(Empresa empresa);
    public void deleteById(long Id);
}
