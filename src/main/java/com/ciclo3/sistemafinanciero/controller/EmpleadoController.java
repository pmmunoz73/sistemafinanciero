package com.ciclo3.sistemafinanciero.controller;
import com.ciclo3.sistemafinanciero.model.Empleado;
import com.ciclo3.sistemafinanciero.model.Empresa;
import com.ciclo3.sistemafinanciero.repositories.EmpleadoRepository;
import com.ciclo3.sistemafinanciero.repositories.EmpresaRepository;
import com.ciclo3.sistemafinanciero.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmpleadoController {

    @Autowired //conecta la clase con el repository de Empresa
    EmpleadoService empleadoService; //Crea objeto de tipo empleadoRepository para usar los metodos de dicha clase

  @GetMapping("/users")//Ver todos lo usuarios json
    public List<Empleado> verEmpleado(){
        return empleadoService.getAllEmpleado();

    }

    @PostMapping("/users")//Guardar empleado
    public Optional<Empleado> guardarEmpleado(@RequestBody Empleado empleado){
      return Optional.ofNullable(this.empleadoService.saveOrUpdateEmpleado(empleado));

    }


}
