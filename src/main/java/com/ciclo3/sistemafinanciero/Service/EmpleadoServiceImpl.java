package com.ciclo3.sistemafinanciero.Service;

import com.ciclo3.sistemafinanciero.Model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpleadoServiceImpl implements  EmpleadoService {
@Autowired
@Override
public List<Empleado> findAll(){
    List<Empleado> listEmpleado=empleadoDAO.finAll();
    return listEmpleado;
}
@Override
    public Empleado findById(long Id){
    Empleado empleado=empleadoDAO.findByID(Id);
    return empleado;
}

@Override
    public void save(Empleaado empleado){
    empleadoDAO.save(empleado);
}
@Override
    public void deleteById(long Id){
    empleadoDAO.deleteById(Id);
}
}
