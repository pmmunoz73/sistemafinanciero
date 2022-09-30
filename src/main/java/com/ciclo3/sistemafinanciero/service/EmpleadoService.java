package com.ciclo3.sistemafinanciero.service;

import com.ciclo3.sistemafinanciero.model.Empleado;
import com.ciclo3.sistemafinanciero.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    //Metodo para ver todos los empleados registrados
    public List<Empleado> getAllEmpleado(){
        List<Empleado> empleadoList= new ArrayList<>();
        empleadoRepository.findAll().forEach(empleado -> empleadoList.add(empleado));
        return empleadoList;
    }

    //Metodo para buscar empleados por ID
    public Optional<Empleado> getEmpleadoById(Integer id){ //Existe optional y asi se podria usar

        return empleadoRepository.findById(id);
    }

    //Metodo para buscar empleados por empresa
    public ArrayList<Empleado> obtenerPorEmpresa(Integer id){
        return empleadoRepository.findByEmpresa(id);
    }

    //Metodo para guardar o actualizar registros en Empleados
    public boolean saveOrUpdateEmpleado(Empleado empl){
        Empleado emp=empleadoRepository.save(empl);
        if (empleadoRepository.findById(emp.getId())!=null){
            return true;
        }
        return false;
    }

    //Metodo para eliminar un registro de Empleado por Id
    public boolean deleteEmpleado(Integer id){
        empleadoRepository.deleteById(id);
        if(this.empleadoRepository.findById(id).isPresent()){
            return false;
        }
        return true;
    }

    public Empleado createUser(Empleado newEmpleado) {
        return this.empleadoRepository.save(newEmpleado);
    }

    public Empleado findUserBycorreo(String correo) {
        return this.empleadoRepository.findBycorreo(correo);
    }
    public Empleado getOrCreateUser(Map<String, Object> userData){
        String correo = (String) userData.get("correo");
        Empleado empleado = findUserBycorreo(correo);
        if (empleado == null) {
            String name = (String) userData.get("name");
            String image = (String) userData.get("picture");
            String auth0Id = (String) userData.get("sub");

            Empleado newEmpleado = new Empleado();
            return createUser(newEmpleado);
        }
        return empleado;
    }

}
