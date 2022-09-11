package com.ciclo3.sistemafinanciero.service;

import com.ciclo3.sistemafinanciero.model.Empleado;
import com.ciclo3.sistemafinanciero.model.Empresa;
import com.ciclo3.sistemafinanciero.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

   @Autowired
    EmpleadoRepository empleadoRepository;

    //Metodo que retorna lista de empleados con metodos heredados del jpa Repository
    public List<Empleado> getAllEmpleado() {
        List<Empleado> empleadoList = new ArrayList<>();
        empleadoRepository.findAll().forEach(Empleado -> empleadoList.add(Empleado)); //Recorre iterable que regresa metodo finAll y lo guarda en lista empresa
        return empleadoList;
    }

    //Metodo que trae objeto tipo Empleado por id
    public Optional<Empleado> getEmpleadoById(Long id){

        return empleadoRepository.findById(id);
    }

    //Metodo que guarda o actualiza objeto tipo empleado
    public Empleado saveOrUpdateEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);

    }

    //Metodo que elimina objeto tipo empleado
    public boolean deleteEmpleado(Long id){
        empleadoRepository.deleteById(id);

        if (this.empleadoRepository.findById(id).isPresent()){
            return false;
        }
        return true;
    }

}
