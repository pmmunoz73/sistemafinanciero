package com.ciclo3.sistemafinanciero.modelo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmpresa;
    @Column(name = "Nombre", unique = true)
    private String nombre;
    @Column(name = "Documento", unique = true)
    private String documento;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Direccion")
    private String direccion;
    @OneToMany(mappedBy = "empresa")
    private List<Empleado> empleados;
    @OneToMany(mappedBy = "empresa")
    private List<Transaccion> transacciones;
    @Column(name = "fecha_Creacion")
    private Date fechaCreacion;
    @Column(name = "fecha_Actualizacion")
    private Date fechaActualizacion;

    public Empresa() {
    }

    public Empresa(long idEmpresa, String nombre, String documento, String telefono, String direccion,
                   List<Empleado> empleados, List<Transaccion> transacciones, Date fechaCreacion,
                   Date fechaActualizacion) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.empleados = empleados;
        this.transacciones = transacciones;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public long getIdEmpresa() {        
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {        
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {        
        return nombre;
    }

    public void setNombre(String nombre) {        
        this.nombre = nombre;
    }

    public String getDocumento() {        
        return documento;
    }

    public void setDocumento(String documento) {        
        this.documento = documento;
    }

    public String getTelefono() {        
        return telefono;
    }

    public void setTelefono(String telefono) {        
        this.telefono = telefono;
    }

    public String getDireccion() {        
        return direccion;
    }

    public void setDireccion(String direccion) {        
        this.direccion = direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
