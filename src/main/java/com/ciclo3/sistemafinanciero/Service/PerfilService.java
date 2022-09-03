package com.ciclo3.sistemafinanciero.Service;

import java.util.List;

public interface PerfilService {
    public List<Perfil> findAll();
    public Perfil findById(long Id);
    public void save(Perfil perfil);
    public void deleteById(long Id);
}
