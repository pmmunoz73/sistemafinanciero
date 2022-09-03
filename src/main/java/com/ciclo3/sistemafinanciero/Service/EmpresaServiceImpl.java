package com.example.demo.Service;

import com.ciclo3.sistemafinanciero.Model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImpl implements  EmpresaService {
@Autowired
@Override
public List<Empresa> findAll(){
    List<Empresa> listEmpresa=empresaDAO.finAll();
    return listEmpresa;
}
@Override
    public Empresa findById(long Id){
    Empresa empresa=empresaDAO.findByID(Id);
    return empresa;
}

@Override
    public void save(Empresa empresa){
    empresaDAO.save(empresa);
}
@Override
    public void deleteById(long Id){
    empresaDAO.deleteById(Id);
}
}
