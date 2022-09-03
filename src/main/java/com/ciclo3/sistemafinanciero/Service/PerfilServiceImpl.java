package com.ciclo3.sistemafinanciero.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilServiceImpl implements  PerfilService {
@Autowired
@Override
public List<Perfil> findAll(){
    List<Perfil> listPerfil=perfilDAO.finAll();
    return listPerfil;
}
@Override
    public Perfil findById(long Id){
    Perfil perfil=perfilDAO.findByID(Id);
    return perfil;
}

@Override
    public void save(Perfil perfil){
    perfilDAO.save(perfil);
}
@Override
    public void deleteById(long Id){
    perfilDAO.deleteById(Id);
}
}
