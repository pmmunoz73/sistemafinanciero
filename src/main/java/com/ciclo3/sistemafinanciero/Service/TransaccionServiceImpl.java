package com.ciclo3.sistemafinanciero.Service;

import com.ciclo3.sistemafinanciero.Model.Transaccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionServiceImpl implements  TransaccionService {
@Autowired
@Override
public List<Transaccion> findAll(){
    List<Transaccion> listTransaccion=transaccionDAO.finAll();
    return listTransaccion;
}
@Override
    public Transaccion findById(long Id){
    Transaccion transaccion=transaccionDAO.findByID(Id);
    return transaccion;
}

@Override
    public void save(Transaccion transaccion){
    transaccionDAO.save(transaccion);
}
@Override
    public void deleteById(long Id){
    transaccionDAO.deleteById(Id);
}
}
