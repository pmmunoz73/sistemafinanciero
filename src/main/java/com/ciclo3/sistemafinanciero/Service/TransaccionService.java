package com.example.demo.Service;

import com.ciclo3.sistemafinanciero.Model.Transaccion;

import java.util.List;

public interface TransaccionService {
    public List<Transaccion> findAll();
    public Transaccion findById(long id);
    public void save(Transaccion transaccion);
    public void deleteById(long id);
}
